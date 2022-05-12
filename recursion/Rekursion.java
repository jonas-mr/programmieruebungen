package recursion;

public class Rekursion {
    public static void main(String[] args) {

        // Was ist Rekursion?
        /*
        Was sind mögliche Fehler, die bei unvorsichtiger Verwendung
        von rekursiven Methoden auftreten können?
        Wie können solche Fehler vermieden werden?
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
         */

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

}
