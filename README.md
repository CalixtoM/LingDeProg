# LingDeProg

## 💡 Ideia:

Repositório dedicado aos exercicios realizados nas aulas de Linguagem de Programação, do segundo semestre do curso de Análise e Desenvolvimento de Sistemas. Todos os exercicios foram realizados utilizando Java.


## Aula 04-08

1 - Considere as declarações de variáveis em Java abaixo e assinale as instruções que provocam erro:

  * float x;
  * byte y;
  * int z = 5;
  * (   ) x = z;
  * (   ) y = z;
  * (   ) x = 4.25F;
  * (   ) x = z / 2.0;
  * (   ) y = (byte) z.

2 – Escreva um programa em Java que dadas as notas de duas provas de um aluno, determine e im-prima a média aritmética dessas provas.

3 – Desenvolva um programa em Java que dado o raio de um círculo (um inteiro), calcule e impri-ma seu diâmetro, área e circunferência. Sabe-se que:

  * a)Diâmetro: 2R;
  * b)Área do círculo: pR2;
  * c)Circunferência: 2pR.
  
  Dica: use a constante PI da classe Math, para obter o valor de p.

4 - Desenvolva um programa em Java para calcular o volume de um cone dados dois números in-teiros, representado o raio da base do cone (r) e a sua altura (h).

 Sabe-se que o volume do coneé dado por:V=Ab⋅h3onde Ab é a área da base do cone.

5 - Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom.Fazer um programa em Java que leia o valor gasto com despesas realizadas em um restaurantee imprima o valor total da gorjeta.

## Aula 11-08

ex1 - Escreva um programa em Java que dadas as notas de duas provas, calcule e imprima a média aritmética das provas e exiba a mensagem “Aprovado” se a média for maior ou igual a 6, ou “Reprovado”, caso contrário.

ex2 - Um banco concederá um crédito especial aos seus clientes de acordo com o saldo médio do último ano. Faça um programa em Java que receba o saldo médio de um cliente e calcule o valor do crédito, de acordo com a tabela a seguir. Mostre o valor do crédito.

1 - Qual o resultado as expressões lógicas em Java abaixo?

 a)true || false && false
 b)(true || false) && false
 c)5 >= 5 || 7 / 2 > 3 && 8 % 2 == 0
 d)!(3  + 4 * 2 == 14 || (3 + 4) * 2 == 14) && 8 – 10 / 2 > 0 

2 - Considerando A e B duas expressões relacionais em Java, a expressão (!A && B) || (A && !B)assume o valor verdadeiro:
 
 a)para todos os valores de A e de B
 b)sempre que A é igual a B
 c)sempre que A é diferente de B
 d)sempre que A é falso
 e)sempre que B é falso
 
3 - Elimine os testes redundantes dos itens.

4 - Dado o trecho deprograma esquemático em Java abaixo, responda:
 
 a)Quais  comandos   serão  executados   se  cond1  e  cond2  forem  verdadeiras  e  cond3  forfalsa?
 b)Quais   comandos   serão   executados   se   cond1   for   falsa,   cond2   e   cond3   foremverdadeiras?
 c)Quais comandos serão executados se cond1, cond2 e cond3 forem falsas?
 d)Que condições devem ser verdadeiras e quais devem  ser falsas para que  comando4,comando6 e comando7 sejam executados?
 
5 - Para que faixa de valores da variável x o seguinte segmento de código imprime a letra C? 

6 - A prefeitura de Santos abriu uma linha de crédito para funcionários estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um  programa  que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informaro valor da parcela, se o empréstimo pode ou não ser concedido e caso o não possa ser concedido, informar o valor máximo da parcela.

7 - Desenvolva um programa que dados dois números inteiros, imprimi-los em ordem decrescente(suponha números diferentes).

8 - Desenvolva um programa que dados três números inteiros, informe quantos são negativos.

## Aula 25-08

1 - Qual a saída do programa abaixo?

2 - Qual a saída do programa abaixo?

3 - Desenvolva um programa em Java para gerar a seguinte saída usando um laço for:

 2
 4
 6
 8
 10
 Tchau!

4 - Desenvolva um programa em Java para imprimir os múltiplos de 5 no intervalo de 1 a 100.

5 - Desenvolva um programa em Java que dados 10 números, imprima o quadrado de cada um deles.

6 - Desenvolva  um   programa  em   Java  que  dada   uma  coleção   de  números  inteiros  positivos terminada por 0 (zero), imprimir seus quadrados.

7 - Desenvolva um programa em Java que leia um número que será o limite superior de umintervalo e imprimir todos os números pares menores que esse número. Exemplo: Para limite superior = 16 a saída deverá ser 2, 4, 6, 8, 10, 12, 14.

8 - Desenvolva um programa em Java que dados n inteiro e k natural, calcular nk. Não é permitido usar o método Math.pow().

9 - Uma loja de discos anota diariamente durante o mês de março a quantidade de discos vendidos. Desenvolva um programa em Java para determinar em que dia desse mês ocorreu a maior venda e qual foi a quantidade de discos vendida nesse dia.

10 - Escreva   um  programa   que  dado  n,  imprima  os  n  primeiros  números  ímpares  em   ordem decrescente.

33 - A Subindo Bem Confortavelmente (SBC) é uma empresa tradicional, com mais de 50 anos de experiência na fabricação de elevadores. Todos os projetos da SBC seguem as mais estritas normas de segurança, mas infelizmente uma série de acidentes com seus elevadores manchou a reputação da empresa.

Ao estudar os acidentes, os engenheiros da companhia concluíram que, em vários casos, o acidente foi causado pelo excesso de passageiros no elevador. Por isso, a SBC decidiu fiscalizar com mais rigor o uso de seus elevadores: foi instalado um sensor em cada porta que detecta a quantidade de pessoas que saem e entram em cada andar do elevador. A SBC tem os registros do sensor de todo um dia de funcionamento do elevador (que sempre começa vazio). Eles sabem que as pessoas são educadas e sempre deixam todos os passageiros que irão sair em um andar saírem antes de outros passageiros entrarem no elevador, mas ainda assim eles têm tido dificuldade em decidir se a capacidade máxima do elevador foi excedida ou não.

Sua tarefa é escrever um programa que, dada uma sequência de leituras do sensor e a capacidade máxima do elevador, determinar se a capacidade máxima do elevador foi excedida em algum momento.

 - Entrada
A primeira linha da entrada contém dois inteiros N e C, indicando o número de leituras realizadas pelo sensor e a capacidade máxima do elevador, respectivamente (1 ≤ N ≤ 1000 e 1 ≤ C ≤ 1000). As N linhas seguintes contém, cada uma, uma leitura do sensor. Cada uma dessas linhas contém dois inteiros S e E, indicando quantas pessoas saíram e quantas pessoas entraram naquele andar, respectivamente (0 ≤ S ≤ 1000 e 0 ≤ E ≤ 1000).

 - Saída:
Seu programa deve imprimir uma uníca linha contendo o caractere ‘S’, caso a capacidade do elevador tenha sido excedida em algum momento, ou o caractere ‘N’ caso contrário.

34 - Telescópios são instrumentos que auxiliam a observação do céu, melhorando e aumentando o aspecto das estrelas, planetas e outros objetos brilhantes. Existem diversos tipos de telescópios, sendo os tipos mais comuns os de lentes objetivas (refratores) e os de espelhos (refletores).

A maneira como os telescópios melhoram a nossa percepção dos astros no céu é aumentando a quantidade de luz captada que chega aos nossos olhos. Toda luz que entra pelos nossos olhos entra por um orifício chamado pupila. Tal controla a quantidade de luz que entra nos olhos, aumentando o diâmetro quando o ambiente está escuro (e portanto precisamos obter mais luz para identificar os objetos) e diminuindo quando o ambiente está claro. Num ambiente muito escuro, a pupila pode atingir um diâmetro de 8 mm.

Cada objeto celeste (estrela, planeta, nebulosa, etc) emite uma quantidade de luz (fótons) que é homogeneamente distribuída quando chega na Terra. Por exemplo, a estrela A emite luz que pode ser captada a um fluxo de 40.000 fótons por segundo por milímetro quadrado. Isso é, a cada segundo, é possível captar 40.000 fótons provenientes da estrela A numa área de 1 mm 2. Ou seja, uma pupila de 10 mm 2 de área captaria 400.000 fótons provenientes da estrela A por segundo.

Para que nosso cérebro consiga interpretar que existe um objeto ali, porém, ele precisa receber 40.000.000 fótons por segundo. Assim, podemos utilizar um telescópio com lente (ou espelho) de 100 mm 2 de área, que vai captar a quantidade necessária de fótons provenientes da estrela A e encaminhá-los até nossa pupila, fazendo assim com que nosso cérebro perceba a presença da estrela ali.

Dada uma lista com estrelas no céu, o fluxo de fótons que cada uma delas emite, e área de abertura de um telescópio, dizer quantas estrelas serão perceptíveis usando tal telescópio.

 - Entrada:
A primeira linha da entrada terá um inteiro A (1 ≤ A ≤ 10.000) representando a área de abertura do telescópio (em milímetros quadrados) a ser considerado. A segunda linha possui um inteiro N (1 ≤ N ≤ 10.000) representando o número de estrelas a serem estudadas. As N linhas seguintes terão, cada uma, um inteiro F (1 ≤ F ≤ 20.000) representando o fluxo de fótons que cada uma das N estrelas emitem (em fótons por segundo por milímetro quadrado).

 - Saída:
Imprima um inteiro representando a quantidade de estrelas que serão percebidas ao se utilizar o telescópio em questão.

## TP

Como você não compareceu à reunião geral anual do Clube de Alunos da Fatec de Praia Grande (CAFPG), você foi unanimemente eleito para organizar a excursão deste ano para Ilhéus (BA). Você é livre para escolher um fim de semana nesta primavera, e deve encontrar um hotel adequado para a hospedagem, de preferência o mais barato possível. Você tem algumas restrições: O custo total da viagem deve estar dentro do orçamento, é claro. Todos os participantes devem ficar no mesmo hotel, para evitar catástrofes que aconteceram nos anos passados, onde membros se perderam na cidade e nunca mais foram vistos. Escreva um programa em Java para determinar o custo mínimo de um final de semana para o grupo de alunos da Fatec.

### Entrada
A primeira linha da entrada consiste de quatro inteiros:  N  (1 ≤  N≤ 200), que é onúmero de participantes, O(1 ≤ O≤ 500000), que é o orçamento, H (1 ≤ H≤ 18), que é o número de hotéis a considerar, e S (1 ≤ S≤ 13), que é o número de semanas que você pode escolher. Em seguida, há duas linhas para cada um dos H hotéis. A primeira linha fornece um inteiro P (1 ≤ P≤ 10000), que é o preço por uma pessoa se hospedar no fim de semana no hotel. A segunda linha contém S inteiros Ci (0 ≤ Ci≤ 1000, para 1 ≤ i ≤ S), que é o número de camas disponíveis para cada fim de semana no hotel.

### Saída
Imprima o custo mínimo da hospedagem de um grupo em um dos fins de semana. Caso o custo não seja possível para o orçamento, imprima “fique em casa”.

## P1

1 - Atletas conseguem resultados cada vez melhores! O recorde mundial de uma determinada modalidade esportiva é o melhor resultado conseguido por um atleta nessa modalidade, em competições oficiais. Competições oficiais incluem campeonatos mundiais, como os campeonatos mundiais de ginástica, atletismo ou natação, e também as Olimpíadas.
 
Como as Olimpíadas acontecem a cada quatro anos e competições oficiais acontecem todos os anos, é possível que o melhor resultado obtido em Olimpíadas em uma dada modalidade seja um resultado pior do que o recorde mundial para aquela modalidade. Por isso, nas provas das Olimpíadas são sempre mencionados dois recordes: o recorde olímpico (melhor resultado que já foi obtido em Olimpíadas) e o recorde mundial (melhor resultado em qualquer competição oficial, incluindo as Olimpíadas).
 
Nesta tarefa, dados o resultado de uma prova nas Olimpíadas e os recordes mundial e olímpico para essa prova, sua tarefa é escrever um programa em Java para determinar se o resultado é um novo recorde mundial e/ou um novo recorde olímpico.
 
### Entrada
A entrada é composta por três linhas. A primeira linha é um inteiro R, o melhor resultado obtido por um atleta numa prova das Olimpíadas. A segunda linha é um inteiro M, o recorde mundial para essa prova. A terceira linha é um inteiro L, o recorde olímpico para essa prova. Para as provas desta tarefa, quanto menor o valor melhor o resultado.
 
### Saída
Seu programa deve produzir duas linhas. A primeira linha deve ser RM se o resultado é um recorde mundial, ou * (asterisco) caso contrário. A segunda linha deve ser RO se o resultado é um recorde olímpico, ou * (asterisco) caso contrário.

2 - A profa. Vilma preparou uma tarefa de programação sobre a operação de potenciação. Para lembrar, seja um número real n e um número inteiro p igual ou maior do que zero, então a operação de potenciação n elevado a p tem o valor de n multiplicado por ele mesmo p vezes (se p = 0 o resultado da operação de potenciação é 1). Por exemplo,  2³ = 2 × 2 × 2 = 8 e 102⁰ = 1.
 
A tarefa preparada pela profa. Vilma foi a seguinte: Escreva um programa para calcular o valor das seguintes expressões contendo operações de potenciação:
 
2⁴ + 12³
 
300³ + 15² + 4²
 
Veja que cada termo das expressões tem a forma n elevado a p onde n e p são números inteiros e p tem apenas um dígito decimal.
 
No entanto, quando a profa. Vilma colocou o enunciado da tarefa na Internet, a formatação do enunciado foi corrompida, fazendo com que as expressões aparecessem assim para os alunos:
 
24 + 123
 
3003 + 152 + 42
 
Note que por exemplo 2⁴ virou 24, 12³ virou 123, 300³ virou 3003 e assim por diante, ou seja, as operações de potenciação desapareceram!
 
Nesta tarefa, você deve escrever um programa em Java para calcular o valor das expressões da tarefa original da profa. Vilma, sabendo que a formatação do enunciado foi corrompida conforme explicado acima.

### Entrada
A primeira linha da entrada contém um número inteiro N, o número de termos da expressão. Cada uma das N linhas seguintes contém um inteiro Ti, indicando um termo da expressão com formatação corrompida.

### Saída
Seu programa deve produzir uma linha, contendo um único número inteiro, o valor da soma dos termos da expressão, sabendo que a formatação dos termos foi corrompida como explicado acima.

## Aula 29-09

Exemplo 1 - Escreva um programa que dada uma string,  escreva-a de trás para frente.

Exemplo 2 - Escreva um programa que dadas duas strings, exiba-as em ordem alfabética.

Exemplo 3 - Escreva um programa que receba um nome completo e apresente apenas o último sobrenome e o primeiro nome separados por uma vírgula.

# 🛠 PROJETO EM DESENVOLVIMENTO
