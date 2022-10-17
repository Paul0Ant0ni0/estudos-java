package aulas.correcao;

import java.util.Scanner;

public class Correcao03 {

    public static void main(String[] args) {
        //Entrada dos Dados
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite o valor de v1:");
        for (int i = 0; i < tamanho; i++){
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite o valor de v2:");
        for (int i = 0; i < tamanho; i++){
            v2[i] = entrada.nextInt();
        }

        //Processamento de dados
        //v1 = [1, 2, 3] e v2 = [1, 3, 2] foram 1 encontratdo (s)
        int encontros = 0;

        for (int i = 0; i < tamanho; i++){
            if (v1[i] == v2[i]){
                encontros++;
            }
        }

        System.out.println("O número de encontros é :" + encontros);
    }
}
