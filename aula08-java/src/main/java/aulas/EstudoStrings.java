package aulas;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // String são cadeias de caracteres
        // "Jose" -> J = 0, o = 1, s = 2, e = 3
        String nome = "Pedro";

        if(nome == "Pedro"){
            System.out.println("São iguais!");
        }

        System.out.println("Digite o seu sobrenome: ");
        String sobronome = entrada.nextLine();

        if (sobronome.equals("Pereira")){
            System.out.println("São iguais!");
        }else {
            System.out.println("São diferentes!");
        }

        // sobronome.equalsIgnoreCase("pereira"); // ignora maiúscula e minúscula

        //outros metodos
        String java = "Java";
        // Fatiando/cortando string
        String jar = java.substring(0, 2); // começa do 0 e vai até o 2 (não incluso)
        String va = java.substring(2); // corta do 2 até o final da string

        System.out.println(jar);
        System.out.println(va);

        String m1 = "Hello, ";
        String m2 = "world";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres possui
        System.out.println(java.isEmpty()); // verifica se está vazio => ""
        System.out.println(java.toUpperCase()); // JAVA em caixa ALTA
        System.out.println(java.toLowerCase()); //java em caixa baixa

        System.out.println("Digite o seu nome: ");
        String seuNnome = entrada.nextLine();

        if (seuNnome.toUpperCase().equals("JOSE")){
            System.out.println("SEU NOME É JOSÉ!");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/"); //["13", "10", "2022"]
        System.out.println(valores[0]);

        String email = "josealmir@gmail.com";
        String[] valoresEmail = email.split("@"); // ["josealmir", "gmail.com"]
        System.out.println(valoresEmail[0]);


        String nome2 = "Jose Almir";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanha é sexta-feira";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));




    }
}
