/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

/*
 * @author Mick Larsen & Morten Rasmussen
 */
import java.io.IOException;
import java.util.Scanner;

public class BestillingsMenu {

    /**
     * Forudsætter: Ingenting Metodekald: Kaldes af hovedmenu Output: Sender
     * brugeren videre til den pågældende klasse valgt i visBestillingsMenu()
     *
     */
    protected void visBestillingsMenu() throws IOException {

        Menu newMenu = new Menu();
        newMenu.visMenu1();

        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();

        System.out.println("");
        System.out.println("Bestilling af Pizza");
        System.out.println("Tryk 1 for at tilføje en ny ordre");
        System.out.println("Tryk 2 for at fjerne en ordre");
        System.out.println("Tryk 3 for at se bestillingslisten");
        System.out.println("Tryk 4 for at se menukortet i et vindue for sig selv");
        //System.out.println("Tast 5 for at rette en ordre");
        System.out.println("");
        System.out.println("Tryk 0 for at gå til hovedmenuen");
        System.out.println("****************************************************************************************");
        System.out.println("Tryk på en tast og derefter Enter: ");
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
                    ShowMenuKort newMenuKort = new ShowMenuKort();
                    newMenuKort.ShowMenuKort();
                    visBestillingsMenu();
                    menuValg = "q";
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
        menu.visMenu1();
        menu.visMenu2();
        menu.startMenu();
    }
}
