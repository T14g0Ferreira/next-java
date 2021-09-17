package Aula02_FundamentosPOO.listaTelefonica;

import java.util.ArrayList;

public class Agenda {
    private String emailDeSincronizacao;
    private ArrayList<Contato> contatos;

    public Agenda(String emailDeSincronizacao, ArrayList<Contato> contatos) {
        this.emailDeSincronizacao = emailDeSincronizacao;
        this.contatos = contatos;
    }

    public Agenda(String emailDeSincronizacao) {
        this.emailDeSincronizacao = emailDeSincronizacao;
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        for (int i = 0; i < this.contatos.size(); i++) {
            Contato contatoAtual = this.contatos.get(i);
            if(contatoAtual.getNome().equals(contato.getNome())) {
                this.contatos.remove(i);
            }
        }
    }

    public String getEmailDeSincronizacao() {
        return this.emailDeSincronizacao;
    }

    public ArrayList<Contato> getContatos() {
        return this.contatos;
    }

    public int totalContatos() {
        return this.contatos.size();
    }
}