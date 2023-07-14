public class Real extends Moeda {
    public Real(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.println("Real - R$" + valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.valor != ((Real) obj).valor) {
            return false;
        }

        return true;
    }
}
