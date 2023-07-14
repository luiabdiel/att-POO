public class Main {
    public static void main(String[] args) {
        //Menu menu = new Menu();
        //menu.showMenu();

        Cofrinho cofrinho = new Cofrinho();

        Real real = new Real(5);
        Dolar dolar = new Dolar(5);
        Euro euro = new Euro(5);

        cofrinho.adicionar(real);
        cofrinho.adicionar(dolar);
        cofrinho.adicionar(euro);

        cofrinho.listagemMoedas();
    }
}