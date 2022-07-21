package recursion;

public class Rekursion {
    public static void main(String[] args) {

        // Was ist Rekursion?
        /*
        Was sind mögliche Fehler, die bei unvorsichtiger Verwendung
        von rekursiven Methoden auftreten können?
        Wie können solche Fehler vermieden werden?

        Antwort: Mögliche Fehler die bei der Implementierung von rekursiven Funktionen entstehen können sind eine
        falsche Implementation eines rekursiven Aufrufs, der falsche Umgang mit Indices, was zu einem unendlich
        laufenden Funktionsaufruf führen kann, und das Vergessen einer Abbruchbedingung.
         */


        /*
        Wie unterscheiden sich die beiden folgenden rekursiven Methoden?
        Welche Ausgabe ist zu erwarten?
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Methode zählen:");
        zählen(0, arr);
        System.out.println("Methode zählen1:");
        zählen1(0, arr);

        /*
        Entwerfe eine Funktion, die rekursiv alle Teiler einer gegebenen Zahl berechnet.
         */

        System.out.println("Methode berechneTeiler:");
        berechneTeiler(15, 15);
        berechneTeiler(42, 42);
        System.out.println("Methode iterativeTeiler:");
        iterativeTeiler(15);


        /*
        Praxisbezug: Wann sind rekursive Methoden iterativen Methoden vorzuziehen?


        Antwort: Eine rekursive Methode ist dann zu bevorzugen, wenn die Lösung eines Problems eine in sich selbst
        geschachtelte Struktur besitzt.
         */


        System.out.println(euklid(187, 23));

    }
    public static void berechneTeiler(int wert, int teiler){
        if(teiler == 0){
            return;
        }
        if(wert%teiler==0){
            System.out.println(teiler);
        }
        berechneTeiler(wert, teiler-1);
    }

    public static void iterativeTeiler(int wert){
        for (int i = 1; i <= wert; i++) {
            if(wert%i==0){
                System.out.println(i);
            }
        }
    }

    public static void zählen(int i, int[] arr) {
        if (i >= arr.length) {
            return;
        }
        System.out.println(arr[i]);
        zählen(i + 1, arr);
    }

    public static void zählen1(int i, int[] arr) {
        if (i >= arr.length) {
            return;
        }
        zählen1(i + 1, arr);
        System.out.println(arr[i]);
    }

    public static int euklid(int a, int b){
        if(a == b){
            return a;
        }
        else if(a > b){
            return euklid(a-b, b);
        }
        else if(a < b){
            return euklid(a, b-a);
        }
        return 1;
    }

}
