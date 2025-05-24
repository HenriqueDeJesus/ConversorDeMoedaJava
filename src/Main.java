import br.com.conversordemoeda.conexao.RequisicaoMoeda;
import br.com.conversordemoeda.conversao.ConversorDaMoeda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RequisicaoMoeda requisicaoMoeda = new RequisicaoMoeda();
        ConversorDaMoeda conversor = new ConversorDaMoeda();
        Scanner scanner = new Scanner(System.in);
        String siglaMoedaArgentina = "ARS";
        String siglaMoedaColombiana = "COP";
        String siglaMoedaBrasileira = "BRL";
        int opcao;
        double valorDeConversao;

        try {
            do {
                System.out.println("*******************************************************");
                System.out.println("Seja bem-vindo/a ao Conversor de Moedas:");
                System.out.println("1) Dólar =>> Peso argentino");
                System.out.println("2) Peso argentino =>> Dólar");
                System.out.println("3) Dólar =>> Real brasileiro");
                System.out.println("4) Real brasileiro =>> Dólar");
                System.out.println("5) Dólar =>> Peso colombiano");
                System.out.println("6) Peso colombiano =>> Dólar");
                System.out.println("7) Sair");
                System.out.print("Escolha uma opção válida: \n");
                System.out.println("*******************************************************");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.dolarParaMoeda(siglaMoedaArgentina, valorDeConversao));
                        break;

                    case 2:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.moedaParaDolar(siglaMoedaArgentina, valorDeConversao));
                        break;

                    case 3:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.dolarParaMoeda(siglaMoedaBrasileira, valorDeConversao));
                        break;

                    case 4:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.moedaParaDolar(siglaMoedaBrasileira, valorDeConversao));
                        break;

                    case 5:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.dolarParaMoeda(siglaMoedaColombiana, valorDeConversao));
                        break;

                    case 6:
                        System.out.println("Digite o valor que deseja converter: ");
                        valorDeConversao = scanner.nextDouble();
                        System.out.println(conversor.moedaParaDolar(siglaMoedaColombiana, valorDeConversao));
                        break;

                    case 7:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            }while (opcao != 7);

            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Use virgula e não ponto / Use a vírgula somente se tiver casa decimal");
        }
    }
}