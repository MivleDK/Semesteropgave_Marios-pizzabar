/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marios_pizzaria;

import java.util.ArrayList;

/**
 *
 * @author mla
 */
public class Ordre {
    
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
    
    protected void getOrdre(){
        
        System.out.print("#### Afhentningstidspunkt: " + afhentningstidspunkt + " ##");
        System.out.print(" Telefonnummer: " + telefonnummer + " ####");
        System.out.println("");
        for (int i = 0; i < pizzaer.size();i++){
            System.out.println(pizzaer.get(i));
        }
        System.out.println("");
    }

    

    
    
}
