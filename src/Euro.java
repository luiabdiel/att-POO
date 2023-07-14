public class Euro extends Moeda {
    public Euro(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.print(" Euro - €" + valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.39;
    }
}
