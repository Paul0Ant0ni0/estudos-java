package aulas.poo.escola;

public class Professor extends Pessoa{
    private String formacao;


    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override // indica que a subrescrita - atalho: pv e System; sout
    public void seApresentar(){
        System.out.println("Eu sou um professor com formacao em " + this.formacao);
    }

    public String getFormacao() {
        return this.formacao;
    }
}
