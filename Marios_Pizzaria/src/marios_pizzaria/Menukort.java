/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

/*
 * @author Mick Larsen & Morten Rasmussen
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menukort {

    //Init ArrayList til at holde menukortet
    protected ArrayList<String> menukortArr = new ArrayList<>();

    /**
     * Forudsætter: .txt fil på disk med én pizza på hver linje. Hvert element
     * på linjen skal være separeret med mellemrum Hver linje skal starte med
     * <pizza nr> <pizza navn> <pizza pris> <pizza ingrediens 1>
     * <pizza ingrediens 2> <pizza ingrediens osv.>
     *
     * Metodekald: Ingen parametre Output:
     *
     * @throws java.io.IOException
     */
    protected Menukort() throws IOException {           //opretter et menukort array der læser menuen fra fil
        BufferedReader objReader = null;
        String strCurrentLine;
        objReader = new BufferedReader(new FileReader("menu2.txt"));

        while ((strCurrentLine = objReader.readLine()) != null) {
            menukortArr.add(strCurrentLine);
        }
    }

    protected String getPizza(int i) {                      //Gør at man kan kalde på en bestemt pizza

        return menukortArr.get(i - 1);
    }

    protected double getPris(int n) throws IOException {    //kan finde prisen på en pizza i et arrayet ved at indtaste pizza nr
        n = n - 1;
        String test = (String) menukortArr.get(n);
        String[] splited = test.split("\\s+");
        String temp = splited[2];
        double pris = Double.parseDouble(temp);

        return pris;
    }

    protected void getMenu() {                              //@MLA: Outputter hele menukortet
        for (int i = 0; i < menukortArr.size(); i++) {
            System.out.println(menukortArr.get(i));
            System.out.println("\n");
        }

    }

}
