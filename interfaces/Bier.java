package interfaces;

import java.util.Scanner;

public class Bier extends Getränk implements Alkohlhaltig{


    public Bier(String name, String sorte, String hersteller, double preis) {
        super(name, sorte, hersteller, preis);
    }

    @Override
    public boolean altersüberprüfung() {
        Scanner lesen = new Scanner(System.in);
        System.out.println("Sind Sie über 16 Jahre alt? [y/n]");
        String answ = lesen.nextLine();
        if(answ.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }
}
