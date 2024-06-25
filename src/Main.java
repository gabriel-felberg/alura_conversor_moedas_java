import api.Server;

import java.io.IOException;
import java.util.Scanner;

import static api.Server.getCoin;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {

        start();

    }

    public static void start() throws IOException, InterruptedException {

        int option = message();

        while (option != 9) {
            switch (option) {
                case 1:
                    request("EUR", "USD");
                    break;
                case 2:
                    request("USD", "BOB");
                    break;
                case 3:
                    request("USD", "BRL");
                    break;
                case 4:
                    request("BRL", "USD");
                    break;
                case 5:
                    request("EUR", "BRL");
                    break;
                case 6:
                    request("BRL", "EUR");
                    break;
                case 7:
                    request("BRL", "ARS");
                    break;
                case 8:
                    request("CLP", "BRL");
                    break;
                default:
                    System.out.println("O valor: " + option + " é inválido");
                    break;
            }
            option = 9;
        }
    }

    public static void request(String from, String to) throws IOException, InterruptedException {
        String baseURL = "https://v6.exchangerate-api.com/v6/";
        String key = "436dd95f75eb678d7a31e70a";

        clearConsole();

        System.out.println("Digite a quantidade de moedas");
        int moedas = scanner.nextInt();

        var response = getCoin(key, baseURL, from, to);

        clearConsole();

        double convertation = response.getValueTransaction() * moedas;

        System.out.println("--------------------------------");
        System.out.println("De: " + response.getCoinFrom());
        System.out.println("Para: " + response.getCoinTo());
        System.out.println("Valor: " + convertation + " " + response.getCoinFrom());
        System.out.println("--------------------------------");


        resetProgram();

    }

    public static void resetProgram() throws IOException, InterruptedException {
        System.out.print("""
                 \n
                ------------------------------
                 1- Sim
                 2- Não
                ------------------------------
                """);

        var reset = scanner.nextInt();

        if (reset == 1) {
            clearConsole();
            start();
        } else if (reset == 2) {
            clearConsole();
            System.out.println("Programa finalizado");
        } else {
            clearConsole();
            System.out.println("Valor invalido, digite um valor valido");
            resetProgram();
        }

    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int message() {

        System.out.print("Qual moeda você quer transacionar?");

        System.out.print("""
                  \n
                 ------------------------------
                 1- Euro para Dolar
                 2- Dolar para Bolivano
                 3- Dolar para Real
                 4- Real para Dolar
                 5- Euro para Real
                 6- Real para Euro
                 7- Real para Peso argentino
                 8- Peso chileno para Real
                 9- Sair
                 ------------------------------
                """);
        return scanner.nextInt();
    }
}
