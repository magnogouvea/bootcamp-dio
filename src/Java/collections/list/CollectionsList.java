package Java.collections.list;

import java.util.*;

public class CollectionsList {
  public static void main(String[] args) {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_YELLOW = "\u001B[33m";
    System.out.print("Crie uma lista e adicione as sete notas: ");

    List<Double> notas = new ArrayList<Double>();
    notas.add(7d);
    notas.add(5d);
    notas.add(9d);
    notas.add(2d);
    notas.add(3d);
    notas.add(8d);
    notas.add(1d);
    notas.add(0d);
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.println("Exiba a posição da nota 5.0: " + ANSI_YELLOW + notas.indexOf(5d) + ANSI_RESET);

    System.out.print("Adicione na lista a nota 4.0 na posição 4: ");
    notas.add(4, 4d);
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.print("Substitua a nota 5.0 pela nota 6.0: ");
    notas.set(1, 6d);
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.println("Confira se a nota 5.0 está na lista: " + ANSI_YELLOW + notas.contains(5d) + ANSI_RESET);

//    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//    for (Double nota: notas) {
//      System.out.println(nota);
//    }

    System.out.println("Exiba a terceira nota adicionada: " + ANSI_YELLOW + notas.get(2) + ANSI_RESET);

    System.out.println("Exiba a menor nota: " + ANSI_YELLOW + Collections.min(notas) + ANSI_RESET);


    System.out.println("Exiba a maior nota: " + ANSI_YELLOW + Collections.max(notas) + ANSI_RESET);

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + ANSI_YELLOW + soma + ANSI_RESET);

    System.out.println("Exiba a média das notas: " + ANSI_YELLOW + soma / notas.size() + ANSI_RESET);

    System.out.print("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.print("Remova a nota da posição 0: ");
    notas.remove(0);
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.print("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7) iterator1.remove();
    }
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);

    System.out.print("Apague toda a lista: ");
    notas.clear();
    System.out.println(ANSI_YELLOW + notas + ANSI_RESET);;

    System.out.println("Confira se a lista está vazia: " + ANSI_YELLOW + notas.isEmpty() + ANSI_RESET);


  }
}
