/* 
  2º Trabalho Prático – Controle de Vendas
  Turma: 2ºCiclo ADS Vespertino
  Grupo:
  	1 - Eric Kida Meneses Correa;
  	2 - Gabriel Dos Santos Santana;
  	3 - Matheus Calixto De Oliveira.
  
  */

package TpTeste;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
// Importar:
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TpTeste implements Serializable{
	private long cpf;
	private String cliente;
	private long telefone;
	private String dataCompra;
	private float valorCompra;
	private long cpfComprador;
	private String nomeComprador;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		int op2 = 0;
		int op3 = 0;
		do {
			System.out.println("Controle de Vendas");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Exibir Clientes");
			System.out.println("3 - Consultar por Cliente");
			System.out.println("4 - Cadastrar Compras");
			System.out.println("5 - Listar Compras Por Data");
			System.out.println("6 - Listar Compras Por Cliente");
			System.out.println("7 - Importar arquivo");
			System.out.println("8 - Exportar arquivo");
			System.out.println("0 - Sair");
			System.out.println("Qual Opção deseja?: ");
			op = in.nextInt();
			switch (op) {
			case 1:
				cadastrarClientes();
				break;
			case 2:
				exibirClientes();
				break;
			case 3:
				consultarClientes();
				break;
			case 4:
				cadastrarCompras();
				break;
			case 5:
				listarComprasPorData();
				break;
			case 6:
				listarComprasPorCliente();
				break;
			case 7:
				System.out.println("1 - Importar dados dos Clientes");
				System.out.println("2 - Importar dados de Compras");
				System.out.println("Qual Opção deseja?: ");
				op2 = in.nextInt();
				switch(op2) {
				case 1:
					ImportarDadosClientes();
					break;
				case 2:
					importarDadosCompras();
					break;
				case 0:
					break;
				default:
					System.out.println("Não é uma opção válida!");
				}
				break;
			case 8:
				System.out.println("1 - Exportar dados dos Clientes");
				System.out.println("2 - Exportar dados de Compras");
				op3 = in.nextInt();
				switch(op3) {
				case 1:
					exportarDadosClientes();
					break;
				case 2:
					exportarDadosCompras();
					break;
				default:
					System.out.println("Não é uma opção válida!");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Não é uma opção válida!");
			}
		} while (op != 0);
		in.close();
	}
	
	// lista todos os clientes presentes no arquivo
	private static void exibirClientes() {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){
			while (true) {
				TpTeste t = (TpTeste) input.readObject();
				System.out.println("CPF: "+ t.cpf + " Nome: " + t.cliente + " Telefone: " +t.telefone);
			}
			
		} catch (EOFException e) {
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e) {
			System.out.println("Erro Encontrado (verifique a existencia de registros)");
		} 
	} //fim de exibirClientes

	// Cadastra clientes no arquivo .dat
	private static void cadastrarClientes() {
		TpTeste t = new TpTeste();
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("CPF: ");
			t.cpf = in.nextLong();
			while (cpfCadastrado(t.cpf) != null) {
				System.out.println("CPF já cadastrado!");
				System.out.print("CPF: ");
				t.cpf = in.nextLong();
			}
			System.out.print("Cliente: ");
			in.nextLine();
			t.cliente = in.nextLine();
			System.out.print("Telefone: ");
			t.telefone = in.nextLong();
			Path path = Paths.get("clientes.dat");
			if (Files.exists(path)) {
				try (FileOutputStream fos = new FileOutputStream("clientes.dat", true);
						AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
					output.writeObject(t);
				} catch (FileNotFoundException e) {
					System.out.println("Impossivel abrir clientes.dat!");	
				} catch (IOException e) {
					System.out.println("Impossivel ler clientes.dat!");
				}
			} else {
				try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
					output.writeObject(t);
				} catch (IOException e) {
					System.out.println("Impossivel ler clientes.dat!");
				}
			}
		} catch (InvalidPathException e) {
			System.out.println("Não foi possivel encontrar o arquivo clientes.dat");
		}
	}//fim de cadastrarClientes
	
	// Busca por clientes cadastrados, filtrando pelo nome digitado
	private static void consultarClientes() {
		int contEnc = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome a ser buscado: ");
		String nome = in.nextLine();
		System.out.println("resultado: " .concat(nome));
				
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){					

			while (true) {
				TpTeste t = (TpTeste) input.readObject();
				String pnome = "";
				String teste = t.cliente;
				String[] array = teste.split(" ");
				for(int i = 0; i <= array.length - 1; i++) {
					if(i == 0) {
						pnome = array[i];
					}
				}
				if(pnome.compareToIgnoreCase(nome) == 0) {
					System.out.println("Nome: " + teste + " CPF: " + t.cpf + " Telefone: " + t.telefone);
					contEnc = contEnc+1;
				}
						
			}	
					
		} //try		
		catch (EOFException e) {
			if(contEnc == 0) {
				System.out.print("Nenhum cliente encontrado com este CPF\n");
			}
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return;
		
	} //fim de consultarClientes
	
	// busca clientes de acordo com cpf valido, para adicionar compras
	private static long buscaPorCPF() {
		int contEnc = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o CPF do comprador: ");
		long numCpf = in.nextLong();
		long cpfcadastrado = 0;
		
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){
			while (contEnc == 0) {
				TpTeste t = (TpTeste) input.readObject();
				cpfcadastrado = t.cpf;
				if(cpfcadastrado == numCpf) {
					contEnc = contEnc+2;
					System.out.println("CPF referente ao cliente: ");
					System.out.printf("CPF: " + t.cpf + " Nome:" + t.cliente);
					System.out.println(" ");
				}
				else {
					cpfcadastrado = 0;
				}
			}	
		}//try	
		
		catch (EOFException e) {
			if(contEnc == 0) {
				System.out.print("Nenhum registro encontrado\n");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return cpfcadastrado;
	} //fim de buscaPorCPF
	
	//Busca o nome do cliente cadastrado com um determinado CPF
	private static String buscaPorNome(long cpf) {
		int contEnc = 0;
		Scanner in = new Scanner(System.in);
		long numCpf = cpf;
		long cpfcadastrado = 0;
		String nomeDoComprador = "";
		
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){

			while (contEnc == 0) {
				TpTeste t = (TpTeste) input.readObject();
				cpfcadastrado = t.cpf;
				if(cpfcadastrado == numCpf) {
					contEnc = contEnc+2;
					nomeDoComprador = t.cliente;
				}
				else {
					cpfcadastrado = 0;
				}
			}
		}
		catch (EOFException e) {
			if(contEnc == 0) {
			}
		} catch (ClassNotFoundException e) {
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		return nomeDoComprador;
	} //fim de BuscaPorNome
	
	// Responsavel por cadastrar as compras, seguindo as regras pré estabelecidas
	private static void cadastrarCompras() {
		TpTeste t = new TpTeste();
		Scanner in = new Scanner(System.in);
		try {
			
			long cpfvalidado = buscaPorCPF();
			if(cpfvalidado > 0) {
				t.nomeComprador = buscaPorNome(cpfvalidado);
				t.cpfComprador = cpfvalidado;
				System.out.println("Informe a data da compra (com formatação dd/mm/yy): ");
				t.dataCompra = in.nextLine();
				while(t.valorCompra <= 0) {
					System.out.println("Informe o valor da compra: ");
					t.valorCompra = in.nextFloat();
					if(t.valorCompra <= 0) {
						System.out.println("O valor deve ser maior do que zero!");
					}
					else {
						Path path = Paths.get("compras.dat");
						if (Files.exists(path)) {
							try (FileOutputStream fos = new FileOutputStream("compras.dat", true);
									AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
								output.writeObject(t);
							} catch (FileNotFoundException e) {
								System.out.println("Impossivel abrir compras.dat!");	
							} catch (IOException e) {
								System.out.println("Impossivel ler compras.dat!");
							}
						} else {
							try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
								output.writeObject(t);
							} catch (IOException e) {
								System.out.println("Impossivel ler compras.dat!");
							}
						}
					}
				}
			}		
		}//try
		catch (InvalidPathException e) {
			System.out.println("Não foi possivel encontrar o arquivo compras.dat");
		}
	}//fim de cadastrarCompras
	
	// Lista todas as compras realizadas em uma data especifica
	private static void listarComprasPorData() {
		float valorTotal = 0;
		int contEnc = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a data a ser buscada: ");
		String databusc = in.nextLine();
		System.out.println("resultado p/ data: " .concat(databusc));
		
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))){
			

			while (true) {
				TpTeste t = (TpTeste) input.readObject();
				String dt = t.dataCompra;
				t.nomeComprador = buscaPorNome(t.cpfComprador);
				
				if(dt.compareToIgnoreCase(databusc) == 0) {
					
					System.out.printf("CPF: " + t.cpfComprador + " Nome: " + t.nomeComprador + " Valor: R$"+ t.valorCompra);
					contEnc = contEnc+1;
					valorTotal = valorTotal + t.valorCompra;
				}
				
			}
			
			
		} catch (EOFException e) {
			if(contEnc == 0) {
				System.out.print("Nenhum registro na data em questão\n");
			}
			else {
				System.out.println("\nTotal do dia: " + valorTotal);
			}
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		return;
	} //fim de ListarPorData

	//lista todas as compras de um determinado cliente, atraves do CPF
	private static void listarComprasPorCliente() {
		float valorTotal = 0;
		int contEnc = 0;
		String nomecomp = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o CPF a ser buscado: ");
		long cpfbusc = in.nextLong();
		System.out.println("resultado p/ CPF: "+ cpfbusc);
		
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))){		
			
			while (true) {
				TpTeste t = (TpTeste) input.readObject();
				long cpf = t.cpfComprador;
				if(cpfbusc == cpf) {
					
					System.out.println("Nome: " + t.nomeComprador + " Data: " + t.dataCompra + " Valor: R$" + t.valorCompra);
					contEnc = contEnc+1;
					valorTotal = valorTotal + t.valorCompra;
					nomecomp = t.nomeComprador;
				}
				
			}
			
			
		} catch (EOFException e) {
			if(contEnc == 0) {
				System.out.print("O cliente não comprou nada\n");
			}
			else {
				System.out.println("Total comprado pelo Cliente "+ nomecomp +": " + valorTotal);
			}
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		return;
	} //fim de listarPorCliente

	// verifica se o cpf esta cadastrado, para restrições
	private static TpTeste cpfCadastrado(long cpf) {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))) {
			while (true) {
				TpTeste t = (TpTeste) input.readObject();
				if (t.cpf == cpf) {
					return t;
				}
			}
		} catch (EOFException e) {
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Ocorreu um Erro na leitura do arquivo");
		}
		return null;
	} //fim de cpfcadastrado
	
	
	//Importa os dados de clientes
	private static void ImportarDadosClientes() {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o caminho para o arquivo a ser importado (deve ser preciso): ");
		String caminho = in.nextLine();
		/* final String DELIMITER = ","; */
		List<String[]> gravacoes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader(caminho))) {
			String line;
			while ((line = br.readLine()) != null) {
				TpTeste t = new TpTeste();
				String[] values = line.split(",");
				gravacoes.add(values);
				long conv1 = Long.parseLong(values[0]);
				long conv2 = Long.parseLong(values[2]);
				t.cpf = conv1;
				t.nomeComprador = buscaPorNome(t.cpf);
				t.cliente = values[1];
				t.telefone = conv2;
				Path path = Paths.get("clientes.dat");
				if (Files.exists(path)) {
					try (FileOutputStream fos = new FileOutputStream("clientes.dat", true);
							AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
						output.writeObject(t);
					} catch (FileNotFoundException e) {
						System.out.println("Impossivel abrir clientes.dat!");	
					} catch (IOException e) {
						System.out.println("Impossivel ler clientes.dat!");
					}
				} else {
					try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
						output.writeObject(t);
					} catch (IOException e) {
						System.out.println("Impossivel ler clientes.dat!");
					} catch (Exception e) {
						System.out.println("TESTE");
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto");
		} catch (IOException e) {
			System.out.println("Erro de leitura/gravacao: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("TESTE");
		}
		for(String[] linha : gravacoes) {
			for(String s : linha) {
				System.out.print(s + " ");
				
			}
			System.out.println();
		}
	}//fim de ImportarClientes
		
	//importa os dados de compra
	private static void importarDadosCompras() {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o caminho para o arquivo a ser importado (deve ser preciso): ");
		String caminho = in.nextLine();
		/* final String DELIMITER = ","; */
		List<String[]> gravacoes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader(caminho))) {
			String line;
			while ((line = br.readLine()) != null) {
				TpTeste t = new TpTeste();
				String[] values = line.split(",");
				gravacoes.add(values);
				//Cpf comprador
				long conv1 = Long.parseLong(values[0]);
				
				float conv2 = Float.parseFloat(values[2]);
				t.cpfComprador = conv1;
				t.dataCompra = values[1];
				t.valorCompra = conv2;
				Path path = Paths.get("compras.dat");
				if (Files.exists(path)) {
					try (FileOutputStream fos = new FileOutputStream("compras.dat", true);
							AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
						output.writeObject(t);
					} catch (FileNotFoundException e) {
						System.out.println("Impossivel abrir compras.dat!");	
					} catch (IOException e) {
						System.out.println("Impossivel ler compras.dat!");
					}
				} else {
					try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
						output.writeObject(t);
					} catch (IOException e) {
						System.out.println("Impossivel ler compras.dat!");
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto");
		} catch (IOException e) {
			System.out.println("Erro de leitura/gravacao: " + e.getMessage());
		}
		for(String[] linha : gravacoes) {
			for(String s : linha) {
				System.out.print(s + " ");
				
			}
			System.out.println();
		}
	} //fim de importarCompras
	
	//Exporta os dados de clientes que já foram criados
	private static void exportarDadosClientes() {
		Scanner in = new Scanner(System.in);
		int cont = 0;
		System.out.println("Insira o caminho e/ou nome p arquivo a ser exportado");
		String caminho = in.nextLine();
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){
			while (true) {
				TpTeste a = (TpTeste) input.readObject();
				cont = cont+1;
			}
			
		} catch (EOFException e) {
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String[]> records = new ArrayList<>();
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))){
			String cliente = "";
			String cpfcliente = "";
			String telefonecliente = "";
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
					while (true) {
						TpTeste t = (TpTeste) input.readObject();
						
						System.out.println("CPF: "+ t.cpf + " Nome: " + t.cliente + " Telefone: " +t.telefone);
			    			cliente = ""+t.cliente;
			    			cpfcliente = ""+t.cpf;
			    			telefonecliente = ""+t.telefone;
			    			bw.write(cpfcliente);
			    			bw.write(",");
			    			bw.write(cliente);
			    			bw.write(",");
			    			bw.write(telefonecliente);
			    			bw.write("");
			    			bw.newLine();
					}
			    	
			    }catch (IOException e) {
			    	System.out.println("Erro de leitura/escrita existentes: " + e.getMessage());
			    }	
			    
		} catch (EOFException e) {
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 	
	} //fim de exportarClientes
	
	private static void exportarDadosCompras() {
		Scanner in = new Scanner(System.in);
		int cont = 0;
		System.out.println("Insira o caminho e/ou nome p arquivo a ser exportado");
		String caminho = in.nextLine();
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))){
			while (true) {
				TpTeste a = (TpTeste) input.readObject();
				cont = cont+1;
			}
			
		} catch (EOFException e) {
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String[]> records = new ArrayList<>();
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))){
			String data = "";
			String cpfcliente = "";
			String valor = "";
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
					while (true) {
						TpTeste t = (TpTeste) input.readObject();
						
						System.out.println("CPF: "+ t.cpfComprador + " data: " + t.dataCompra + " valor: " +t.valorCompra);
			    			data = ""+t.dataCompra;
			    			cpfcliente = ""+t.cpfComprador;
			    			valor = ""+t.valorCompra;
			    			bw.write(cpfcliente);
			    			bw.write(",");
			    			bw.write(data);
			    			bw.write(",");
			    			bw.write(valor);
			    			bw.write("");
			    			bw.newLine();
					}
			    	
			    }catch (IOException e) {
			    	System.out.println("Erro de leitura/escrita existentes: " + e.getMessage());
			    }	
			    
		} catch (EOFException e) {
			System.out.println("Fim da Listagem :) ");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 	
	} //fim de exportarCompras

}
