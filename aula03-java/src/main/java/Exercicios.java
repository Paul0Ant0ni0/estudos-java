import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.println("******* Calculadora Simples *******");

        System.out.println("Que tipo de operacao deseja realizar?\n");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicao");
        System.out.println("4 - Divisao");
        System.out.print("Digite aqui: ");
        int operacao = entrada.nextInt();

        System.out.println("\n--------ENTRADA-------\n");
        System.out.print("Digite o primeiro valor: ");
        int v1 = entrada.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = entrada.nextInt();

        int resultado = 0;
        String textOperacao = "";
        String simbolo = "";

        switch (operacao){
            case 1:
                resultado = v1 + v2;
                textOperacao = "Adicao";
                simbolo = " + ";
                break;
            case 2:
                resultado = v1 - v2;
                textOperacao = "Subtracao";
                simbolo = " - ";
                break;
            case 3:
                resultado = v1 * v2;
                textOperacao = "Multiplicacao";
                simbolo = " * ";
                break;
            case 4:
                resultado = v1 / v2;
                textOperacao = "Divisao";
                simbolo = " / ";
                break;
            default:
                System.out.println("Operacao inválida!");
        }

        System.out.println("\n---------Saida---------\n");

        System.out.println("Operacao selecionada : " + textOperacao);
        System.out.println("Resultado: " + v1 + simbolo + v2 + " = " + resultado);*/

        /*
        System.out.println("******* Loop *******");

        for(int i = 1; i <= 2000; i++){
            System.out.println(i);
        }
         */

        /*
        System.out.println("******* Arrays *******");

        int[] v1 = new int[3];
        int[] v2 = new int[3];

        v2[0] = 2;
        v2[1] = 5;

        v1[1] = 2;
        v1[0] = 2;

        int cont = 0;
        for(int i = 0; i < 50; i++){

        }

        System.out.println("O vetores possuem : " + cont);
        */

        System.out.println("******* Status Idade *******");

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        String resultado = (idade > 18) ? "Você é maior de idade!" : "Você é menor de idade!";

        System.out.println(resultado);

    }
}
