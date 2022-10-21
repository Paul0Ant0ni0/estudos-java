package aulas.poo;

import java.time.LocalDate;

//Encapsulamento
//Quais atributos e métodos serão visiveis fora da classe
//public (publico) => visível para todos
//private => os métodos/atributos são visíveis apenas na classe

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Felipe", "Jose",
                LocalDate.of(1993, 5, 25), 1.85, 95.0);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());

        cliente1.setAltura(50);



    }
}
