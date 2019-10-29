package marios_pizzaria;

/**
 * @Author: Mick Larsen
 *
 * bestillinger klassen håndterer bestillingen
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TilfoejBestilling {

    public TilfoejBestilling() throws IOException {
    }

    //init menukort objekt så pizza kan hentes
    Menukort menu = new Menukort();

    //Init bestillingsmenu så den kan vises efter en bestilling er håndteret
    BestillingsMenu bestillingsMenu = new BestillingsMenu();

    //Init array til at holde alle bestillinger. Hver bestilling ligges i sit eget array.
    static ArrayList<String> bestillingsListe2 = new ArrayList<>();
    
    boolean bestilMere = true;

    int bestillingsCounter = 0;
    
    Scanner sc = new Scanner(System.in);

       Ordre denneOrdre = new Ordre();
       static ArrayList<Ordre> bestillingsListe3 = new ArrayList<>();
    
    //Init statistik klasse til at opdatere statistik
    public void tilfoejBestilling() throws IOException {
      
        System.out.print("Indtast telefonnummeret til ordren (Format: 12345678): ");
        String ordreNr = sc.next();
        denneOrdre.setTelefonnummer(ordreNr);

        System.out.print("Indtast afhentningstidspunkt (Format: ttmm): ");
        int afhentningstidspunkt = sc.nextInt();
        denneOrdre.setAfhentningstidspunkt(afhentningstidspunkt);
              
        while (bestilMere) {

            System.out.print("Indtast nummeret på pizzaen der skal tilføjes til bestillingen: ");
            
            String valgtPizza = sc.next();

            String valgtePizzaString = menu.getPizza(Integer.parseInt(valgtPizza));
            denneOrdre.setPizzaer(valgtePizzaString);
                        
            System.out.println("Du har valgt: " + valgtePizzaString);
            
            //Opdaterer statistik-filen
            Statistik stat = new Statistik();
            stat.skrivStatistik(valgtePizzaString);

            System.out.print("Vil du tilføje endnu en pizza? 1 for JA og 2 for NEJ): ");

            bestilleMere();
        }

    }

    protected void bestilleMere() {
        int merePizza = sc.nextInt();
        switch (merePizza) {
            case 1:
                bestillingsCounter++;
                break;
            case 2:
                bestilMere = false;
                bestillingsListe3.add(denneOrdre);

                break;
            default:
                System.out.println("Indtastningen blev ikke genkendt. Tast 1 for JA og 2 for NEJ");
                bestilleMere();
        }
    }

    public void visBestillinger() throws IOException {

        for (int i = 0; i < bestillingsListe3.size(); i++) {
            
            Ordre s = bestillingsListe3.get(i);
            s.getOrdre();


        }
    } 
}
