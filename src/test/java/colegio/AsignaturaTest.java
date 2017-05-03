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
public class AsignaturaTest {
    
    public AsignaturaTest() {
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
     * Test of getPlan method, of class Asignatura.
     */
    @Test
    public void testGetPlan() {
        System.out.println("getPlan");
        Asignatura instance = null;
        String[] expResult = null;
        String[] result = instance.getPlan();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setPlan method, of class Asignatura.
     */
    @Test
    public void testSetPlan() {
        System.out.println("setPlan");
        String[] plan = null;
        Asignatura instance = null;
        instance.setPlan(plan);
        
    }

    /**
     * Test of agregarPlan method, of class Asignatura.
     */
    @Test
    public void testAgregarPlan() {
        System.out.println("agregarPlan");
        String plan = "";
        Asignatura instance = null;
        instance.agregarPlan(plan);
       
    }

    /**
     * Test of getNombre method, of class Asignatura.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Asignatura instance = null;
        NombreAsignatura expResult = null;
        NombreAsignatura result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Asignatura.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        NombreAsignatura nombre = null;
        Asignatura instance = null;
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getCantidadActividad method, of class Asignatura.
     */
    @Test
    public void testGetCantidadActividad() {
        System.out.println("getCantidadActividad");
        Asignatura instance = null;
        int expResult = 0;
        int result = instance.getCantidadActividad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCantidadActividad method, of class Asignatura.
     */
    @Test
    public void testSetCantidadActividad() {
        System.out.println("setCantidadActividad");
        int cantidadActividad = 0;
        Asignatura instance = null;
        instance.setCantidadActividad(cantidadActividad);
        
    }

    /**
     * Test of getProfesor method, of class Asignatura.
     */
    @Test
    public void testGetProfesor() {
        System.out.println("getProfesor");
        Asignatura instance = null;
        Profesor expResult = null;
        Profesor result = instance.getProfesor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProfesor method, of class Asignatura.
     */
    @Test
    public void testSetProfesor() {
        System.out.println("setProfesor");
        Profesor profesor = null;
        Asignatura instance = null;
        instance.setProfesor(profesor);
        
    }

    /**
     * Test of toXML method, of class Asignatura.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Asignatura instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
       
    }
    
}
