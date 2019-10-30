package marios_pizzaria;

/**
 *
 *
 * bestillinger klassen håndterer bestillingen
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TilfoejBestilling {

    //Constructor
    public TilfoejBestilling() throws IOException {
    }

    //init menukort objekt så pizza kan hentes på baggrund af valgt nr.
    Menukort menu = new Menukort();

    //Init bestillingsmenu så den kan vises efter en bestilling er håndteret
    BestillingsMenu bestillingsMenu = new BestillingsMenu();

    //  static ArrayList<String> bestillingsListe2 = new ArrayList<>();
    //Tjekker om der skal tilføjes flere pizzaer til samme ordre.
    boolean bestilMere = true;

    //int bestillingsCounter = 0;
    //init scanner til at håndtere alle input
    Scanner sc = new Scanner(System.in);

    //Init ordre objekt som holder alle informationer om en enkelt ordre.
    Ordre denneOrdre = new Ordre();

    //Init arraylist til at holde på samtlige Ordre objekter
    static ArrayList<Ordre> alleOrdrerListe = new ArrayList<>();

    /* @author: Alexander, Benjamin, Mick, Morten
    *
    * Modtager telefonnummer og afhentningstidspunkt én gang.
    * Herefter promptes der for valg af pizza.
    *
    *Pre-conditions:    Ingen.
    *Input:             Tager bruger input fra keyboard
    *Output:            Ingen. Går tilbage til menu
     */
    public void tilfoejBestilling() throws IOException {

        //@author: Mick
        //Tag imod telefonnummer og add til denneOrdre
        System.out.print("Indtast navn eller telefonnummer tilknyttet ordren (Format: ABCDEFG...1234567890): ");
        String ordreNr = sc.next();
        denneOrdre.setTelefonnummer(ordreNr);

        //@author: Mick
        //Tag imod afhentningstidspunkt og add til denneOrdre
        System.out.print("Indtast afhentningstidspunkt (Format: ttmm): ");
        int afhentningstidspunkt = sc.nextInt();
        denneOrdre.setAfhentningstidspunkt(afhentningstidspunkt);

        //Kontrollér om der skal tilføjes mere end én pizza til en ordre.
        while (bestilMere) {

            //Indtast nummeret på pizza og gem i String.
            System.out.print("Indtast nummeret på pizzaen der skal tilføjes til bestillingen: ");
            String valgtPizza = sc.next();

            //Parse nummeret på pizza til integer
            int valgtPizzaInt = Integer.parseInt(valgtPizza);

            //@Alexander og Benjamin
            //Kontroller om input er outOfBounds i menukortets array.
            //Hvis det er, så prompt for nyt indtil det ikke er!
            while ((valgtPizzaInt > 14) || (valgtPizzaInt < 1)) {
                System.out.println("Pizzaen findes ikke. Vælg et nummer mellem 1 og 14");
                valgtPizza = sc.next();
                valgtPizzaInt = Integer.parseInt(valgtPizza);
            }

            //@author: Mick
            //Hent pizzaens fulde string fra menukortet og add til denneOrdre
            String valgtePizzaString = menu.getPizza(valgtPizzaInt);
            denneOrdre.setPizzaer(valgtePizzaString);

            // Mick: Antallet af spaces passer ikke til alle pizzaer
            //@author Morten
            //Grafik til brugervenlighed
//          menu2.visClear();
//          menu2.visLogo();
//          System.out.println("");
            // System.out.println("****************************************************************************************");
            System.out.println("\n\t      " + "Nr Navn       Kr Ingredienser");
            System.out.println("Du har valgt: " + valgtePizzaString);
            System.out.println("");
            // System.out.println("****************************************************************************************");
//          bestillingsMenu.visBestillingsMenuNoClear();

            //@author Morten
            //Opdaterer statistik-filen
            Statistik stat = new Statistik();
            stat.skrivStatistik(valgtePizzaString);

            //@author Mick
            //Tjekker om der skal bestilles mere på samme ordre
            System.out.println("Vil du tilføje endnu en pizza? Tryk 1 for JA og 2 for NEJ): ");
            bestilleMere();
        }
    }

    //@author Mick
    //Tjekker om der skal bestilles mere på samme ordre
    protected void bestilleMere() {

        int merePizza = sc.nextInt();

        switch (merePizza) {
            case 1:
                //Hvis ja er bool "merePizza" stadig true hvilket betyder
                //at der skal bestilles mere
                break;
            case 2:
                //Der skal ikke bestilles mere på denne ordre.
                //Add denneOrdre til alleOrdreListe
                //og set merePizza til false.
                //Return til hovedmenu
                alleOrdrerListe.add(denneOrdre);
                bestilMere = false;
                Menu hovedMenu = new Menu();
                hovedMenu.visClear();
                break;
            default:
                System.out.println("Indtastningen blev ikke genkendt. Tast 1 for JA og 2 for NEJ");
                bestilleMere();
        }
    }

    //@author: Mick
    //Printer alle ordrer i bestillingslisten.
    //Søger efter ordren med det "Mindste" afhentningstidspunkt og printer
    //denne bestilling - dvs. den næste ordre der skal laves.
    public void visBestillinger() throws IOException {

        //Make room for awesomeness
        Menu mainMenu = new Menu();
        mainMenu.visClear();

        //Print alle ordrer i ordrelisten
        for (int i = 0; i < alleOrdrerListe.size(); i++) {
            Ordre s = alleOrdrerListe.get(i);
            s.getOrdre();
        }

        // Vi behøver kun at vise det "Mindste" afhentningstidspunkt! Det vil hele tiden være next up.
        // Det betyder dog, at man skal afmelde ordren selv hvis den ikke bliver hentet for at se hvad der skal laves næste gang
        //Søg i nuværende ordre, efter det "Mindste tidspunkt".
        denneOrdre = Collections.min(alleOrdrerListe, Comparator.comparing(s -> s.getAfhentningstidspunkt()));

        //Make it nice and print
        System.out.println("");
        System.out.println("# # # # # # # # # # # # # # # #");
        System.out.println("Den næste ordre der skal være klar");
        System.out.println("# # # # # # # # # # # # # # # #");
        System.out.println("");
        denneOrdre.getOrdre();
        System.out.println("");
    }

    protected void fjernBestilling() {

    }

}
