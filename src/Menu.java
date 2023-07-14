import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Cofrinho cofrinho;

    public Menu() {
        scanner = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }
    public void showMenu() {
        System.out.println("COFRINHO:");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular valor total convertido para Real");
        System.out.println("0 - Encerrar");

        System.out.print("Escolha uma opção: ");
        String optionSelected= scanner.next();

        switch (optionSelected) {
            case "0":
                System.out.println("Programa encerrado");
                break;

            case "1":
                showMenuAddCoins();
                showMenu();
                break;

            case "2":
                showMenuRemoveCoins();
                showMenu();
                break;

            case "3":
                cofrinho.listagemMoedas();
                showMenu();
                break;

            case "4":
                double totalConverted = cofrinho.totalConvertido();
                System.out.println("Valor total convertido: R$" + totalConverted);
                showMenu();
                break;

            default:
                System.out.println("Opção inválida!");
                showMenu();
                break;
        }
    }

    private void showMenuAddCoins() {
        System.out.println("Escolha uma moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        System.out.print(">> ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valueCoin = scanner.nextDouble();

        if (option == 1) {
            Real coin = new Real(valueCoin);
            cofrinho.adicionar(coin);
        } else if (option == 2) {
            Dolar coin = new Dolar(valueCoin);
            cofrinho.adicionar(coin);
        } else if (option == 3) {
            Euro coin = new Euro(valueCoin);
            cofrinho.adicionar(coin);
        } else {
            System.out.println("Opção inválida!");
            showMenu();
        }

        System.out.println("Moeda adicionada!");
    }

    private void showMenuRemoveCoins() {
        System.out.println("Escolha uma moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        System.out.print(">> ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valueCoin = scanner.nextDouble();

        if (option == 1) {
            Real coin = new Real(valueCoin);
            cofrinho.remover(coin);
        } else if (option == 2) {
            Dolar coin = new Dolar(valueCoin);
            cofrinho.remover(coin);
        } else if (option == 3) {
            Euro coin = new Euro(valueCoin);
            cofrinho.remover(coin);
        } else {
            System.out.println("Opção inválida!");
            showMenu();
        }
    }
}