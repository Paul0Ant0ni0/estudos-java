package sistema;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class Produtos {
    private int id;
    private String nome;
    private int quantidade;
    private String tipo;
    private Date promocao;
    private Date promocaoAte;
    private String imagem;
    private Double preco;
    private String descricao;

    private ArrayList<Produtos> prodRegistrados;

    public Produtos(int id, String nome, int quantidade, String tipo, Date promocao,
                    Date promocaoAte, String imagem, Double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.promocao = promocao;
        this.promocaoAte = promocaoAte;
        this.imagem = imagem;
        this.preco = preco;
        this.descricao = descricao;
        this.prodRegistrados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getPromocao() {
        return promocao;
    }

    public void setPromocao(Date promocao) {
        this.promocao = promocao;
    }

    public Date getPromocaoAte() {
        return promocaoAte;
    }

    public void setPromocaoAte(Date promocaoAte) {
        this.promocaoAte = promocaoAte;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Produtos> getProdRegistrados() {
        return prodRegistrados;
    }

}
