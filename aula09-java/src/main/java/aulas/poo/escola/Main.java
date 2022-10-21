package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos Jose", "carlosjose@gmail.com", "0000000", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Pedro", "joao@gmail.com", "065568563", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia", "maria@gmail.com", "25421850");
        p1.seApresentar();

        // Aluno é uma Pessoa
        // Sendo assim ele só tera acesso aos metodos e atributos da classe Pessoa, mas a clesse Aluno
        // Está sobrescrevendo o método seApresentar()
        // Irá preservar os métodos e atributos do tipo da variavel, exceto, quando estiver sobrescrevendo o métodos
        // na subclasse/classe do objeto
        Pessoa p2 = new Aluno("Carlos Jose", "carlosjose@gmail.com", "0000000", 7.5);

        // Professor é uma Pessoa
        Pessoa p3 = new Professor("João Pedro", "joao@gmail.com", "065568563", "TI");
        System.out.println("--------------");
        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo
        System.out.println("======= PESSOAS =======");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas){
            // O método de se apresentar se comporta diferente dependo de classes
            // original
            pessoa.seApresentar();
        }

    }
}
