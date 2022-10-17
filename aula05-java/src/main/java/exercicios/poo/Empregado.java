package exercicios.poo;

public class Empregado {

    final String nome;
    final String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double calcularSalarioAnual(){
        double salarioAnual = this.salario * 12;

        return salarioAnual;
    }

    void  aumentarSalario(double aumento){
        this.salario += aumento;
    }

    String nomeCompleto(){
        String nomeCompleto = "Nome completo: " + this.nome + " " + this.sobrenome;

        return nomeCompleto;
    }

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Pedro", "Antonio", 1564);

        empregado1.aumentarSalario(250);
        System.out.println("Salario: " + empregado1.salario);
        System.out.println(empregado1.nomeCompleto());
        System.out.println(empregado1.calcularSalarioAnual());
    }
}
