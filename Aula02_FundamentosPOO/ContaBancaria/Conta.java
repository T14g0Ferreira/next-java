package Aula02_FundamentosPOO.contaBancaria;

// modificador de acesso - class - NomeDaClasse
public class Conta {

    // public static final String RENDIMENTO = "100";

    // Atributos (caracteristicas)
    // modificador de acesso - tipo do atributo - nomeDoPadrao
    // protected String numero;
    public String numero;
    public String agencia;
    private Double saldo;

    // Construtores
    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia, Double saldo) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(Double saque) {
        if (podeSacar(saque)) {
            saldo -= saque;
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }
    }

    public void creditarSaldo(Double valor) {
        saldo += valor;
        System.out.println(saldo);
    }

    private boolean podeSacar(Double saque) {
        return saldo != null && saldo > 0 && saldo >= saque;
    }

    public Double getSaldo() {
        return saldo;
    }
}

