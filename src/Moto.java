public class Moto extends Veiculo {
    private String tipodeGuidao;
    Motor motor;

    public Moto(String marca, String modelo, int ano, String tipodeGuidao, Motor motor){
        super(marca, modelo, ano);
        this.tipodeGuidao = tipodeGuidao;
        this.motor = motor;
    }

    private String getTipodeGuidao() {
        return tipodeGuidao;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\n Motor: "+motor);
        model.append("\n Tipo de guidão: "+tipodeGuidao);
        return model.toString();
    }
}
