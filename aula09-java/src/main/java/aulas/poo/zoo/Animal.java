package aulas.poo.zoo;

// Na interface você define um conjunto de métodos
// É a classe que "herda" deve implementar estes métodos
// Interface no Java utiliza só método
public interface Animal {

        void dormir(); // definição do método apenas
        void fazerSom();
        void comer(String comida);

}


class Gato implements Animal{

    @Override
    public void dormir(){
        System.out.println("Miau  zzzzzzzzzzzz\"");

    }

    @Override
    public void fazerSom(){
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida){
        if (comida.equals("Peixe")){
            System.out.println("Huuuum gosto de peixe");
        }else {
            System.out.println("Só como peixe");
        }
    }

    public void ronronar(){
        System.out.println("GRRRrrrrrr");
    }

}


class Galinha implements Animal{

    @Override
    public void dormir() {
        System.out.println("Cõ cõ zzzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Cõ cô cô cô");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hum, cô cô " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        System.out.println("-----------");
        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");
        gato.ronronar();

        // Interface não consigo criar um objeto
        //Animal novoAnimal = new Animal(); // Não consigo criar, pois é Interface

        //Animal animalGalinha = new Galinha();
        //Animal animalGatinho = new Gato();
        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;
        System.out.println("======= POLIMORFISMO =======");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();

    }
}