package aulas.correcao;

import java.util.Scanner;

public class Correcao04 {

    public class exercicio4 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual sua idade?");
            int idade = entrada.nextInt();

            if (idade < 18) {
                System.out.println(" Voce é menor de idade");
            } else {
                System.out.println(" Voce é maior de idade");
            }
        }
    }

}
