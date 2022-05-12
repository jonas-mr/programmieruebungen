package collections;


import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Collections {
    public static void main(String[] args){
        // ==== Arrays ====
        // initialisiere ein Array mit den Werten 1, 3, 1, 4
        int[] werte = {1,3,1,4};
        int[] werte2 = new int[4];
        // Versuche den Wert 7 hinzuzufügen
            // nicht möglich da Arrays nicht erweiterbar sind
        // Ändere den Wert an der 2. Stelle auf 6
        werte[1] = 6;
        // gib alle Werte mit geraden Index aus
        for (int i = 0; i < werte.length; i++) {
            if(i%2== 0){
                System.out.print(werte[i]);
            }

        }
        for (int w:werte) {
            System.out.println(w);
        }
        // Wann kommen Arrays zum Einsatz?

        // ==== Lists ====
        // fülle eine List mit den Werten 1, 9, 6, 4
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(9);
        liste.add(6);
        liste.add(4);
        // füge den Wert 1951 hinzu
        liste.add(1951);
        // gib alle Werte aus, die größer als 5 sind
        for (Integer wert:liste) {
           if(wert > 5){
               System.out.println(wert);
           }
        }
        for (int i = 0; i < liste.size(); i++) {
            if(liste.get(i) > 5){
                System.out.println(liste.get(i));
            }
        }
        // Wann ist es sinnvoll Listen statt Arrays zu verwenden?

        //==== Sets ====
        // fülle ein Set mit den Werten 1,9,1,7
        Set<Integer> menge = new HashSet<>();
        menge.add(1);
        menge.add(9);
        menge.add(1);
        menge.add(7);
        // wie groß ist das Set?
        System.out.println(menge.size());
        // Gib den größten Wert des Sets aus
        SortedSet<Integer> neueMenge = new ConcurrentSkipListSet<>(menge);
        System.out.println(neueMenge.last());

        int highest = 0;
        for (Integer wert:menge) {
            if(wert > highest){
                highest = wert;
            }
        }
        System.out.println(highest);

        // ==== HashMaps ====
        /*
         fülle eine Map mit den Werten
         "Georg Elser", "04.Januar 1903", "09.April 1945", "Attentäter, Zivilist"
         mit geeigneten Schlüsseln
         */
        HashMap<String,String> elser = new HashMap<>();
        elser.put("Name", "Georg Elser");
        elser.put("Geburtstag","04.Januar 1903" );
        elser.put("Todestag", "09.April 1945");
        elser.put("Status", "Attentäter, Zivilist");
        /*
        fülle eine weitere Map mit gleichem Aufbau mit den Werten
         "Claus von Stauffenberg", "15. November 1907", "21. Juli 1944", "Attentäter, Militär"
         */
        HashMap<String,String> stauffenberg = new HashMap<>();
        stauffenberg.put("Name", "Claus von Stauffenberg");
        stauffenberg.put("Geburtstag","15. November 1907" );
        stauffenberg.put("Todestag", "21. Juli 1944");
        stauffenberg.put("Status", "Attentäter, Militär");
        /*
        fülle eine weitere Map mit gleichem Aufbau mit
         den Werten "Josip Broz Tito", "17. Mai 1892", "04. Mai 1980", "Partisan, Kommunist"
         */
        HashMap<String,String> tito = new HashMap<>();
        tito.put("Name", "Josip Broz Tito");
        tito.put("Geburtstag","17. Mai 1892" );
        tito.put("Todestag", "04. Mai 1980");
        tito.put("Status", "Partisan, Kommunist");
        // sammle alle Maps in einer geeigneten Struktur
        ArrayList<HashMap<String, String>> widerstand = new ArrayList<>();
        widerstand.add(elser);
        widerstand.add(stauffenberg);
        widerstand.add(tito);
        // gib die Namen aller Personen in dieser Struktur aus
        for (HashMap wk:widerstand) {
            System.out.println(wk.get("Name"));
        }



    }

}
