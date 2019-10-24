/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package pizzaria.mariospizzaria;


/*
 * @author Amazingh0rse
 */
public class Main {

    public static void main(String[] args) {
        ShowMenuKort newMenuKort = new ShowMenuKort();
        newMenuKort.ShowMenuKort();

        Menu newMenu = new Menu();
        newMenu.visMenu();
    }
}
