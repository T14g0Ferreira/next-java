package Aula01_FundamentosJava.exerciciosExtras;

import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        System.out.println("A resolução do sistema é: " + d.width + " X " + d.height);
    }
}
