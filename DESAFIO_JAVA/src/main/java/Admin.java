import sistema.Produtos;

import java.util.ArrayList;

public class Admin extends Usuario{

    private ArrayList<Produtos> catalogoProdutos;

    public Admin(Integer id, String nome, String email, String login, String senha, String cpf) {
        super(id, nome, email, login, senha, cpf);
        this.catalogoProdutos = new ArrayList<>();
    }

    public ArrayList<Produtos> getCatalogoProdutos() {
        return catalogoProdutos;
    }

    public void setProdutos(Produtos produtos, String login, String senha) {
        if (!produtos.equals("")){
            if (this.getLogin().equals(login) && this.getSenha().equals(senha)){
                System.out.println("Ola "+ login);
                this.catalogoProdutos.add(produtos);
                System.out.println("Produto adicionado com sucesso");
            }else {
                System.out.println("Usuario ou senha invalida");
            }

        }else{
            System.out.println("Produto inválido");
        }

    }


}
