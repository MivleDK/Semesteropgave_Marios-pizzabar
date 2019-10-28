package marios_pizzaria;

/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 /
package marios_pizzaria;

/
 * @author Alexander Pihl
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Statistik {

    public Statistik() throws IOException {
    }
    
    public void skrivStatistik(String s) {
        try {
            File f = new File("solgtePizzaer.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s); // ??
            bw.write("\r\n");
            bw.flush();

        } catch (IOException ex) {
        }
    }

    public void visStatistik() {
        try {
            File myObj = new File("solgtePizzaer.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}