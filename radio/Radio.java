package radio;

import java.util.HashMap;

public class Radio {
    private boolean powerStatus;
    private double frequenz;
    private int lautstaerke;
    private HashMap<String, Double> senderListe;

    public Radio(){
        this.powerStatus = true;
        this.frequenz = 99.0;
        this.lautstaerke = 13;
        this.senderListe = new HashMap<>();
    }

    public Radio(boolean powerStatus, double frequenz, int lautstaerke){
        this.powerStatus = powerStatus;
        this.frequenz = frequenz;
        this.lautstaerke = lautstaerke;
        this.senderListe = new HashMap<>();
    }

    public boolean senderSpeichern(String senderName){
        if(!senderListe.containsKey(senderName)) {
            this.senderListe.put(senderName, this.frequenz);
            return true;
        }
        else{
            System.out.println("Sender mit diesem Namen existiert bereits!");
            return false;
        }

    }

    public void setFrequenz(double neueFrequenz)
    throws FrequencyNotFoundException{
        if(neueFrequenz >= 85 && neueFrequenz <= 110) {
            this.frequenz = neueFrequenz;
            System.out.println("Neue Frequenz auf: " + this.frequenz);
        }
        else{
            throw new FrequencyNotFoundException("Die angegebene Frequenz ist nicht zulässig! Frequenzbereich 85-110. Eingegebene Frequenz: " + neueFrequenz);
        }

    }

    public void setPowerStatus(){
        this.powerStatus = !this.powerStatus;
    }

    public void setLautstaerke(int neueLautstaerke){
        if(0 <= neueLautstaerke && neueLautstaerke <= 30){
            this.lautstaerke = neueLautstaerke;
        }
        else{
            System.out.println("Neuer Lautstärkewert liegt außerhalb des erwarteten Bereichs! (0-30)");
        }
    }

    public double getFrequenz() {
        return frequenz;
    }

    public HashMap<String, Double> getSenderListe() {
        return senderListe;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

}
