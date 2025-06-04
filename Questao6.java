import java.util.Scanner;

public class Questao6 {

  static int converter(int hora24) {
    if (hora24 == 0) {
      return 12;
    } else if (hora24 > 12) {
      return hora24 - 12;
    } else {
      return hora24;
    }
  }

  static char verificar(int hora24) {
    if (hora24 >= 0 && hora24 <= 11) {
      return 'A';
    } else {
      return 'P';
    }
  }

  static void exibir(int hora12, int minutos, char ampm) {
    String periodo = (ampm == 'A') ? "A.M." : "P.M.";
    System.out.printf("\nHora convertida: %d:%02d%s\n", hora12, minutos, periodo);
  }

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    char opcao;
    do {
      System.out.print("\nDigite a hora (0 a 23): ");
      int hora24 = leitura.nextInt();

      System.out.print("Digite os minutos (0 a 59): ");
      int minutos = leitura.nextInt();

      int hora12 = converter(hora24);
      char ampm = verificar(hora24);

      exibir(hora12, minutos, ampm);

      System.out.println("\nDeseja converter outro horário? (Digite S para Sim ou N para Não)");
      opcao = leitura.next().charAt(0);

    } while (opcao == 's');

    leitura.close();
  }
}