package exercicios.poo;

public class Circulo {
    private double raio;
    private String cor;


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

    void setRaio(double novoRaio){
        this.raio = novoRaio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.00, "Black");

       System.out.println(circulo.raio);
       System.out.println(circulo.calcularCircunferencia());
    }
}

