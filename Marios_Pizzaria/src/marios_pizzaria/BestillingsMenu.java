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

public class BestillingsMenu{

    /**
     * Forudsætter: Ingenting Metodekald: Kaldes af hovedmenu Output: Sender
     * brugeren videre til den pågældende klasse valgt i visBestillingsMenu()
     *
     */
    protected void bestillingsmenuValgmuligheder() {
        System.out.println("");
        System.out.println("Bestilling af Pizza");
        System.out.println("Tryk 1 for at tilføje en ny ordre");
        System.out.println("Tryk 2 for at fjerne en ordre");
        System.out.println("Tryk 3 for at se bestillingslisten");
        System.out.println("Tryk 4 for at se menukortet i et vindue for sig selv");
        //System.out.println("Tast 5 for at rette en ordre");           //Buy dlc to unlock
        System.out.println("");
        System.out.println("Tryk 0 for at gå til hovedmenuen");
        System.out.println("****************************************************************************************");
        System.out.println("Tryk på en tast og derefter Enter: ");
    }

    protected void visBestillingsMenu() throws IOException {   //første version af bestillingsmenu - med clear & logo

        // Menu newMenu = new Menu();
        //newMenu.visClear();
        // newMenu.visLogo();
        bestillingsmenuValgmuligheder();

        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();

        String menuValg = getInput();

        while (!menuValg.equals("q")) {
            switch (menuValg) {
                case "1":                                       //starter en bestilling
                    tilfoej.tilfoejBestilling();
                    menuValg = "q";
                    break;

                case "2":                                       //fjerner en bestilling
                    tilfoej.fjernBestilling();
                    menuValg = "q";
                    break;

                case "3":                                       //viser nuværende bestillinger
                    tilfoej.visBestillinger();
                    menuValg = "q";
                    break;

                case "4":                                       //Viser menukortet i en ekstern GUI
                    ShowMenuKort newMenuKort = new ShowMenuKort();
                    newMenuKort.ShowMenuKort();
                    visBestillingsMenu();
                    menuValg = "q";
                    break;

                case "0":
                    menuValg = "q";
                    break;

                default:                                        //fanger ugyldige valg
                    Menu menu3 = new Menu();
                    menu3.visClear();
                    menu3.visLogo();
                    System.out.println("Vælg et gyldigt punkt fra menuen");
                    visBestillingsMenuNoClear();
                    break;
            }
        }
    }

    //@MR følgende er en ekstra version af bestillingsmenu man kan bruge for at init uden clear & logo
    protected void visBestillingsMenuNoClear() throws IOException {

        Menu newMenu = new Menu();
        //newMenu.visClear();
        //newMenu.visLogo();
        bestillingsmenuValgmuligheder();
        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();

        String menuValg = getInput();

        while (!menuValg.equals("q")) {
            switch (menuValg) {
                case "1":                                       //starter en bestilling
                    tilfoej.tilfoejBestilling();
                    menuValg = "q";
                    break;

                case "2":                                       //fjerner en bestilling
                    tilfoej.fjernBestilling();
                    menuValg = "q";
                    break;

                case "3":                                       //viser nuværende bestillinger
                    tilfoej.visBestillinger();
                    menuValg = "q";
                    break;

                case "4":                                       //Viser menukortet i en ekstern GUI
                    ShowMenuKort newMenuKort = new ShowMenuKort();
                    newMenuKort.ShowMenuKort();
                    visBestillingsMenu();
                    menuValg = "q";
                    break;

                case "0":
                    menuValg = "q";
                    break;

                default:
                    System.out.println("Vælg et gyldigt punkt fra menuen");
                    Menu menu3 = new Menu();
                    menu3.visClear();
                    visBestillingsMenuNoClear();

                    break;
            }
        }
    }

    //End of ekstra menu
    protected String getInput() {
        Scanner sc = new Scanner(System.in);
        String menuValg = sc.nextLine();
        return menuValg;
    }

    protected void hovedMenu() throws IOException {
        Menu menu = new Menu();
        menu.visClear();
        menu.visLogo();
        menu.visMenu1();
        menu.startMenu();
    }
}
