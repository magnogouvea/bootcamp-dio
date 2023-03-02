package loops;

import java.util.Scanner;

public class ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int qtdNumeros;
    int qtdPares = 0, qtdImpares = 0;
    int numero;
    int count = 0;
    System.out.println("Digite um numero: ");
    qtdNumeros = scan.nextInt();

    do {
      System.out.println("Número: ");
      numero = scan.nextInt();
    if(numero % 2 == 0) {
      qtdPares++;
    } else {
      qtdImpares++;
    }

      count++;
    } while (count < qtdNumeros);
    System.out.println("Números pares: " + qtdPares);
    System.out.println("Números ímpares: " + qtdImpares);
  }
}
