public class Motor {
    private double potencia;
    private String tipo;

    public Motor(double potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    private String getTipo() {
        return tipo;
    }

    private double getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("Potência: "+potencia);
        model.append(" - Tipo: "+tipo);
        return model.toString();
    }
}
