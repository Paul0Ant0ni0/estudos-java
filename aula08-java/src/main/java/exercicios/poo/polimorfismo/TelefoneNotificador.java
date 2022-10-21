package exercicios.poo.polimorfismo;

public class TelefoneNotificador implements Notificador{
    private int numero;

    public TelefoneNotificador(int numero){
        this.numero = numero;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Uma nova notificão no número: "+ this.numero + "\n" +
                "mensagem: " + msg);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
