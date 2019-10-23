/*
 CPH Business 2019
Semesteropgave Marios-pizzabar
Alexander Pihl, Benjamin Iglesias, Mick Larsen, Morten Rasmussen
 */
package pizzaria.mariospizzaria;

/*
 * @author Morten Rasmussen
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class showMenu {

    public static void main(String[] args) {
        // Opretter data til tabellen
        String[] headings
                = new String[]{"Nummer", "Navn", "Pris", "Ingrediens", "Ingrediens", "Ingrediens", "Ingrediens", "Ingrediens", "Ingrediens", "Ingrediens"};
        Object[][] data = new Object[][]{ //opretter et object med data
            {"1", "Vesuvio", "57", "Tomatsauce", "Ost", "Skinke", "Oregano", "*", "*", "*"},
            {"2", "Amerikaner", "53", "Tomatsauce", "Ost", "Oksefars", "Oregano", "*", "*", "*"},
            {"3", "Cacciatore", "57", "Tomatsauce", "Ost", "Pepperoni", "Oregano", "*", "*", "*"},
            {"4", "Carbona", "63", "Tomatsauce", "Ost", "Kødsauce", "Spaghetti", "Cocktailpølser", "Oregano", "*"},
            {"5", "Dennis", "65", "Tomatsauce", "Ost", "Skinke", "Pepperoni", "Cocktailpølser", "Oregano", "*"},
            {"6", "Bertil", "57", "Tomatsauce", "Ost", "Bacon", "Oregano", "*", "*", "*"},
            {"7", "Silvia", "61", "Tomatsauce", "Ost", "Pepperoni", "Rød Peber", "Løg", "Oliven", "Oregano"},
            {"8", "Victoria", "61", "Tomatsauce", "Ost", "Skinke", "Ananas", "Champignon", "Løg", "Oregano"},
            {"9", "Toronfo", "61", "Tomatsauce", "Ost", "Skinke", "Bacon", "Kebab", "Chili", "Oregano"},
            {"10", "Capricciosa", "61", "Tomatsauce", "Ost", "Skinke", "Champignon", "Oregano", "*", "*"},
            {"11", "Hawai", "61", "Tomatsauce", "Ost", "Skinke", "Ananas", "Oregano", "*", "*"},
            {"12", "Le Blissola", "61", "Tomatsauce", "Ost", "Skinke", "Rejer", "Oregano", "*", "*"},
            {"13", "Venezia", "61", "Tomatsauce", "Ost", "Skinke", "Bacon", "Oregano", "*", "*"},
            {"14", "Mafia", "61", "Tomatsauce", "Ost", "Pepperoni", "Løg", "Oregano", "*", "*"},};

        // Opretter et JTable med dataen fra tabellen
        JTable table = new JTable(data, headings);

        JFrame frame = new JFrame("Marios Pizzabar");
        frame.add(new JScrollPane(table));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);            //Sætter dimensions på Jframe
        frame.setVisible(true);
    }
}
