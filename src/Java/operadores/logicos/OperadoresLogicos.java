package Java.operadores.logicos;

public class OperadoresLogicos {
  public static void main(String[] args) {
    double salarioMensal = 11893.58d;
    double mediaMensal = 10500d;

    int quantidadeDependentes = 4;
    int mediaDependentes = 2;

    System.out.println((salarioMensal > mediaMensal) && (quantidadeDependentes >= mediaDependentes));

    boolean salarioBaixo = salarioMensal < mediaMensal;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

    System.out.println((salarioBaixo) && (muitosDependentes));

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    System.out.println("recebeAuxilio " + recebeAuxilio);
  }
}
