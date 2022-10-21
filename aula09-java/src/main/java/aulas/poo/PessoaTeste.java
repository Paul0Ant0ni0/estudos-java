package aulas.poo;

//Intuito: testar a classe pessoa
public class PessoaTeste {

    public static void main(String[] args) {
        //new => constroi um NOVO objeto Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Jose";
        pessoa1.sobrenome  = "Carlos";
        pessoa1.idade = 29;
        pessoa1.altura = 55.0;
        pessoa1.peso = 1.65;
        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Jose", "Carlos", 29, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");


        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecendo
        recemNascido.dizOla();

        //Chamada de métodos
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoas = pessoa4.calculaImc();
        System.out.println(imcPessoas);

        pessoa4.comer("batata");


        //Exemplo pesssoas

        Pessoa pedro = new Pessoa("Pedro", "Jose", 29, 1.10, 80);

        Pessoa joao = new Pessoa("Joao", "Carlos", 30, 1.75, 90);

        pedro.addCumprimentar(joao);
        pedro.addCumprimentar(joao);



    }
}
