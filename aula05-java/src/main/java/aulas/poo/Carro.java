package aulas.poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;

    double consumo;

    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double combustivelAtual){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
        this.estaLigado = false;
    }

    // Abastecer
    void abastecer(double total){// parametro do método
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

    //Main serve para testar a classe
    public static void main(String[] args) {

        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("Z", "Ford", 2019, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2020;
        System.out.println(carro1.ano);

        boolean viajar = carro1.viajar("Fortaleza", 3);
        System.out.println(viajar);
    }

}
