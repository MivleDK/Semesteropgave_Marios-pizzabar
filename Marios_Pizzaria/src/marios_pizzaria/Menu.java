/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

/*
 * @author Amazingh0rse
 */
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static Scanner scan = new Scanner(System.in);

    public void visMenu() {
        System.out.println("****************************************************************************************");
        System.out.println("*  __  __               _                        _                  _                  *");
        System.out.println("* |  \\/  |             (_)                      (_)                | |                 *");
        System.out.println("* | \\  / |  __ _  _ __  _   ___   ___     _ __   _  ____ ____ __ _ | |__    __ _  _ __ *");
        System.out.println("* | |\\/| | / _` || '__|| | / _ \\ / __|   | '_ \\ | ||_  /|_  // _` || '_ \\  / _` || '__|*");
        System.out.println("* | |  | || (_| || |   | || (_) |\\__ \\   | |_) || | / /  / /| (_| || |_) || (_| || |   *");
        System.out.println("* |_|  |_| \\__,_||_|   |_| \\___/ |___/   | .__/ |_|/___|/___|\\__,_||_.__/  \\__,_||_|   *");
        System.out.println("*                                        | |                                           *");
        System.out.println("*                                        |_|                                           *");
        System.out.println("****************************************************************************************");
        System.out.println("1 Tilføj Bestilling");
        System.out.println("2 Fjern Bestilling");
        System.out.println("3 Vis menukort");
        System.out.println("4 Vis statistik");
        System.out.println();
        System.out.println("Q Afslut");
        System.out.println("****************************************************************************************");
    }

    public void startMenu() throws IOException {
        String valg = "1";
        valg = getInput();

        switch (valg) {
            case "1":// deal med s
                BestillingsMenu bestillingsmenu = new BestillingsMenu();
                bestillingsmenu.visBestillingsMenu();
                valg = "q";
                break;
            case "2":
                System.out.println("Virker ikke endnu");
                valg = "q";
                break;
            case "3":
                System.out.println("Virker ikke endnu");
                valg = "q";
                break;

            /* @MLA: Viser menukortet i en GUI for sig selv.
                    ShowMenuKort newMenuKort = new ShowMenuKort();
                    newMenuKort.ShowMenuKort();
                    visMenu();
                    valg = getInput();
             */
            case "4":
                Statistik vis = new Statistik();
                vis.visStatistik();           
                //System.out.println("Virker ikke endnu");
                //valg = "q";
                break;

            case "q":
                //valg = "q";
                System.exit(0);
                break;
            default:
                valg = "z";
                System.out.println("Vælg et punkt der findes på menuen");
                startMenu();
        }

        visMenu();
        startMenu();

    }

    public static String getInput() {
        String valg = scan.nextLine();
        return valg;
    }

}
