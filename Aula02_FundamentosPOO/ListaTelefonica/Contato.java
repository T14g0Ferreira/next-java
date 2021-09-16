package Aula02_FundamentosPOO.ListaTelefonica;

public class Contato {
    private String nome;
    private String telefoneFixo;
    private String celular;

    public Contato(String nome, String telefoneFixo, String celular) {
        this.nome = nome;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
    }

    public Contato(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneFixo() {
        return this.telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    private String formatarNumero(String numero){
        System.out.println("Formatou o número");
        return numero;
    }


}
