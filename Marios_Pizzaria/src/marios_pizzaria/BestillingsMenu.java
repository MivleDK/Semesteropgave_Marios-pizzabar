package marios_pizzaria;

import java.io.IOException;
import java.util.Scanner;

public class BestillingsMenu {

    /**
     * Forudsætter: Ingenting Metodekald: Kaldes af hovedmenu Output: Sender
     * brugeren videre til den pågældende klasse valgt i visBestillingsMenu()
     *
     */
    protected void visBestillingsMenu() throws IOException {

        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();
        

        System.out.println("\n");
        System.out.println("*** Bestilling af Pizza ***");
        System.out.println("Tast 1 for at tilføje en ny ordre");
        System.out.println("Tast 2 for at fjerne en ordre");
        System.out.println("Tast 3 for at se menukortet");
        System.out.println("Tast 4 for at se bestillingslisten");
        //System.out.println("Tast 5 for at rette en ordre");
        System.out.println("\n");
        System.out.println("Tast 0 for at gå til hovedmenuen");

        String menuValg = getInput();

        while (!menuValg.equals("q")) {
            switch (menuValg) {
                case "1":
                    tilfoej.tilfoejBestilling();
                    break;

                case "2":
                    System.out.println("Q Afslut");
                    menuValg = "1";
                    break;

                case "3":
                    System.out.println("Q Afslut");
                    menuValg = "1";
                    break;

                case "4":
                    System.out.println("Q Afslut");
                    menuValg = "1";
                    break;

                /* Nice-To-Have: Ret en bestilling
                case "5":
                
                break;                
                 */
                case "0":
                    menuValg = "q";
                    break;

                default:
                    System.out.println("Vælg et punkt fra menuen");
                    visBestillingsMenu();
                    break;
            }
        }
        hovedMenu();
    }

    protected String getInput() {
        Scanner sc = new Scanner(System.in);
        String menuValg = sc.nextLine();
        return menuValg;
    }

    protected void hovedMenu() throws IOException {
        Menu menu = new Menu();
        menu.visMenu();
        menu.startMenu();
    }
}
