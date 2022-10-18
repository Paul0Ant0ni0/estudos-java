package projetos;

import java.time.LocalDate;
import java.util.Scanner;

public class ContadorDatas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();

        System.out.println("------ Seja Bem Vindo (a) --------\n");

        System.out.println("Digite uma data para informamos quando tempo para esta data:");
        String data = entrada.nextLine();

        String[] arrayData = data.split("/");

        int dia = 0, mes = 0, ano = 0;

        for( int i = 0; i < arrayData.length; i++){
            if( arrayData[i] == arrayData[0]){
                dia = Integer.parseInt(arrayData[0]);
            }

            if( arrayData[i] == arrayData[1]){
                dia = Integer.parseInt(arrayData[1]);
            }

            if( arrayData[i] == arrayData[2]){
                dia = Integer.parseInt(arrayData[2]);
            }

        }
        System.out.println(dia+ "" + mes + "" + ano);
        try{
            LocalDate dataEspecifica = LocalDate.of(ano, mes, dia);
            int dataEsperada = dataEspecifica.getDayOfYear() - hoje.getDayOfYear();

            System.out.println("Faltam só " + dataEsperada + "dia (s)");
        }catch (Exception e){
            System.out.println("Erro" + e);
        }



    }
}
