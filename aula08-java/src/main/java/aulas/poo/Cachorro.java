package aulas.poo;

//sub-classe / classe-filha
public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        // super => representa a classe Pet
        super(nome, idade, peso); // chamando o contrutor da classe pai ou super classe
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // vamos sobescrever a ação de fazer som
    public void fazerSom(){
        System.out.println(this.getNome() + ": Au auuuuuuuuuu");
    }

    @Override
    public void brincar(){ //o cachorro late na hora de brincar
        this.fazerSom(); // chama o fazerSom() do Cachorro, foi sobrescrito
        super.brincar(); // está chamando brincar de Pet
        this.dormir(); // chama o dormir do Pet, pois não foi sobrescrito
    }

    @Override
    public void comer(String comida){
        // verfica se é a comida favorita
        if (comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.peso += 0.2;
            // this.setPeso(getPeso() + 0.2);
        }else{
            System.out.println("Quero " + comida + " nao");
        }

    }

    public void correrAtrasMoto(){ // Método especifico do Cachorro
        this.fazerSom();
        System.out.println("Correndo atras da moto");
    }


    public static void main(String[] args) {
        //Testar a herença

        Pet pet1 = new Pet("Fred", 3, 12.5);

        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println("\n-----------------------\n");

        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso", "Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
        batata.correrAtrasMoto();

    }
}
