/*
   ## 
   + Crie uma classe chamada Comparacao e mande criar o método main.
   + No método main, implemente um programa que possui três variáveis locais: x, y e z.
     Em seguida imprima os números em ordem decrescente.
   ##
*/

package Aula01_FundamentosJava;

public class Comparacao {
  public static void main(String[] args) {
      int x = 8;
      int y = 3;
      int z = 7;

      if(x > y){
        if(y > z){
          System.out.println("Ordem decrescente: " + x + " - " + y + " - " + z);
        } else if(x > z){
          System.out.println("Ordem decrescente: " + x + " - " + z + " - " + y);
        } else {
          System.out.println("Ordem decrescente: " + z + " - " + x + " - " + y);
        }
      } else {
          if(y > z){
            System.out.println("Ordem decrescente: " + y + " - " + x + " - " + z);
          } else if(x > z){
            System.out.println("Ordem decrescente: " + y + " - " + z + " - " + x);
          } else {
            System.out.println("Ordem decrescente: " + z + " - " + y + " - " + x);
          }
      }
    

    }
}