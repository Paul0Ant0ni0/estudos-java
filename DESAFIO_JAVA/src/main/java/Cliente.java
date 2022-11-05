import sistema.ListaDeCompras;
import sistema.Produtos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cliente extends Usuario{
    Scanner entrada = new Scanner(System.in);

    private ArrayList<Produtos>lista;
    private ArrayList<ListaDeCompras>listaDeCompras;

    public Cliente(Integer id, String nome, String email, String login, String senha, String cpf) {
        super(id, nome, email, login, senha, cpf);
        this.lista = new ArrayList<>();
    }

    public ArrayList<Produtos> getLista() {
        return lista;
    }

    public void setLista(Produtos produto) {
        if (!produto.equals("")){
            this.lista.add(produto);
            System.out.println("Produto adicionado na lista com sucesso\n");


        }

    }

    public void preencherRecibo(){
        System.out.println("Preencha o recibo da compra\n");
        System.out.print("Digite o id da compra: ");
        int idCompra = entrada.nextInt();

        LocalDate dataHoraAtual = LocalDate.now(); // Armazenado a data e hora da compra
        String dataCompra = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        System.out.println("Qual a sua forma de pagamento");
        enum formaPagamento {DINHEIRO, CARTAO, PIX}
        System.out.println(Arrays.toString(formaPagamento.values()));
        String pg = entrada.next();
        System.out.println("\nDigite a quantidade\n");
        int quantidade = entrada.nextInt();

        System.out.println("\nDigite o total da compra\n");
        double valorTotal = entrada.nextInt();
        ListaDeCompras recibo = new ListaDeCompras(idCompra, dataCompra, hora, pg, quantidade, valorTotal);
        System.out.println("\n\nO seu recibo foi gerado com sucesso.\n");
        System.out.println(recibo);
    }
}
