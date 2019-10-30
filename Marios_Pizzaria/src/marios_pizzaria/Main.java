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

public class Main {

    public static void main(String[] args) throws IOException {

        Menu newMenu = new Menu();
        newMenu.visClear();         //clearer konsollen
        newMenu.visLogo();          //viser firma logo
        newMenu.visMenu1();         //viser menu1
        newMenu.startMenu();        //starter menu switchen
    }
}
