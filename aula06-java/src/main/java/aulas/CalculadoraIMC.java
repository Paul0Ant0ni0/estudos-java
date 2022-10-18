package aulas;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //instanciando e criando um objeto Scanner

        System.out.println("******** Calculadora IMC **********\n");

        System.out.println("Qual o seu nome? ");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade ?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura ? (m)");
        double altura = entrada.nextDouble(); // Utilizar vírgula para números decimais

        System.out.println("Qual o seu peso? (kg)");
        double peso = entrada.nextDouble();

        // Calcule o IMC = PESO / ALTURA * 2

        double imc = peso / (altura * altura); //peso /Math.pow(altura, 2.0);

        System.out.println("Olá o meu nome é " + nome + " e tenho " + idade + " anos");
        System.out.println("Este é o seu IMC = " + imc);

        //System.out.printf() - print na tela e formatado - %s String - %f decimais %d inteiros
        System.out.printf("Este é o seu IMC = %.2f\n", imc); // %.2f para 2 casas decimais
        System.out.printf("Olá meu nome é %s e tenho %d anos !\n", nome, idade);

        if (imc < 17) {
            System.out.println("Muit abaixo do peso!");

        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso!");

        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal!");

        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");

        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");

        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa");

        } else {
            System.out.println("Obesidade III (mórbida");
        }


        //Switch-case - É uma estrutura de seleção com base no valor de uma variável

        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break; //impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta de frutas!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default: // *** else ***
                System.out.println("Esta dieta não existe!");

        }

        System.out.println("Você tem quantos alimentos ´preferidos ?");
        int totalDeAlimentos = entrada.nextInt();

        for(int i = 0; i < totalDeAlimentos; i++){
            System.out.println("Digite o seu alimentos: ");
            String alimento = entrada.next(); // Não utilizar o nextLine()
            System.out.println("Voc~e gosta de " + alimento);
        }

        int i = 0;

        while (i< totalDeAlimentos){
            System.out.println(i);
            i++;
        }
    }
}
