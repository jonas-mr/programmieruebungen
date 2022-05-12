package interfaces;

public abstract class Getränk {
    private String name;
    private String sorte;
    private String hersteller;
    private double preis;

    public void verkaufen(double gegeben){
        System.out.println("Das macht dann " + preis + "€.");
    }

    public Getränk(String name, String sorte, String hersteller, double preis) {
        this.name = name;
        this.sorte = sorte;
        this.hersteller = hersteller;
        this.preis = preis;
    }

}
