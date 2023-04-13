1- Descreva os quatro elementos básicos de repetição controlada por contador.

Switch:Utilizamos o comando switch para avaliar uma expressão contra vários resultados possíveis. A variável deve ser um literal ou uma constante.
Quando encontra uma opção válida, os comandos são executados até um break ser encontrado, o qual transfere o controle para o comando seguinte ao comando switch.

While - Implementa um loop para executar um bloco de comandos sucessivas vezes.
A expressão de comparação é avaliada antes que o laço seja executado.

Do-while: Utilizado quando se quer que o corpo do laço seja necessariamente executado pelo menos uma vez. A expressão de comparação é avaliada depois que o laço for executado. A única diferença entre o while e o do-while é que no segundo, o comando é sempre executado pelo menos uma vez.

For: A ideia é a mesma do while: fazer um trecho de código ser repetido enquanto uma condição continuar verdadeira. Mas, além disso, o for isola também um espaço para inicialização de variáveis e o modificador dessas variáveis.


2- Compare e contraste as instruções de repetição while e for.

 As instruções de repetição "while" e "for" são duas estruturas de controle de fluxo que permitem que um bloco de código seja executado várias vezes com base em uma condição.
 A instrução "while" é mais flexível e pode ser usada quando não se sabe quantas vezes o código precisa ser repetido, ou quando a condição de parada pode mudar durante a execução do loop. Por outro lado, a instrução "for" é mais adequada quando se sabe quantas vezes o código precisa ser repetido e quando é necessário controlar um contador ou índice durante a iteração. Ambas as instruções têm seus usos específicos.



 3- Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.

Uma situação em que seria mais adequado utilizar uma instrução "do...while" em vez de uma instrução "while" é quando é necessário garantir que o bloco de código seja executado pelo menos uma vez, independentemente da condição ser verdadeira ou falsa inicialmente.



4- Compare e contraste as instruções break e continue.

 A instrução "break" é usada para interromper imediatamente a execução de um loop, enquanto a instrução "continue" é usada para pular a iteração atual de um loop e passar para a próxima iteração. Ambas as instruções são usadas para controlar o fluxo de execução em laços, mas de maneiras diferentes: "break" para sair completamente do loop e "continue" para pular apenas a iteração atual e continuar com as próximas iterações.


 5- Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:

a- For (i = 100, i >= 1, i++)
System.out.println(i);

for (i=100; i>=1; i--){
    System.out.println(i);
}



b- O seguinte código deve imprimir se o inteiro value for par ou ímpar:
switch (value % 2) {
case 0:
System.out.println("Inteiro par");
case 1:
System.out.println("Inteiro ímpar");
}

int valor = value % 2;
switch (valor){
case 0:
System.out.println("Inteiro par");
case 1:
System.out.println("Inteiro ímpar");
}




c- O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:
for(i =19; i >=1; i +=2) System.out.println(i);

for (i=19 i>=1; i-=2){
    System.out.println(i);
}



d- O código seguinte deve dar saída dos inteiros pares de 2 a 100:
counter = 2;
do {
System.out.println(counter);
counter += 2;
} while (counter < 100); 


int counter = 2;
do {
    System.out.println(counter);
    counter += 2;
} while (counter <=100);



6- O que o seguinte programa faz?

O programa não compila pois 'inti' e 'intj' não foram declarados, caso fossem, o programa iria imprimir 10 linhas de 5 '@' cada.