package aulas.correcao.biblioteca;

import java.util.ArrayList;

public class Livro {
    private String nome;
    private Autor autor; // informações do autor
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor=" + autor +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {

        Autor jk = new Autor("Jk", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra Filosofal", jk, 24.9);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());

        Livro cameraSecreta = jk.escreverLivro("Harry Potter e a Canera secreta", 30.0);

        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o Prisioneiro de azkhaban", 40.0);

        System.out.println(cameraSecreta.autor.getNome());
        System.out.println(prisioneiroAzk.autor.getNome());


        ArrayList<Livro> livrosjk = new ArrayList<>();

        livrosjk.add(pedraFilosofal);
        livrosjk.add(cameraSecreta);
        livrosjk.add(prisioneiroAzk);

        System.out.println(livrosjk.toString());
    }
}
