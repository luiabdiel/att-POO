import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> coinList;

    public Cofrinho() {
        this.coinList = new ArrayList<>();
    }

    public void adicionar(Moeda coin) {
        this.coinList.add(coin);
    }

    public void remover(Moeda coin) {
        this.coinList.remove(coin);
    }

    public void listagemMoedas() {
        if (this.coinList.isEmpty()) {
            System.out.println("O cofrinho está vazio :(");
            return;
        }

        for (Moeda coin : this.coinList) {
            coin.info();
        }
    }

    public double totalConvertido() {
        if (this.coinList.isEmpty()) {
            return 0;
        }

        double accValue = 0;

        for (Moeda coin : this.coinList) {
            accValue += coin.converter();
        }

        return accValue;
    }
}
