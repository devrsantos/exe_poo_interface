package entities;

public abstract class Conta {
    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Deposito de R$ %.2f realizado com sucesso%n", informarSaldo());
    }

    public abstract void sacar(double saldo);

    public abstract void sacar(double saldo, double perc);

    public double informarSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
