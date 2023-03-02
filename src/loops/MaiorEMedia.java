package loops;

import java.util.Scanner;

public class MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int count = 0;
    int maiorNumero = 0;
    int soma = 0;

    do {
      System.out.println("Informe um número: ");
      numero = scan.nextInt();
      soma = soma + numero;
      System.out.println("Soma: " + soma);
      if(numero > maiorNumero) maiorNumero = numero;
      count += 1;
    } while (count < 5);

    System.out.println("A média é: " + (soma / 5));
  }
}
