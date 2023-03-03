package arrays;

public class OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = {-5, 75, -12, 10, 8, 49};

    System.out.print("Vetor for: ");
    for(int i = (vetor.length - 1); i >= 0 ; i--) {
      System.out.print(vetor[i] + " ");
    }

    System.out.print("\nVetor While: ");
    int count = 0;
    while(count < (vetor.length)) {
      System.out.print(vetor[count] + " ");
      count++;
    }
  }
}
