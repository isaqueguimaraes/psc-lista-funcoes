import java.util.Scanner;

public class Questao1 {

  static void imprimir(int n) {

    for (int i = 1; i <= n; i++) {

      for (int x = 1; x <= i; x++) {
        System.out.print(i + " ");
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