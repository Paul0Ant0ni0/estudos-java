package aulas.poo;

public class Comida {
    private String nome;
    private double peso;

    Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPeso(){
        return this.peso;
    }
}
