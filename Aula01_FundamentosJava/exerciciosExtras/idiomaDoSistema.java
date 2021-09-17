package Aula01_FundamentosJava.exerciciosExtras;

import java.util.Locale;

public class idiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(idioma.getDisplayLanguage());

    }


}
