/**@Author: Mick Larsen
 *
 * bestillinger klassen håndterer bestillingen
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class bestillinger {

    public bestillinger() throws IOException {
    }

    //Init bestillingsmenu så den vises efter en bestilling er håndteret
    bestillingsMenu bestillingsMenu = new bestillingsMenu();

    //Init array til at holde alle bestillinger
    ArrayList<String> bestillingsListe = new ArrayList<>();

    //init menukort objekt så pizza kan hentes
    bestillinger menu = new menukort();

    //Vis menukortet
    protected void getMenukort() throws IOException {
        menu.getMenukort();
    }

    protected void tilfoejBestilling() throws IOException {

        System.out.println("Indtast nummeret på den pizza der skal bestilles");
        Scanner sc = new Scanner(System.in);
        int pizzavalg = sc.nextInt();
        String valgtPizza = menu.getPizza(pizzavalg);

        this.bestillingsListe.add(valgtPizza);
        this.bestillingsMenu.visBestillingsMenu();
    }

    protected void seBestillingsliste() {
        System.out.println(bestillingsListe);
    }

    protected void fjernBestilling() {
    }

    protected void gaaTilHovedMenu() {
    }

}
