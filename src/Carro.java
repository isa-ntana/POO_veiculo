public class Carro extends Veiculo{
    private int numerodePortas;
    Motor motor;

    public Carro(String marca, String modelo, int ano, int numerodePortas, Motor motor){
        super(marca, modelo, ano);
        this.numerodePortas = numerodePortas;
        this.motor = motor;
    }

    private int getNumerodePortas() {
        return numerodePortas;
    }

    private Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\n Motor: "+motor);
        model.append("\n Número de portas: "+numerodePortas);
        return model.toString();
    }
}
