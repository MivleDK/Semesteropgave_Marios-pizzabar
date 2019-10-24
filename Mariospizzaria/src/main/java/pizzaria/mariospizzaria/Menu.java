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
        System.out.println("1 spil");
        System.out.println("v vis seneste slag");
        System.out.println("f find vinder");
        System.out.println("q afslut");
        System.out.println("1 ryst bæger for spiller 1");
        System.out.println("2 ryst bæger for spiller 2");
    }

}
