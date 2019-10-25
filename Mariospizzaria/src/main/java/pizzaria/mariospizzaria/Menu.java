/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package pizzaria.mariospizzaria;

/*
 * @author Amazingh0rse
 */
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

    public void startMenu() {
        String valg = getInput();
        while (!valg.equals("q")) {
            switch (valg) {
                case "1":// deal med s
                    bestillingsMenu bestillingsmenu = new bestillingsMenu();
                    bestillingsMenu.visBestillingsMenu();
                    break;
                case "2":
                    System.out.println("Q Afslut");
                //valg = getInput("v for at få vist " + spiller1.getNavn() + "'s slag");
                //break;
                case "3":
                    ShowMenuKort newMenuKort = new ShowMenuKort();
                    newMenuKort.ShowMenuKort();
                    visMenu();
                    valg = getInput();
                    break;
                case "4":
                //currentBaeger = spiller2.getBaeger();
                //currentBaeger.ryst();
                //valg = getInput("v for at få vist " + spiller2.getNavn() + "'s slag ELLER f for at få vist vinder");
                //break;
                case "5":
                case "q":
                    break; //afslut
                default:
            }
        }
    }

    public static String getInput() {
        String valg = scan.nextLine();
        return valg;
    }

}
