package i_o_strings;

import java.io.*;

public class Strings {
    public static void main(String[] args) {

        //Was ist der Unterschied zwischen String und StringBuilder

        // Wann ist ein String zum verarbeiten ausreichend?
        // Wann wird ein StringBuilder benötigt?





        String n = new String("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(1000);
        n = n + "World";
        sb.append("World");
        System.out.println(n);
        System.out.println(sb);
        sb.reverse();
        n += 0.1;
        System.out.println(n);
        System.out.println(sb==sb2);

        //Schreibe eine Funktion um die Datei textfile.txt zu lesen
        String input = readFile("textfile.txt");

        /*
        Zur besseren Lesbarkeit soll die Datei textfile.txt so formatiert werden,
        dass nach jedem Punkt, der nicht zu einem Datum gehört, ein Zeilenumbruch
        eingefügt wird.
         */
        String output = insertLineBreaks(input);



        //Schreibe eine Funktion um den formatierten Text zu speichern.
        writeFile("TextFile2.txt", output);



    }

    public static String readFile(String textfile){
        File file = new File(textfile);
        StringBuilder text = new StringBuilder(500);

        try(
                FileReader fileReader = new FileReader("semester_1/sose_mup/src/i_o_strings/" + file);
                BufferedReader br = new BufferedReader(fileReader)
        )
        {
            String line = br.readLine();
            while (line != null){
                text.append(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException fe){
            fe.printStackTrace(System.err);
        }
        catch (IOException e){
            e.printStackTrace(System.err);
        }
        return text.toString();
    }

    public static String insertLineBreaks(String input){
        StringBuilder text = new StringBuilder(input);
        for (int i = 0; i < text.length(); i++) {
            int ch = text.charAt(i);
            if(ch == '.'){
                text.insert(i+1, '\n');
            }
        }
        return text.toString();
    }

    public static void writeFile(String filename, String text){
        File file = new File("semester_1/sose_mup/src/i_o_strings/" + filename);
        try(
                FileWriter fw = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fw);
                ){
            writer.write(text);
        }
        catch (FileNotFoundException fEx){
            fEx.printStackTrace(System.err);
        }
        catch (IOException ioEx){
            ioEx.printStackTrace(System.err);
        }
    }
}
