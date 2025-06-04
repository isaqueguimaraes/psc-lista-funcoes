import java.util.Scanner;

public class Questao5 {
  static double somaImposto(double taxaImposto, double valorItem) {
    double valorFinal = valorItem + (valorItem * taxaImposto / 100);
    return valorFinal;
  }

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite o valor da taxa de imposto: ");
    double taxaImposto = leitura.nextDouble();

    System.out.print("Digite o valor do item: ");
    double valorItem = leitura.nextDouble();

    double resultado = somaImposto(taxaImposto, valorItem);

    System.out.println("O valor total a ser pago, incluindo impostos é: R$ " + resultado);

    leitura.close();
  }
}
