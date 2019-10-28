package marios_pizzaria; /**@Author: Mick Larsen
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
    Menukort menu = new Menukort();

    //Init bestillingsmenu så den kan vises efter en bestilling er håndteret
    BestillingsMenu bestillingsMenu = new BestillingsMenu();

    //Init array til at holde alle bestillinger
    ArrayList<String> bestillingsListe = new ArrayList<>();

    //Init statistik klasse til at opdatere statistik



    public void tilfoejBestilling() throws IOException {
        System.out.println("Indtast nummeret på pizzaen der skal tilføjes til bestillingen");
        Scanner sc = new Scanner(System.in);
        String valgtPizza = sc.next();
        bestillingsListe.add(menu.getPizza(Integer.parseInt(valgtPizza)));
        System.out.println("Du har valgt: " + menu.getPizza(Integer.parseInt(valgtPizza)));

        Statistik stat = new Statistik();
        stat.skrivStatistik(menu.getPizza(Integer.parseInt(valgtPizza)));

        bestillingsMenu.visBestillingsMenu();

    }

    public void visBestillinger() throws IOException {
        System.out.println(bestillingsListe.toString());

    }
}