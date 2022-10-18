package aulas.poo;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private boolean ehFlex;
    private int qtPortas;
    private double combustivelAtual;

    private double consumo;

    private boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
        this.estaLigado = false;
    }

    // Abastecer
    public void setAbastecer(double total){// parametro do método
        this.combustivelAtual += total; // this.combustivelAtual = this.combustivelAtual + total
    }

    // Ligar
    void ligar(){
        this.estaLigado = true;
    }
    // Desligar

    void desligar(){
        this.estaLigado = false;
    }

    // Viajar
    boolean viajar(String local, double distancia){ // tentar viaja, se conseguir true, senão false
        if (!this.estaLigado){
            this.ligar();
        }

        //Calcule quantos litros serão necessario para viajar
        double totalLitros = distancia / this.consumo;

        if (this.combustivelAtual - totalLitros > 0){

            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ " +  local + " aconteceu. Sobrou:" +  this.combustivelAtual + "L");
            return true; // A viagem aconteceu

        }else {
            System.out.println("A viagem não foi possivel.");
            return false; // A viajem não será possivel
        }

    }

    public double getCombustivelAtual(){
        return this.combustivelAtual;
    }

    public boolean getEstaLigado(){
        return this.estaLigado;
    }

    public void setCarroAno(int novoAno){
        this.ano = novoAno;
    }

    public int getCarroAno(){
        return this.ano;
    }


}
