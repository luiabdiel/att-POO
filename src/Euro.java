public class Euro extends Moeda {
    public Euro(double initialValue) {
        this.valor = initialValue;
    }

    @Override
    public void info() {
        System.out.println("Euro - €" + valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.39;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.valor != ((Euro) obj).valor) {
            return false;
        }

        return true;
    }
}
