package Aula02_FundamentosPOO.listaTelefonica;

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

   
    public void setCelular(String celular) {
        this.celular = formatarNumero(celular);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    private String formatarNumero(String numero) {
        System.out.println("Formatou o numero!");
        return numero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefoneFixo() {
        return this.telefoneFixo;
    }

    public String getCelular() {
        return this.celular;
    }


}
