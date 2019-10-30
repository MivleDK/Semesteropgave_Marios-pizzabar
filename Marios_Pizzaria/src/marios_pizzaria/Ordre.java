/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package marios_pizzaria;

/*
 * @author Mick Larsen
 */
import java.util.ArrayList;

public class Ordre {                                        //Opretter et array over en ordre med tlf nr, afhentningstidspunkt, pizzaer

    int afhentningstidspunkt;
    String telefonnummer;
    ArrayList<String> pizzaer = new ArrayList<>();

    protected int getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    protected String getTelefonnummer() {
        return telefonnummer;
    }

    protected ArrayList<String> getPizzaer() {
        return pizzaer;
    }

    protected void setAfhentningstidspunkt(int afhentningstidspunkt) {
        this.afhentningstidspunkt = afhentningstidspunkt;
    }

    protected void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    protected void setPizzaer(String pizza) {
        pizzaer.add(pizza);
    }

    protected void getOrdre() {                             //printer en ordre

        System.out.println("#### Telefonnummer: " + telefonnummer);
        System.out.println("#### Afhentningstidspunkt: " + afhentningstidspunkt);
        for (int i = 0; i < pizzaer.size(); i++) {
            System.out.println(pizzaer.get(i));
        }
        System.out.println("");
    }
}
