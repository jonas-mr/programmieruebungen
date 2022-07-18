package radio;

public class Main {
    public static void main(String[] args) {
        /*
        Ein Radio
         */
        Radio rd = new Radio();
        try {
            rd.setFrequenz(120.5);
        }catch (FrequencyNotFoundException fnfe){
            System.err.println(fnfe.getMessage());
        }
        try {
            rd.setFrequenz(104);
        }
        catch (FrequencyNotFoundException fnfe)
        {
            fnfe.getMessage();
        }
        System.out.println("Radio vorbei");
    }
}
