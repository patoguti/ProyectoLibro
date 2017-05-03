/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import enumLibro.NombreAsignatura;
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
public class EvaluacionTest {
    
    public EvaluacionTest() {
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
     * Test of getNota method, of class Evaluacion.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Evaluacion instance = null;
        double expResult = 0.0;
        double result = instance.getNota();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setNota method, of class Evaluacion.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        double nota = 0.0;
        Evaluacion instance = null;
        instance.setNota(nota);
    }

    /**
     * Test of getAsignatura method, of class Evaluacion.
     */
    @Test
    public void testGetAsignatura() {
        System.out.println("getAsignatura");
        Evaluacion instance = null;
        NombreAsignatura expResult = null;
        NombreAsignatura result = instance.getAsignatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAsignatura method, of class Evaluacion.
     */
    @Test
    public void testSetAsignatura() {
        System.out.println("setAsignatura");
        NombreAsignatura asignatura = null;
        Evaluacion instance = null;
        instance.setAsignatura(asignatura);
    }

    /**
     * Test of toXML method, of class Evaluacion.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Evaluacion instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
    }
    
}
