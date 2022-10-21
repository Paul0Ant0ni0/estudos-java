package exercicios.poo.heranca;

public class Dancarino extends Pessoa{
    private String nomeDoGrupo;

    public Dancarino(String nome, String genero, String nomeDoGrupo) {
        super(nome, genero);
        this.nomeDoGrupo = nomeDoGrupo;
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

    public void dancar(){

    }
}
