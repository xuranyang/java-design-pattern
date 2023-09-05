package bridge_pattern.example1;

public class Client {
    public static void main(String[] args) {
        BMW bmw = new BMW(new AutoEngine());
        bmw.run();

        Audi audiAuto = new Audi(new AutoEngine());
        audiAuto.run();

        Benz manualBenZ = new Benz(new ManualEngine());
        manualBenZ.run();

    }
}
