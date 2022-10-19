package aulas.poo;

public class Pet {

    private String nome;
    private int idade;
    protected double peso;
    // nas subclasses o atributo/metodo private
    // não é acessivel
    // protected => permite acesso direto nas subclasses


    Pet(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom(){
        System.out.println("......");
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }

    public void dormir(){
        System.out.println("ZZZZZZzzzzzz");
    }

    public void brincar(){
        System.out.println("Estou brincando....");
    }


    public String getNome() {
        return this.nome;
    }

    //pet.peso;
    //double peso = pet.peso()
    public double getPeso() {
        return this.peso;
    }

    // pet.peso = 12345
    // pet.setPeso(234)
    public void setPeso(double novoPeso) { // possibilidade de altera o peso
        this.peso = novoPeso;
    }
}
