public class Real extends Moeda {
    public Real(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.print("Real - R$" + valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }
}
