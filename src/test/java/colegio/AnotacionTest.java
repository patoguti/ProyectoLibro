/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import enumLibro.TipoAnotacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toupa
 */
public class AnotacionTest {
    
    public AnotacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isPositiva method, of class Anotacion.
     */
    @Test
    public void testIsPositiva() {
        System.out.println("isPositiva");
        Anotacion instance = null;
        TipoAnotacion expResult = null;
        TipoAnotacion result = instance.isPositiva();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPositiva method, of class Anotacion.
     */
    @Test
    public void testSetPositiva() {
        System.out.println("setPositiva");
        TipoAnotacion positiva = null;
        Anotacion instance = null;
        instance.setPositiva(positiva);
        
    }

    /**
     * Test of getMotivo method, of class Anotacion.
     */
    @Test
    public void testGetMotivo() {
        System.out.println("getMotivo");
        Anotacion instance = null;
        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMotivo method, of class Anotacion.
     */
    @Test
    public void testSetMotivo() {
        System.out.println("setMotivo");
        String motivo = "";
        Anotacion instance = null;
        instance.setMotivo(motivo);
       
    }

    /**
     * Test of toXML method, of class Anotacion.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Anotacion instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
       
    }
    
}
