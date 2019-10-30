/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marios_pizzaria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mla
 */
public class OrdreTest {


    /**
     * Test of getTelefonnummer method, of class Ordre.
     */
    @Test
    public void testGetTelefonnummer() {

        System.out.println("getTelefonnummer");
        Ordre instance = new Ordre();
        
        instance.setTelefonnummer("49221801");
        
        String expResult = "49221801";
        String result = instance.getTelefonnummer();
        assertEquals(expResult, result);
    }
}
