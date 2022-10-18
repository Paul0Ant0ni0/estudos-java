package exercicios.poo;

public class Livro {
    final String nome;
    final String autor;
    double preco;


    public Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;

    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Lago Azul", "Henry de Vere Stacpoolen", 25.3);

        System.out.println(livro1.nome);
        System.out.println(livro1.autor);
        System.out.println(livro1.preco);
    }
}
