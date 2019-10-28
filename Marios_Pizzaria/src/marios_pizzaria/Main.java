/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Menu newMenu = new Menu();
        newMenu.visMenu1();
        newMenu.visMenu2();
        newMenu.startMenu();

        //bestillingsMenu bestillingsmenu = new bestillingsMenu();
        //bestillingsmenu.visBestillingsMenu();
    }
}
