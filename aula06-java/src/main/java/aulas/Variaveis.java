package aulas;

public class Variaveis {
    //Execução do programa JAVA
    public static void main(String[] args){
        System.out.println("Hello, world"); // equivale ao console.log

        // Variáveis no Java
        //Fortemente tipado e estaticamente tipado

        //Declaração de variável
        //tipo nome = valor

        int idade = 29; // inteiro
        double salario = 4500.00; // dupla precisão
        float nota = 7.51f; // sufixo para float
        long populacaoTerra = 7_900_000_000L;
        boolean tarefaConcluida = false; // true ou false
        int i = 1, j = 0, k = 1000; // multiplas variáveis
        String nomecompleto = "José almir";

        int teste = 10;
        teste = 9; // reatribução de variaveis

        final int teste2 = 200; //impossivel mudar o valor, por causa do final


        //Operadores

        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b; // 2

        System.out.println("O resultado da soma é " + soma); // *O resultado da soma é 15

        //A DIVISÃO ENTRE DOIS INTEIROS O RESULTADO SERÁ INTEIRO

        int sete = 7; //Constante literal
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois; // 3.0
        System.out.println(resultado);
        double resultado2 = sete / dois2; // 3.5
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);

        //Casting - Conversão de valores - (tipo) != Conversão de variáveis
        //Mas, pode ocorrer perda de valores

        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7 / 2.0

        //Operadores 2

        int valor = 5;
        valor++; // incremento
        valor--; // decremento
        ++valor; // pre-incremento
        --valor; // pre-decremento
        valor += 10; // valor = valor + 10 atribuição

        // Operadores relacionais

        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 5 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        // Operadores lógicos

        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 =  (5 > 10) && (10 < 5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; // false





    }
}
