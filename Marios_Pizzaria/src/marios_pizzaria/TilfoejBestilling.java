package marios_pizzaria;

/**
 * @Author: Mick Larsen
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
    static ArrayList<ArrayList<String>> bestillingsListe = new ArrayList<ArrayList<String>>();

    //Init statistik klasse til at opdatere statistik
    public void tilfoejBestilling() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> denneBestilling = new ArrayList<>();

        System.out.println("Indtast telefonnummeret til ordren");
        String ordreNr = sc.next();
        denneBestilling.add(ordreNr);
        
        System.out.println("Indtast afhentningstidspunkt");
        String afhentningstidspunkt = sc.next();
        denneBestilling.add(afhentningstidspunkt);

        //AFHENTNINGSTIDSPUNKT
        System.out.println("Indtast nummeret på pizzaen der skal tilføjes til bestillingen");
        


        boolean janej = true;

        while (janej) {

            String valgtPizza = sc.next();
            denneBestilling.add(menu.getPizza(Integer.parseInt(valgtPizza)));

            System.out.println("Du har valgt: " + menu.getPizza(Integer.parseInt(valgtPizza)));

            bestillingsListe.add(denneBestilling);

            Statistik stat = new Statistik();
            stat.skrivStatistik(menu.getPizza(Integer.parseInt(valgtPizza)));

            System.out.println("Vil du tilføje endnu en pizza? (1 for JA og 2 for NEJ");

            int merePizza = sc.nextInt();
            if (merePizza == 2) {

                janej = false;
            } else {
                System.out.println("Indtast nummeret på pizzaen der skal tilføjes til bestillingen");
            }
        }

    }

    public void visBestillinger() throws IOException {
        System.out.println(bestillingsListe.toString());

    }

}
