package Java.loops;

import java.util.Scanner;

public class NomeEIdade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

     String nome;
     int idade;

     while(true) {
       System.out.println("Nome: ");
       nome = scan.next();
       if(nome.equals("0")) break;
       System.out.println("Idade: ");
       idade = scan.nextInt();
     }

    System.out.println("Continua aqui...");

  }
}
