import java.util.Scanner;

public class Questao4 {

  static char verificacao(int numero) {
    if (numero > 0) {
      return 'P';
    } else {
      return 'N';
    }
  }

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite seu número: ");
    int numero = leitura.nextInt();

    System.out.println("Resultado: " + verificacao(numero));

    leitura.close();
  }
}