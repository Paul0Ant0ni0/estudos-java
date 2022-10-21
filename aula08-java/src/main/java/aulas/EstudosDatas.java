package aulas;

import java.time.LocalDate;

public class EstudosDatas {
    public static void main(String[] args) {
        // dia - mês - ano
        //LocalDate armazena qualquer data (dia, mês, ano)
        LocalDate hoje = LocalDate.now(); // pega a data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); // verifica se data é depois da data específica
        System.out.println(hoje.isBefore(natal)); // verifica se data é antes da data específica
        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // o número do mês
        int dia = hoje.getDayOfMonth(); // o numero do do mês

        int diaParaONatal = natal.getDayOfYear() - hoje.getDayOfYear(); // subtrai do dia do natal pelo dia de hoje

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println(" Faltam " + diaParaONatal + " dias p/ natal!!!!");
    }
}
