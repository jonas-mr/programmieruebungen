package interfaces;

public class Softdrink extends Getränk{
    private boolean koffeinhaltig;

    public Softdrink(String name, String sorte, String hersteller, double preis, boolean koffeinhaltig) {
        super(name, sorte, hersteller, preis);
        this.koffeinhaltig = koffeinhaltig;
    }

}
