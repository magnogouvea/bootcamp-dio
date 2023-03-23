package Java.fluxo;

public class ControleDeFluxo {
  public static void main(String[] args) {
    int idade = 20;
    String olhos = "verdes";
    String status;

    //Operador ternário
    status = idade < 18 ? "Não adulto" : "Adulto";
    //Operador if
    if(idade < 18) {
      System.out.println("Não adulto");
    } else {
      System.out.println("Adulto");
    } //ambos terão o mesmo resultado
    System.out.println(status);

    //Forma simplificada de switch
    switch (olhos) {
      case "azuis" -> System.out.println("Olhos azuis");
      case "verdes" -> System.out.println("Olhos verdes");
      default -> System.out.println("Olhos não identificados");
    }
  }
}
