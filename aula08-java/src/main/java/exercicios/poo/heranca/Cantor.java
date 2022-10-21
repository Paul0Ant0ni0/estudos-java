package exercicios.poo.heranca;

public class Cantor extends Pessoa{
    private String nomeDaBanda;

    public Cantor(String nome, String genero, String nomeDaBanda) {
        super(nome, genero);
        this.nomeDaBanda = nomeDaBanda;
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

    public void cantar(){

    }

    public void tocarGuitarra(){

    }
}
