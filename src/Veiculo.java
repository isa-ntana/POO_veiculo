public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String getMarca() {
        return marca;
    }

    private String getModelo() {
        return modelo;
    }

    private int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("\n Marca: "+marca);
        model.append("\n Modelo: "+modelo);
        model.append("\n Ano: "+ano);
        return model.toString();
    }
}
