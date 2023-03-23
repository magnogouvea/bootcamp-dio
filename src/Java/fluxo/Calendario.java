package Java.fluxo;

public class Calendario {
  public static void main(String[] args) {
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    // código abaixo é uma forma mais robusta
    for (int i = 0; i < meses.length; i++) {
      if (meses[i].equals("Fevereiro")) {
        System.out.println("Mês: " + meses[i] + " - 28 dias");
      } else if (meses[i].equals("Abril") || meses[i].equals("Junho") || meses[i].equals("Setembro") || meses[i].equals("Novembro")) {
        System.out.println("Mês: " + meses[i] + " - 30 dias");
      } else if (meses[i].equals("Janeiro") || meses[i].equals("Julho") || meses[i].equals("Dezembro")) {
        System.out.println("Férias! " + meses[i]);
      } else {
        System.out.println("Mês: " + meses[i] + " - 31 dias");
      }
    }

    //agora uma forma mais simplificada
    for (String mes : meses) {
      String message = switch (mes) {
        case "Fevereiro" -> "Mês: " + mes + " - 28 dias";
        case "Abril", "Junho", "Setembro", "Novembro" -> "Mês: " + mes + " - 30 dias";
        case "Janeiro", "Julho", "Dezembro" -> "Férias! " + mes;
        default -> "Mês: " + mes + " - 31 dias";
      };
      System.out.println(message);
    }

  }
}
