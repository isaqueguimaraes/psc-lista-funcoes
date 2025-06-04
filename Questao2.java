import java.util.Scanner;

public class Questao2 {

  static void imprimir(int n) {

    for (int i = 1; i <= n; i++) {

      for (int x = 1; x <= i; x++) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int n = leitura.nextInt();

    imprimir(n);

    leitura.close();
  }
}