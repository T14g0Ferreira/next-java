/*
    ## 
     + Escreva um programa que, com base em uma temperatura em graus celsius,
       a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
    
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;
    ##
*/

package Aula01_FundamentosJava;

public class ConversorTemperatura {
    public static void main(String[] args) {
        int C = 16;

        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.println(F + "º Fahrenheit");
        System.out.println(K + "º Kelvin");
        System.out.println(Re + "º Réaumur");
        System.out.println(Ra + "º Rankine");
    }
}