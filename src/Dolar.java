public class Dolar extends Moeda {

    public Dolar(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.print(" Dólar - $" + valor);
    }

    @Override
    public double converter() {
        return this.valor * 4.80;
    }
}
