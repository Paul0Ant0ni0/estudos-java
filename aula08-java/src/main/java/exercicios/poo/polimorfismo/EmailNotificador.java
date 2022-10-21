package exercicios.poo.polimorfismo;

public class EmailNotificador implements Notificador{

    private String email;

    public EmailNotificador(String email){
        this.email = email;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Uma nova notificão no email: "+ this.email + "\n" +
                "mensagem: " + msg);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
