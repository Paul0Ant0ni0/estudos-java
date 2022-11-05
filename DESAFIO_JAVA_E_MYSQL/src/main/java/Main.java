import sistema.Produtos;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // INSTANCIAS DOS PRODUTOS

        Produtos maca = new Produtos(1, "Maça", 2500, "Alimentos",
                new Date(2022,10,05), new Date(2022,12,05),
                "macas.png", 4.20,"Maça vermelhinhas diretas da roça");

        Produtos celular = new Produtos(2, "Celular", 150, "eletronicos",
                new Date(2022,10,05), new Date(2022,12,05),
                "celular.png", 2580.65,"200gb Samsung Camera 4k");

        Produtos sofa = new Produtos(3, "sofa", 500, "móveis",
                new Date(2022,10,05), new Date(2022,12,05),
                "sofa.png", 2800.35,"Com almofadas e direto para entrega");

        Produtos kitkat = new Produtos(4, "kitkat", 5000, "Alimentos",
                new Date(2022,10,05), new Date(2022,12,05),
                "kitkat.png", 6.35,"O melhor cocolhate é KittttKatttt");

        Produtos shampoo = new Produtos(5, "Shampoo", 300, "Beleza",
                new Date(2022,03,05), new Date(2022,12,05),
                "shampoo.png", 10.99,"Cabelos limpos e sedosos");



        // INSTANCIANDO OS ADMINSTRADORES E INCLUINDO OS PRODUTOS NO CATÁLOGO

        Admin admPedro = new Admin(1, "Pedro Alves",
                "pedroalvezdasilva@gmail.com", "Pedrinho2022", "123456500", "981.857.302-10");

        Admin adminIsaac = new Admin(2, "Isaac Samuel da Rosa",
                "isaac_samuel@hotmail.com", "Samuca2563", "SASA2385", "872.250.597-00");

        Admin adminCristiane= new Admin(3, "Cristiane Juliana Silvana Peixoto",
                "cristiane_peixoto@bol.br", "Cris15023", "Crist@jg", "569.511.710-09");

        Admin adminSarah = new Admin(4, "Sarah Rafaela Adriana Barbosa",
                "sarah.barbosa@uol.com.br", "Sarih", "sShri5063", "331.896.687-87");

        // SÓ OS OBJETOS DO TIPO ADM TEM ACESSO PARA POSTAR OS PRODUTOS, POIS PRECISA DE VALIDAÇÃO DE LOGIN E SENHA

        admPedro.setProdutos(maca, admPedro.getLogin(), admPedro.getSenha());
        adminSarah.setProdutos(celular, adminSarah.getLogin(), adminSarah.getSenha());
        adminCristiane.setProdutos(sofa, adminCristiane.getLogin(), adminCristiane.getSenha());
        adminIsaac.setProdutos(kitkat, admPedro.getLogin(), admPedro.getSenha()); // Erro -> Usuario ou senha invalidos


        admPedro.getCatalogoProdutos();


        // INSTACIA DOS CLIENTES

        Cliente clienteBenicio = new Cliente(1, "Benício Iago Duarte",
                "benicio.iago.duarte@fpsgeodata.com.br", "Benifio5365", "qRLp6HOq6w",
                "402.884.676-55");

        Cliente clienteMalu = new Cliente(2, "Malu Rebeca Novaes",
                "malu.rebeca.novaes@charquesorocaba.com.br", "Mall651", "FL5ei9d6Dd",
                "775.610.742-04");

        Cliente clienteSeverino = new Cliente(3, "Severino Luís Otávio da Mota",
                "severinoluisdamota@ceviu.com.br", "Sv604,", "eTdlLQJLJj",
                "018.966.293-00");


        // SISTEMA PARA OS USUARIOS (CLIENTE & ADMINISTRADORES)

        Cliente modeloCliente = null;
        Admin modeloAdm = null;

        System.out.println("------ BEM VINDO -----\n\n");

        System.out.println("A Soulcode loja oferece os melhores produtos\n\n");
        System.out.println("------- LOGIN --------");
        System.out.println("Possui cadastro no nosso sistema?");
        System.out.println("Digite: Sim ou Nao\n");
        System.out.println("Digite aqui:");
        String e = entrada.next();

        if (!e.equalsIgnoreCase("Sim") && !e.equalsIgnoreCase("Nao")){
            System.out.println("\n\n ----->  DIGITE UM VALOR VALIDO!!! <----- \n\n");
        }else{
            if (e.equalsIgnoreCase("Sim")){

                System.out.println("Voce é adm ou clt");
                String respAcesso = entrada.next();
                switch (respAcesso){
                    case "adm" -> {
                        System.out.println("Digite o seu usuario e senha");
                        System.out.println("Login: ");
                        String login = entrada.next();
                        System.out.println("Senha: ");
                        String senha = entrada.next();
                        if (modeloAdm.getLogin().equals(login) && modeloAdm.getSenha().equals(senha)){

                        }else{
                            System.out.println("Login ou senha invalidos");
                        }
                    }
                    case "clt" -> {
                        System.out.println("Digite o seu usuario e senha");
                        System.out.println("Login: ");
                        String login = entrada.next();
                        System.out.println("Senha: ");
                        String senha = entrada.next();
                        if (modeloCliente.getLogin().equals(login) && modeloCliente.getSenha().equals(senha)){

                        }else {
                            System.out.println("Login ou senha invalidos");

                        }
                    }
                    default -> {
                        System.out.println("Comando invalido");
                    }
                }

            }else{
                System.out.println("\n\n ----->  DESEJA SE CADASTRAR !!! <----- \n\n");
                System.out.println("Digite: Sim ou Nao\n");
                System.out.println("Digite aqui:");
                String respCadas = entrada.next();
                switch (respCadas){
                    case "Sim" -> {
                        System.out.println("Qual o tipo de login: Adm ou Clt?");
                        String tipoLogin = entrada.next();
                        if (tipoLogin.equalsIgnoreCase("Adm")){
                            System.out.println("\nInforme os seus dados\n");
                            System.out.print("Nome: ");
                            String nome = entrada.next();
                            System.out.print("Email: ");
                            String email = entrada.next();
                            System.out.print("Login: ");
                            String login = entrada.next();
                            System.out.print("Senha: ");
                            String senha = entrada.next();
                            System.out.print("CPF: ");
                            String cpf = entrada.next();

                            Admin modelo = new Admin(5, nome, email, login, senha, cpf);
                            modeloAdm = modelo;
                            System.out.println("Dados Salvos " + modelo);
                            System.out.println("Cadastro realizado com sucesso");
                            break;
                        }else if (tipoLogin.equalsIgnoreCase("Clt")){
                            System.out.println("\nInforme os seus dados\n");
                            System.out.print("Nome: ");
                            String nome = entrada.next();
                            System.out.print("Email: ");
                            String email = entrada.next();
                            System.out.print("Login: ");
                            String login = entrada.next();
                            System.out.print("Senha: ");
                            String senha = entrada.next();
                            System.out.print("CPF: ");
                            String cpf = entrada.next();

                            Cliente modelo = new Cliente(5, nome, email, login, senha, cpf);
                            modeloCliente = modelo;
                            System.out.println("Dados Salvos " + modelo);
                            System.out.println("Cadastro realizado com sucesso");
                            break;
                        }else{
                            System.out.println("----- VALOR DIGITADO INVALIDO ------");
                        }
                    }
                    case "Nao" -> {
                        System.out.println("Obrigado e seja sempre bem vindo");
                    }
                    default -> {
                        System.out.println("Obrigado e seja sempre bem vindo");
                        break;
                    }
                }
            }

        }



    }

}


