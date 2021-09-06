package Aula02_FundamentosPOO;

import java.util.Locale;

public class IdiomaDoSIstema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(idioma.getDisplayLanguage());

    }


}
