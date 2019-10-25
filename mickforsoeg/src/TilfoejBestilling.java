/**@Author: Mick Larsen
 *
 * bestillinger klassen håndterer bestillingen
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TilfoejBestilling {

    public TilfoejBestilling() throws IOException {
    }

    //init menukort objekt så pizza kan hentes
    menukort menu = new menukort();

    //Init bestillingsmenu så den kan vises efter en bestilling er håndteret
    bestillingsMenu bestillingsMenu = new bestillingsMenu();

    //Init array til at holde alle bestillinger
    ArrayList<String> bestillingsListe = new ArrayList<>();

    public void tilfoejBestilling() throws IOException {
        System.out.println("Indtast nummeret på pizzaen der skal tilføjes til bestillingen");
        Scanner sc = new Scanner(System.in);
        String valgtPizza = sc.next();
        bestillingsListe.add(menu.getPizza(Integer.parseInt(valgtPizza)));
        System.out.println("Du har valgt: " + menu.getPizza(Integer.parseInt(valgtPizza)));
        bestillingsMenu.visBestillingsMenu();

    }

    public void visBestillinger() throws IOException {
        System.out.println(bestillingsListe.toString());

    }



}