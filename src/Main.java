public class Main {
    public static void main(String[] args) {

        System.out.println("Veículos:");

        System.out.println("\n Informações do carro");
        Motor motor = new Motor (1.6, "Flex");
        Carro carro = new Carro("Fiat", "Uno", 1995, 4, motor);
        System.out.println(carro);

        System.out.println("\n Informações da moto:");
        Motor motor2 = new Motor (1.0, "Gasolina");
        Moto moto = new Moto("Kawasaki","Vulcan S",2015,"Cruiser", motor2);
        System.out.println(moto);
    }
}