/*
   ## 
   + Crie uma classe chamada Fatorial e mande criar o método main.
   + No método main, implemente um programa que lê um número e em seguida imprime
     o seu fatorial.
   DICA: Procure implementar isso utilizando alguma estrutura de laço
   ##
*/

package Aula01_FundamentosJava;

public class Fatorial {
  public static void main(String[] args) {
    int numero = 8;
    int resultado = 1;

    for(int contador = numero; contador > 0; contador--) {
      resultado = resultado * contador;
    }
    System.out.println("Fatorial do número " + numero + " é: " +resultado);
  }   
}