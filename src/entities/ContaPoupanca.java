package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor, double perc){
        if (valor <= informarSaldo()) {
            setSaldo((informarSaldo() - 2));
        } else {
            System.out.println("Limite excedido :(.");
        }
    }

    @Override
    public void sacar(double saldo) {
        if (saldo <= informarSaldo()) {
            setSaldo((informarSaldo() - 2));
        } else {
            System.out.println("Limite excedido :(.");
        }
    }

    public void cobrarJuros() {
        double juros = 0.05;
        setSaldo(informarSaldo() * (1 + juros));
    }
}
