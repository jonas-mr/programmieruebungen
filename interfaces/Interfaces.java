package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Interfaces {
    public static void main(String[] args){

        Softdrink cola = new Softdrink("Coole-Cola", "Cola", "Nestle" , 1.99 , true);
        Bier bier = new Bier("Jever", "Bier", "Radeberger", 0.69);

        List<Getränk> kasten = new ArrayList<>();
        kasten.add(bier);
        kasten.add(cola);




        // Was sind Interfaces und für was werden sie genutzt?

        // Was kann in Interfaces definiert werden?

        // Was unterscheidet Interfaces von Klassen, abstrakten Klassen und Superklassen?



        // Übung:
        // Erstelle eine Klasse Getränk mit den Attributen Name, Sorte, Hersteller
        // Erstelle ein Interface Alkoholhaltig mit der abstrakten Methode altersüberprüfung und der konstanten Variable Alkoholsteuer
        // Erstelle eine Klasse Softdrink mit den Attributen koffeinhaltig
        // Erstelle eine Klasse Bier mit den Attributen Alkoholgehalt

    }
}
