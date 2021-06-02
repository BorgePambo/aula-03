package javaappcalculador;

import java.util.Locale;
import java.util.Scanner;

public class JavaAppCalculador {

    public static Scanner sc;
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      sc = new Scanner(System.in);
      
      System.out.print("Digite um número: ");
      double num1 = sc.nextDouble();
      System.out.print("Digite outro número: ");
      double num2 = sc.nextDouble();
      
      System.out.println("\nESCOLHE UMA OPÇÃO: ");
      System.out.println("1- SOMAR\n2- SUBTRAIR\n3- MULTIPLICAR\n4- DIVIDIR");
      System.out.print("\nDIGITE Á OPÇÃO: ");
      double op = sc.nextDouble();
      
      if(op == 1){
          double r = num1 + num2;
          System.out.printf("RESULTADO = %.2f\n", r);
      }
      else if(op == 2){
          double r = num1 - num2;
          System.out.printf("RESULTADO = %.2f\n", r);
      }
      else if(op == 3){
          double r = num1 * num2;
          System.out.printf("RESULTADO = %.2f\n", r);
      }
      else if(op == 4){
          double r = num1 / num2;
          System.out.printf("RESULTADO = %.2f\n", r);
      }
      
       System.out.println("FIM DA EXECUÇÃO!!!!!");
    }
    
}
