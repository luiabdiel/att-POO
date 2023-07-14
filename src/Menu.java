import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }
    public void showMenu() {
        System.out.println("COFRINHO:");
        System.out.println("1 - Adicionar moeda:");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("0 - Encerrar");

        System.out.print("Escolha uma opção: ");
        String optionSelected= scanner.next();

        switch (optionSelected) {
            case "0":
                System.out.println("Programa encerrado");
                break;
            case "1":

            default:
                System.out.println("Opção inválida!");
                showMenu();
                break;
        }
    }
}