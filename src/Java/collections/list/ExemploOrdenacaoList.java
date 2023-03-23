package Java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
  public static void main(String[] args) {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_YELLOW = "\u001B[33m";
    List<Gato> meusGatos = new ArrayList<>(){{
      add(new Gato("Floyd", 7, "Tigrado"));
      add(new Gato("Branquinho", 8, "Branco"));
      add(new Gato("Haru", 2, "Amarelo"));
    }};

    System.out.println("---\tOrdem de Inserção\t---");
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);

    System.out.println("---\tOrdem Aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);

    System.out.println("---\tOrdem Natural(Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);

    System.out.println("---\tOrdem Idade\t---");
    meusGatos.sort(new ComparatorIdade());
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);

    System.out.println("---\tOrdem Cor\t---");
    meusGatos.sort(new ComparatorCor());
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);

    System.out.println("---\tOrdem Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(ANSI_YELLOW + meusGatos + ANSI_RESET);
  }
}

class Gato implements Comparable<Gato> {

  private final String nome;
  private final Integer idade;
  private final String cor;

  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getCor() {
    return cor;
  }

  @Override
  public String toString() {
    return "{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", cor='" + cor + '\'' +
            '}';
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }
}

class ComparatorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato> {

  @Override
  public int compare(Gato g1, Gato g2) {
    return g1.getCor().compareToIgnoreCase(g2.getCor());
  }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato g1, Gato g2) {
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if(nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if(cor != 0) return cor;


    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}
