/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

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
public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of getNombre method, of class Profesor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Profesor instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Profesor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Profesor instance = null;
        instance.setNombre(nombre);

    }

    /**
     * Test of getApellido method, of class Profesor.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Profesor instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);

    }

    /**
     * Test of setApellido method, of class Profesor.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Profesor instance = null;
        instance.setApellido(apellido);

    }

    /**
     * Test of getRun method, of class Profesor.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        Profesor instance = null;
        String expResult = "";
        String result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRun method, of class Profesor.
     */
    @Test
    public void testSetRun() {
        System.out.println("setRun");
        String run = "";
        Profesor instance = null;
        instance.setRun(run);
    }

    /**
     * Test of toXML method, of class Profesor.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Profesor instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
    }
    
}
