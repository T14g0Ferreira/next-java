package Aula02_FundamentosPOO.ContaBancaria;
public class App {
    public static void main(String[] args) throws Exception {
        Conta contaDoLucas = new Conta("456456-7", "0001", 10000000.0);
        Conta contaBBDoLucas = new Conta("456456-7", "0001", 100.0);

        // Saque
        System.out.println("Saldo antes do saque: " + contaDoLucas.getSaldo());
        contaDoLucas.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaDoLucas.getSaldo());

        System.out.println("------------------");

        System.out.println("Saldo antes do saque: " + contaBBDoLucas.getSaldo());
        contaBBDoLucas.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaBBDoLucas.getSaldo());
    }
}
