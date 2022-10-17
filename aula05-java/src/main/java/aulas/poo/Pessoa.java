package aulas.poo;

public class Pessoa {
    // Propriedade/Atributo de uma pessoa

    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    //PARA CRIAR CONSTRUTORES COM OS MESMO PARAMETROS TEM ALTERAR A ORDEM DELES


    Pessoa(){ // construtor da classe
        // this => representa o objeto
        this.nome = "Jose";
        this.sobrenome  = "Carlos";
        this.idade = 29;
        this.altura = 55.0;
        this.peso = 1.65;

    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) { // construtor da classe
        // this => representa o objeto
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Construtor que informação já instaciada, caso o usuário não inicialize
    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }

    // Ação de uma pessoa
    // <tipo_retorno> nomeDoMetodo(PARAMETROS) {}
    void dizOla(){ // método
        System.out.println("Olá, tudo bem? Meu nome é " +
                this.nome);
    }

    void mostrarImc(){
        //double imc = this.peso / (this.altura * this.altura);

        double imc = this.calculaImc();
        System.out.println("O meu imc é " + imc);
    }

    double calculaImc(){ // DEVE RETORNA UM VALOR
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }
}

