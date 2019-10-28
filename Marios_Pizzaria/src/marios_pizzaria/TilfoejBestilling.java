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

    //Init array til at holde alle bestillinger. Hver bestilling ligges i sit eget array.
    static ArrayList<ArrayList<String>> bestillingsListe = new ArrayList<ArrayList<String>>();
       static ArrayList<String> bestillingsListe2 = new ArrayList<>();

    boolean bestilMere = true;

    Scanner sc = new Scanner(System.in);

    //Init statistik klasse til at opdatere statistik
    public void tilfoejBestilling() throws IOException {

      //  ArrayList<String> denneBestilling = new ArrayList<>();

        System.out.print("Indtast telefonnummeret til ordren (Format: 12345678): ");
        String ordreNr = sc.next();
        //bestillingsListe2.add(ordreNr);

        System.out.print("Indtast afhentningstidspunkt (Format: ttmm): ");
        String afhentningstidspunkt = sc.next();
        //bestillingsListe2.add(afhentningstidspunkt);

        //AFHENTNINGSTIDSPUNKT
        System.out.print("Indtast nummeret på pizzaen der skal tilføjes til bestillingen: ");

        String ordreInfo = ordreNr + " " + afhentningstidspunkt;
        
        bestillingsListe2.add(ordreInfo);
        
        while (bestilMere) {

            String valgtPizza = sc.next();

            String valgtePizzaString = menu.getPizza(Integer.parseInt(valgtPizza));
            bestillingsListe2.add(valgtePizzaString);

            System.out.println("Du har valgt: " + valgtePizzaString);

            //Opdaterer statistik-filen
            Statistik stat = new Statistik();
            stat.skrivStatistik(valgtePizzaString);

            System.out.print("Vil du tilføje endnu en pizza? 1 for JA og 2 for NEJ): ");

            bestilleMere();

        }
     //   bestillingsListe.add(denneBestilling);

    }

    protected void bestilleMere() {
        int merePizza = sc.nextInt();
        switch (merePizza) {
            case 1:
                System.out.print("Indtast nummeret på pizzaen der skal tilføjes til bestillingen: ");
                break;
            case 2:
                bestilMere = false;
                break;
            default:
                System.out.println("Indtastningen blev ikke genkendt. Tast 1 for JA og 2 for NEJ");
                bestilleMere();
        }
    }

    public void visBestillinger() throws IOException {

        for (int i = 0; i < bestillingsListe2.size(); i++) {

            System.out.println(bestillingsListe2.get(i));
            
        }

    }
}
