/**@author: Mick Larsen
 * menukort klasen læser menukortet fra en fil.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class menukort {

    //Init ArrayList til at holde menukortet
    protected ArrayList<String> menukortArr = new ArrayList<>();

    /**Forudsætter: .txt fil på disk med én pizza på hver linje.
     * Hvert element på linjen skal være separeret med mellemrum
     * Hver linje skal starte med <pizza nr> <pizza navn> <pizza pris> <pizza ingrediens 1> <pizza ingrediens 2> <pizza ingrediens osv.>
     *
     *Metodekald: Ingen parametre
     *
     * Output:
     * */
    public menukort() throws IOException {
        BufferedReader objReader = null;
        String strCurrentLine;
        objReader = new BufferedReader(new FileReader("C:\\Users\\mla\\Google Drev\\Datamatiker\\1_semester\\Semesteropgave_Marios pizzabar\\menu2.txt"));

        while ((strCurrentLine = objReader.readLine()) != null){
            menukortArr.add(strCurrentLine);
        }
    }

    protected String getPizza(int i){

        return menukortArr.get(i-1);
    }

    public double getPris(int n) throws IOException{ //Implementer scanner
        n= n-1 ;
        String test = (String) menukortArr.get(n);
        String[] splited = test.split("\\s+");
        String temp = splited[2];
        double pris = Double.parseDouble( temp );

        return pris;
    }

}