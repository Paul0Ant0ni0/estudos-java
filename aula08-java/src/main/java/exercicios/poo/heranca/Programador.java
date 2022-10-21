package exercicios.poo.heranca;

public class Programador extends Pessoa{
    private String nomeDaEmpres;

    public Programador(String nome, String genero, String nomeDaEmpres) {
        super(nome, genero);
        this.nomeDaEmpres = nomeDaEmpres;
    }

    @Override
    public void aprender() {
        super.aprender();
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void comer() {
        super.comer();
    }

    public void programar(){

    }
}
