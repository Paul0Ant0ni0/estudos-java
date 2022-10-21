package aulas.poo.escola;

public class Aluno extends Pessoa{
    private double media;

    // chamada da super deve vir primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // estou chamando um construtor de Pessoa
        this.media = media;
    }

    @Override
    public void seApresentar(){ // na subrescrita mudamos o comportamento (apenas)
        super.seApresentar(); // super = Pessoa() => está chamando o método da superclasse
        System.out.println("Eu sou um aluno com média " + this.media);
    }


    public double getMedia(){
        return this.media;
    }
}
