package Aula02_FundamentosPOO.contaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
         // System.out.println(Conta.rendimento);
    
         Conta contaNuDoLucasC1 = new Conta("456456-7", "0001");
         Conta contaNuDoLucasC2 = new Conta("456456-7", "0001", 10000000.0);
         Conta contaBBDoLucas = new Conta("456456-7", "0001", 100.0);
 
         
         System.out.println(contaNuDoLucasC1.getSaldo());
         System.out.println(contaNuDoLucasC1.numero);
 
         contaNuDoLucasC2.debitarSaldo(1000.0);
         System.out.println(contaNuDoLucasC2.getSaldo());
 
 
         // // Saque
         System.out.println("------------------");
 
         System.out.println("Saldo antes do saque: " + contaBBDoLucas.getSaldo());
         contaBBDoLucas.debitarSaldo(1500.0);
         System.out.println("Saldo depois do saque: " + contaBBDoLucas.getSaldo());
    }
}         
