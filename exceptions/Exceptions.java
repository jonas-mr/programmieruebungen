package exceptions;

public class Exceptions {
    public static void main(String[] args) {
        // Versuche die Methode immerBereit auszuführen und dabei mögliche Fehlermeldung abzufangen.
        // Bei einer gefangenen Fehlermeldung soll die StackTrace und der Inhalt der Fehlermeldung ausgegeben werden.
        try{
            immerBereit("yes");
        }catch (KeinBockException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    // Die Methode immerBereit soll "Jaa!" ausgeben, wenn der Eingabe String "ja" ist.
    // Ansonsten soll sie eine KeinBockException werfen.
    public static void immerBereit(String yesNo) throws KeinBockException{
       System.out.println("Seid ihr bereit?");
       if(yesNo.equals("ja")){
           System.out.println("Jaa!");
       }
       else{
           throw new KeinBockException("Keiner hat Bock.");
       }

    }
}
