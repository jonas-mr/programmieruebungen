package radio;

import java.util.ArrayList;
import java.util.List;

public class BluetoothRadio extends Radio{
    //true ist bluetooth, false ist FM
    private boolean abspielmodus;
    private List<String> gekoppelteGeräte;

    public BluetoothRadio(){
        super();
        this.abspielmodus = false;
        this.gekoppelteGeräte = new ArrayList<>();
    }

    public void setAbspielmodus(){
        this.abspielmodus = !this.abspielmodus;
        if(gekoppelteGeräte.isEmpty())
        {
            this.abspielmodus = false;
        }

    }

    public boolean koppeln(String geraet){
        this.gekoppelteGeräte.add(geraet);
        return true;
    }

    public List<String> getGekoppelteGeräte() {
        return gekoppelteGeräte;
    }

    public boolean getAbspielmodus() {
        return abspielmodus;
    }
}
