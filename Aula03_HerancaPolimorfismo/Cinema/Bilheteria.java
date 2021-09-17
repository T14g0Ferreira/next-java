package Aula03_HerancaPolimorfismo.Cinema;

import java.util.ArrayList;

public class Bilheteria {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(40.0);
        Ingresso ingressoDois = new Ingresso(40.0);
        Ingresso ingressoTres = new Ingresso(40.0);
        Ingresso ingressoQuatro = new Ingresso(40.0);

        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        ingressos.add(ingresso);
        ingressos.add(ingressoDois);
        ingressos.add(ingressoTres);

        System.out.println("Quantidade de ingressos: " + ingressos.size());

        ingressos.remove(ingressoQuatro);

        System.out.println("Quantidade de ingressos: " + ingressos.size());


        System.out.println(ingresso + "");
        // System.out.println(ingressoVip);

        System.out.println("Os ingresso são iguais? " + ingressoDois.ehIgual(ingresso));
        System.out.println("Os ingresso são iguais? " + (ingressoDois == ingresso));
        
        // System.out.println("Os ingressoVIP são iguais? " + ingressoVip.equals(ingressoVipDois));
        // System.out.println("Os ingressoVIP são iguais? " + (ingressoVip == ingressoVipDois));
    }
}