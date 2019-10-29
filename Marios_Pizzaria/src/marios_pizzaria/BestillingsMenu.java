
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
    protected void visBestillingsMenu2() {
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
    }

    protected void visBestillingsMenu() throws IOException {   //første version af bestillingsmenu - med clear & logo

        Menu newMenu = new Menu();
        newMenu.visClear();
        newMenu.visLogo();
        visBestillingsMenu2();
        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();




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
                    Menu menu3 = new Menu();
                    menu3.visClear();
                    menu3.visLogo();
                    System.out.println("Vælg et gyldigt punkt fra menuen");
                    visBestillingsMenuNoClear();

                    break;
            }
        }
        hovedMenu();
    }

    //@MR følgende er en ekstra version af bestillingsmenu man kan bruge for at init uden clear & logo
    protected void visBestillingsMenuNoClear() throws IOException {

        Menu newMenu = new Menu();
        //newMenu.visClear();
        //newMenu.visLogo();
        visBestillingsMenu2();
        //Init TilFoejBestilling klassen
        TilfoejBestilling tilfoej = new TilfoejBestilling();

        String menuValg = getInput();

        while (!menuValg.equals("q")) {
            switch (menuValg) {
                case "1":
                    tilfoej.tilfoejBestilling();
                    break;

                case "2":
                     == == ==
                            =  >>> >>> > eb6d8d9040bd28217480bc3c74dc2c3ed761c955
                    System.out.println("Q Afslut");
                    menuValg = "1";
                    break;

                     << << << < HEAD

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
=======
                /* Nice-To-Have: Ret en bestilling
                case "5":

                break;
>>>>>>> eb6d8d9040bd28217480bc3c74dc2c3ed761c955
                 */
                case "0":
                    menuValg = "q";
                    break;

                default:
                     << << << < HEAD

                    System.out.println("Vælg et gyldigt punkt fra menuen");
                    Menu menu3 = new Menu();
                    menu3.visClear();
                    visBestillingsMenuNoClear();

                     == == ==
                            = System.out.println("Vælg et punkt fra menuen");
                    visBestillingsMenu();
                     >>> >>> > eb6d8d9040bd28217480bc3c74dc2c3ed761c955
                    break;
            }
        }
        hovedMenu();
    }

    <<<<<<< HEAD //End of ekstra menu

    =======
>>>>>>> eb6d8d9040bd28217480bc3c74dc2c3ed761c955

    protected String getInput() {
        Scanner sc = new Scanner(System.in);
        String menuValg = sc.nextLine();
        return menuValg;
    }

    protected void hovedMenu() throws IOException {
        Menu menu = new Menu();
         << << << < HEAD

        menu.visClear();
        menu.visLogo();
        menu.visMenu1();
         == == ==
                = menu.visMenu();
         >>> >>> > eb6d8d9040bd28217480bc3c74dc2c3ed761c955
        menu.startMenu();
    }
}
