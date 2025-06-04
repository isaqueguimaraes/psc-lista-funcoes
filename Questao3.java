import java.util.Scanner;

public class Questao3 {

  static int somar(int a, int b, int c) {
    int soma = a + b + c;
    return soma;
  }

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numeroUm = leitura.nextInt();

    System.out.print("Digite o segundo número: ");
    int numeroDois = leitura.nextInt();

    System.out.print("Digite o terceiro número: ");
    int numeroTres = leitura.nextInt();

    int resultado = somar(numeroUm, numeroDois, numeroTres);

    System.out.println("A soma dos três números é: " + resultado);

    leitura.close();
  }
}
