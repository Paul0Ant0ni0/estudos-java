import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {

        //Quando declarar uma lista, deve utilizar as class wrapper
        // cria um novo ArrayList vazio que guarda Integer.
        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println(numeros);

        //Adicionado elemento no array
        numeros.add(10); // equivale o push no Js - Adiciona elemento no final do array
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);

        System.out.println(numeros.get(2)); // equivale a numeros[2]
        // numeros[0] = 500;
        numeros.set(0, 500); // alterando elementos na posição 0

        // Remove o elemento na posição 0
        numeros.remove(0);

        System.out.println(numeros);
        numeros.add(1, 200); // adiciona o elemento na posição e move os demais
        System.out.println(numeros);
        numeros.add(3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size()); // tamanho do array, equivale array.length

        for(int i = 0; i < numeros.size(); i++){ // 0, 1, 2, 3
            System.out.println(numeros.get(i));
        }

        System.out.println("------- forEach ------------");
        for(int numero : numeros){ //Para cada valor dentro do array ele executa um código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(5000)); // true = achou, false = não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição do 1000 na lista
        System.out.println(numeros.indexOf(500)); // -1 = não achou o elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o último elemento encontrado

        //Fatiando lista
        System.out.println(numeros.subList(2, 3));

        numeros.forEach(i -> System.out.println(i));
        numeros.forEach(numero -> System.out.println(numero));

    }
}
