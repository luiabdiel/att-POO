public class Dolar extends Moeda {

    public Dolar(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.println("Dólar - $" + valor);
    }

    @Override
    public double converter() {
        return this.valor * 4.80;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.valor != ((Dolar) obj).valor) {
            return false;
        }

        return true;
    }
}
