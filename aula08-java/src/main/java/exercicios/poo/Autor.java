package exercicios.poo;

public class Autor {

    private String nome;
    private String email;


    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    void alteraNome(String novoNome){
        this.nome = novoNome;
    }

    void alteraEmail(String novoEmail){
        this.email = novoEmail;
    }

    public static void main(String[] args) {
        Autor autor1 = new Autor("Carlos", "carlos123@gmail.com");

        System.out.println(autor1.nome);
        autor1.alteraNome("Otavio");
        System.out.println(autor1.nome);

        System.out.println(autor1.email);
        autor1.alteraEmail("otavio123@gmail.com");
        System.out.println(autor1.email);
    }
}
