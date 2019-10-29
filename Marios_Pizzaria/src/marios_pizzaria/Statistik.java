package marios_pizzaria;

/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 /
package marios_pizzaria;

/
 * @author Alexander / Morten
 */



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.PrintWriter;

// Statistik klasse til at håndtere filskrivning/fillæsning så der kan ses hvilke pizzaer er blevet solgt.
public class Statistik {

    // Constructor
    public Statistik() throws IOException {
        //menu.getPizza(0); // ??
    }

    // Metode som skriver pizzaerne over til en fil, som dermed bliver den fil statestikken bliver vist fra.
    public void skrivStatistik(String s) {
        try {
            File f = new File("solgtePizzaer.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw); //init BufferedWriter til at skrive i filen
            bw.write(s);
            bw.write("\r\n");
            bw.flush();

        } catch (IOException ex) {
           System.out.println("Der er sket en fejl.");
        }
    }

    // Metode som bruger en scanner til at læse indholdet i filen "solgtePizzaer" og dermed viser alle de solgte pizzaer.
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
            System.out.println("Der er sket en fejl.");
        }
    }

    public void CountPizza() {          //@Author - Morten - Tæller antallet af pizzaer solgt
        try {

            File file = new File("solgtePizzaer.txt");

            if (file.exists()) {

                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                Menukort newMenukort = new Menukort();
                //int pizzanummer = 0;
                //int pizzapris = 0;
                int linenumber = 0;

                while (lnr.readLine() != null) {

                    linenumber++;
                    //pizzanummer = newMenukort.getNr(linenumber);
                    //pizzapris = (int) newMenukort.getPris(pizzanummer);
                    //System.out.println(pizzanummer);
}

                System.out.println("Der er blevet solgt: " + linenumber + " pizzaer");

                lnr.close();

            } else {
                System.out.println("Filen eksisterer ikke!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void getNr() throws IOException {                     //@Morten - laver en ny tekst fil med første ord i linjen for at kunne få pizza nr
        //Implementer scanner
        String fileNameOutput = "OutputFile.txt";
        try (Scanner sc = new Scanner(new File("solgtePizzaer.txt"));
                PrintWriter outputStream = new PrintWriter(fileNameOutput);) {
            while (sc.hasNextLine()) {
                outputStream.println(sc.next());// write first word from line
                sc.nextLine();// consume rest of text from that line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
