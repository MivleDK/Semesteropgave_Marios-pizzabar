/**@author: Mick Larsen
 *
 * Bestillingsmenu klassen håndterer menuen for bestilling og afmelding af pizza.
 *
 */
import java.io.IOException;
import java.util.Scanner;

public class bestillingsMenu {

    bestillinger bestillinger = new bestillinger();

/**
 * Forudsætter: Ingenting
 * Metodekald: Kaldes af hovedmenu
 * Output: Sender brugeren videre til den pågældende klasse valgt i visBestillingsMenu()
 * */

    protected void visBestillingsMenu() throws IOException {
        System.out.println("\n");
        System.out.println("*** Bestilling af Pizza ***");
        System.out.println("Tast 1 for at tilføje en ny ordre");
        System.out.println("Tast 2 for at fjerne en ordre");
        System.out.println("Tast 3 for at se menukortet");
        System.out.println("Tast 4 for at se bestillingslisten");
        //System.out.println("Tast 5 for at rette en ordre");
        System.out.println("Tast 0 for at gå til hovedmenuen");

        Scanner sc = new Scanner(System.in);
        int menuValg = sc.nextInt();

        if (menuValg == 1){
            bestillinger.tilfoejBestilling();

        } else if(menuValg ==2 ){
            bestillinger.fjernBestilling();

        } else if(menuValg == 3){
            bestillinger.getMenukort();
            visBestillingsMenu();

        } else if(menuValg == 4){
            bestillinger.seBestillingsliste();

        } else if(menuValg == 0){
            bestillinger.gaaTilHovedMenu();
        } else {
            System.out.println("Du har valgt et ugyldigt menupunkt - Prøv igen");
            visBestillingsMenu();
        }
}








    //To-Do
    //protected void retBestilling(){}





}