import java.util.Scanner;

public class EstudosArrays {

    public static void main(String[] arg){
        int[] numeros = {1, 2, 3, 4, 5}; //Este tipo de array é fixo, não podendo alterar o seu tamanho
        System.out.println(numeros.length); // tamanho do array
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("A posicao de " + i + " com valor de " + numeros[i]);
        }

        // array com tamanho definido
        int[] numeros2 = new int[50]; // 0..49
        numeros2[0] = 500;
        numeros2[1] = -200;
        // ...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira", "Vitor Icoma"};
        String[] sobrenome = new String[10];

        Scanner  entrada= new Scanner(System.in);

        System.out.println("Digite um número :");
        int quatidade = entrada.nextInt();
        boolean[] valores = new boolean[quatidade];

        //Exemplo

        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); // 5

        double[] notaProvas = new double[totalNotas]; // 0..4

        for(int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota ");
            notaProvas[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota : notaProvas){ // for vai interar os valores do array - Ex. o for of no javascript
            soma += nota;
        }
        double media = soma / notaProvas.length;

        // condição ternária
        String mensagem = (media < 7) ? "Você esta reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        //Default values
        int numero; // padrao = 0
        double nota2; // padrao = 0.0
        long populacao; // padrao = 0
        boolean teste; // padrão = false
        String nome; // null => ausência de objeto na variável

        //Wrapper classes
        Integer numero2 = 1;
        Double nota3 = 1.1;
        Long pop2 = 1L;
        Boolean teste2 = false;


    }

}
