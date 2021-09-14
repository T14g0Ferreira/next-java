package Aula02_FundamentosPOO.ContaBancaria;

public class Conta {
    public String numero;
    public String agencia;
    private Double saldo;

    public Conta(String numero, String agencia, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void debitarSaldo(Double saque) {
        if (saldo != null && saldo > 0 && saldo >= saque) {
            saldo -= saque;
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }
    }

    public void creditarSaldo(Double valor) {
        saldo += valor;
    }

    protected Double getSaldo(){
        return saldo;
    }
}

