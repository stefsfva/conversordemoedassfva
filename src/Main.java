import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Conversor de Moedas");
            System.out.println("1. USD para CNY");
            System.out.println("2. USD para ARS");
            System.out.println("3. USD para BRL");
            System.out.println("4. USD para BOB");
            System.out.println("5. USD para GBP");
            System.out.println("6. BRL para CNY");
            System.out.println("7. BRL para ARS");
            System.out.println("8. BRL para BOB");
            System.out.println("9. BRL para GBP");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            String paraMoeda = "";
            String deMoeda = opcao <= 5 ? "USD" : "BRL";
            switch (opcao) {
                case 1:
                    paraMoeda = "CNY";
                    break;
                case 2:
                    paraMoeda = "ARS";
                    break;
                case 3:
                    paraMoeda = "BRL";
                    break;
                case 4:
                    paraMoeda = "BOB";
                    break;
                case 5:
                    paraMoeda = "GBP";
                    break;
                case 6:
                    paraMoeda = "CNY";
                    break;
                case 7:
                    paraMoeda = "ARS";
                    break;
                case 8:
                    paraMoeda = "BOB";
                    break;
                case 9:
                    paraMoeda = "GBP";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            try {
                double valorConvertido = ConversorDeMoedas.converter(deMoeda, paraMoeda, valor);
                System.out.printf("%.2f %s é equivalente a %.2f %s%n", valor, deMoeda, valorConvertido, paraMoeda);
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao converter moedas: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
