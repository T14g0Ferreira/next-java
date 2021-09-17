package Aula02_FundamentosPOO.listaTelefonica;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Contato contatoTiago = new Contato("Tiago Ferreira", "5645645645", "564564564564");
        Contato contatoJuliana = new Contato("Juliana Ferreira", "789789789", "7898789789");

        ArrayList<Contato> contatos = new ArrayList<Contato>();
        contatos.add(contatoTiago);
        contatos.add(contatoJuliana);

        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i).getNome());
        }

        Agenda agendaGoogle = new Agenda("dasdas@gmail.com", contatos);

        for (int i = 0; i < agendaGoogle.getContatos().size(); i++) {
            System.out.println(contatos.get(i).getNome());
        }
    
            System.out.println("Total de contatos: " + agendaGoogle.totalContatos());
    
            Contato contatoMaria = new Contato("Maria Arrais", "546456456", "567567567");
            agendaGoogle.addContato(contatoMaria);
            System.out.println("Total de contatos: " + agendaGoogle.totalContatos());
    
            Contato contatoParaRemover = new Contato("Maria Arrais", "546456456", "567567567");
            agendaGoogle.removeContato(contatoParaRemover);
            System.out.println("Total de contatos: " + agendaGoogle.totalContatos());
        
    }
}
