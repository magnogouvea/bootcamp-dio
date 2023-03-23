package Java.collections.set;

import java.util.*;

public class ExemploOrdenacaoSet {
  public static void main(String[] args) {

    System.out.println("-- Ordem aleatória --");
    Set<Serie> minhasSeries = new HashSet<>(){{
      add(new Serie("got", "fantasia", 60));
      add(new Serie("dark", "drama", 60));
      add(new Serie("70s show", "comédia", 25));
    }};

    for (Serie serie: minhasSeries) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() +
              " - " + serie.getTempoEpisodio());
    }

    System.out.println("-- Ordem de Inserção --");
    Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
      add(new Serie("got", "fantasia", 60));
      add(new Serie("dark", "drama", 60));
      add(new Serie("70s show", "comédia", 25));
    }};

    for (Serie serie: minhasSeries1) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() +
              " - " + serie.getTempoEpisodio());
    }

    System.out.println("-- Ordem Natural (TempoEpisodio) --");

    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    for (Serie serie: minhasSeries2) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() +
              " - " + serie.getTempoEpisodio());
    }
  }

  public static class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
      this.nome = nome;
      this.genero = genero;
      this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
      return nome;
    }

    public String getGenero() {
      return genero;
    }

    public Integer getTempoEpisodio() {
      return tempoEpisodio;
    }

    @Override
    public String toString() {
      return "{" +
              "nome='" + nome + '\'' +
              ", genero='" + genero + '\'' +
              ", tempoEpisodio=" + tempoEpisodio +
              '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Serie serie)) return false;
      return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie serie) {
      int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
      if(tempoEpisodio != 0) return tempoEpisodio;
      return this.getGenero().compareTo(serie.getGenero());
    }
  }
}
