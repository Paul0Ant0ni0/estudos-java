package aulas.poo;

public class CarroTeste {
    //Main serve para testar a classe
    public static void main(String[] args) {

        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("Z", "Ford", 2019, false, 2, 50);

        System.out.println(carro1.getCombustivelAtual());
        carro1.setAbastecer(5);
        System.out.println(carro1.getCombustivelAtual());

        System.out.println(carro1.getEstaLigado());
        carro1.ligar();
        System.out.println(carro1.getEstaLigado());

        System.out.println(carro1.getCarroAno());
        carro1.setCarroAno(2020);
        System.out.println(carro1.getCarroAno());

        boolean viajar = carro1.viajar("Fortaleza", 3);
        System.out.println(viajar);
    }
}
