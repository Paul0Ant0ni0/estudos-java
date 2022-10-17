package exercicios.poo;

public class Circulo {
    double raio;
    String cor;


    Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;


    }

    double calcularArea(){
        double area = (Math.PI * this.raio * this.raio);

        return area;
    }

    double  calcularCircunferencia(){
        double circuferencia = (2 * Math.PI * this.raio);

        return circuferencia;
    }

    void mudarRaio(double novoRaio){
        this.raio = novoRaio;
    }
}
