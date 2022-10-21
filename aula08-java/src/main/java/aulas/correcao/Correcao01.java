package aulas.correcao; // dentro do pacote aula está o pacote correção
// e dentro de "correcao" está a classe Correcao01

import java.util.Locale;
import java.util.Scanner; // Estou tranzendo a classe Scanner do pacote java.util

public class Correcao01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // caso queira ler o double com ponto
        System.out.println("1 - Adicao\n 2 - Subtracao\n 3 - Multiplicacoa \n 4 - Divisao");
        System.out.println("Digite uma opcao (1 a 4): ");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        double valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        double valor2= entrada.nextInt();

        switch (opcao){
            case 1 -> {
                double soma = valor1 + valor2;
                System.out.println("O resultado da soma é " + soma);
            }
            case 2 -> {
                double subtracao = valor1 + valor2;
                System.out.println("O resultado da subtracao é " + subtracao);
            }
            case 3 -> {
                double multiplicacoa = valor1 * valor2;
                System.out.println("O resultado da subtracao é " + multiplicacoa);
            }
            case 4 -> {
                double divisao = valor1 / valor2;
                System.out.println("O resultado da subtracao é " + divisao);
            }
            default -> {
                System.out.println("Digitou uma opcao invalida!");
            }

        }
    }
}
