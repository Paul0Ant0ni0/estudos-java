//Enums são estruturas com constants
//Dias da semana. meses do ano, Turnos do dia, Estações
//Nívis (júnior, pleno, sênior), feria´dos nacionais


public class EstudosEnums {

    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO

        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA; // enum.CONSTANTE
        System.out.println(hoje);

        enum NivelDev { JUNIOR, PLENO, SENIOR}

        NivelDev nivel = NivelDev.PLENO;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); // o valor de name precisa ser: JUNIOR, PLENO, SENIOR

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nível é junior");
            case PLENO:
                System.out.println("Seu nível é Pleno");
            case SENIOR:
                System.out.println("Seu nível é Senior");
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
