package aulas.correcao.pou;

/**
 * 5.2) Crie uma classe Comida:
 *     Atributos: nome, peso;
 *     Construtores: Cria a comida com base nos parâmetros nome e peso;
 *     Métodos:
 *         - getNome()
 *         - getPeso()
 * **/

public class Comida {

    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPeso() {
        return this.peso;
    }
}
