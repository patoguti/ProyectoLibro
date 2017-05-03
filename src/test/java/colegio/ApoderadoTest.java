/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.List;
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
public class ApoderadoTest {
    
    public ApoderadoTest() {
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
     * Test of getNombre method, of class Apoderado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Apoderado instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Apoderado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Apoderado instance = null;
        instance.setNombre(nombre);
       
    }

    /**
     * Test of getApellido method, of class Apoderado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Apoderado instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido method, of class Apoderado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Apoderado instance = null;
        instance.setApellido(apellido);
       
    }

    /**
     * Test of getRun method, of class Apoderado.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        Apoderado instance = null;
        String expResult = "";
        String result = instance.getRun();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setRun method, of class Apoderado.
     */
    @Test
    public void testSetRun() {
        System.out.println("setRun");
        String run = "";
        Apoderado instance = null;
        instance.setRun(run);
       
    }

    /**
     * Test of getPupilos method, of class Apoderado.
     */
    @Test
    public void testGetPupilos() {
        System.out.println("getPupilos");
        Apoderado instance = null;
        List<Alumno> expResult = null;
        List<Alumno> result = instance.getPupilos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPupilos method, of class Apoderado.
     */
    @Test
    public void testSetPupilos() {
        System.out.println("setPupilos");
        List<Alumno> pupilos = null;
        Apoderado instance = null;
        instance.setPupilos(pupilos);
       
    }

    /**
     * Test of agregarPupilo method, of class Apoderado.
     */
    @Test
    public void testAgregarPupilo() {
        System.out.println("agregarPupilo");
        Alumno al = null;
        Apoderado instance = null;
        instance.agregarPupilo(al);
       
    }

    /**
     * Test of toXML method, of class Apoderado.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Apoderado instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
       
    }
    
}
