package exercicios.poo.polimorfismo;

public class Usuario {
    public static void main(String[] args) {
        EmailNotificador usuario1 = new EmailNotificador("jose@mail.com");
        usuario1.notificar("Olá, tudo bem?");

        TelefoneNotificador usuario2 = new TelefoneNotificador(19525060);
        usuario2.notificar("SMS: Você pode me responder no whatsapp");

        System.out.println("\n============////////==========\n");

        Notificador usuario3 = new EmailNotificador("pedro25@gmail.com");
        Notificador usuario4 = new TelefoneNotificador(132052850);
        usuario3.notificar("Eu sou o usuario 3");
        usuario4.notificar("Eu sou o usuario 4");
    }
}
