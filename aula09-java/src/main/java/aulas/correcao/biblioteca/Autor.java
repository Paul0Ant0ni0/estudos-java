package aulas.correcao.biblioteca;

public class Autor {
    private String nome;
    private String email;


    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Livro escreverLivro(String nome, double preco){
        Livro novoLivro = new Livro(nome, this, preco); // this está referenciado o objeto, quando já instaciado
        return novoLivro;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
