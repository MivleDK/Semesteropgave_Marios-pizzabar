/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

/*
 * @author Morten Rasmussen
 */
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    protected static Scanner scan = new Scanner(System.in);

    protected void visClear() {                 //clear consollen

        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }

    protected void visLogo() {      //Viser firma logoet
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

    }

    protected void visMenu1() {             //viser hovedemenuen
        System.out.println("");
        System.out.println("Hovedemenu");
        System.out.println("Tryk 1 for bestillinger");
        System.out.println("Tryk 2 for at få vist menukortet i et vindue for sig selv");
        System.out.println("Tryk 3 for at få vist statistik");
        System.out.println("");
        System.out.println("Tryk Q for at afslutte programmet");
        System.out.println("****************************************************************************************");
        System.out.println("Tryk på en tast og derefter Enter: ");
    }

    protected void startMenu() throws IOException {
        String valg = "";
        valg = getInput();

        switch (valg) {
            case "1":// deal med s
                visClear();
                visLogo();
                BestillingsMenu bestillingsmenu = new BestillingsMenu();
                bestillingsmenu.visBestillingsMenu();
                valg = "q";
                break;
            case "2":       //Viser menukortet i en GUI for sig selv
                ShowMenuKort newMenuKort = new ShowMenuKort();
                newMenuKort.ShowMenuKort();
                visClear();
                valg = "q";
                break;
            case "3":

                visClear();
                visLogo();
                System.out.println("Nr\tNavn\t\tPris\tIngredienser");
                Statistik vis = new Statistik();
                vis.visStatistik();
                vis.CountPizza();
                vis.getNr();
                visMenu1();
                startMenu();
                valg = "q";
                break;

            /*
                case "4": //TEST!!!!! SLET EFTER
                visClear();
                visMenu1();
                startMenu();

                valg = "q";
                break;
             */
            case "q":
                //valg = "q";
                System.exit(0);
                break;
            default:
                valg = "q";
                System.out.println("Vælg et gyldigt punkt fra menuen");
                startMenu();
        }

        //visClear();
        visLogo();
        visMenu1();
        startMenu();

    }

    protected static String getInput() {
        String valg = scan.nextLine();
        return valg;
    }

}
