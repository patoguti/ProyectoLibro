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
public class AlumnoTest {
    
    public AlumnoTest() {
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
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Alumno instance = null;
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getApellido method, of class Alumno.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setApellido method, of class Alumno.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Alumno instance = null;
        instance.setApellido(apellido);
       
    }

    /**
     * Test of isAsistencia method, of class Alumno.
     */
    @Test
    public void testIsAsistencia() {
        System.out.println("isAsistencia");
        Alumno instance = null;
        boolean[] expResult = null;
        boolean[] result = instance.isAsistencia();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setAsistencia method, of class Alumno.
     */
    @Test
    public void testSetAsistencia() {
        System.out.println("setAsistencia");
        boolean[] asistencia = null;
        Alumno instance = null;
        instance.setAsistencia(asistencia);
        
    }

    /**
     * Test of getRun method, of class Alumno.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getRun();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setRun method, of class Alumno.
     */
    @Test
    public void testSetRun() {
        System.out.println("setRun");
        String run = "";
        Alumno instance = null;
        instance.setRun(run);
        
    }

    /**
     * Test of getPromedios method, of class Alumno.
     */
    @Test
    public void testGetPromedios() {
        System.out.println("getPromedios");
        Alumno instance = null;
        Evaluacion[] expResult = null;
        Evaluacion[] result = instance.getPromedios();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setPromedios method, of class Alumno.
     */
    @Test
    public void testSetPromedios() {
        System.out.println("setPromedios");
        Evaluacion[] promedios = null;
        Alumno instance = null;
        instance.setPromedios(promedios);
       
    }

    /**
     * Test of getAnotaciones method, of class Alumno.
     */
    @Test
    public void testGetAnotaciones() {
        System.out.println("getAnotaciones");
        Alumno instance = null;
        List<Anotacion> expResult = null;
        List<Anotacion> result = instance.getAnotaciones();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAnotaciones method, of class Alumno.
     */
    @Test
    public void testSetAnotaciones() {
        System.out.println("setAnotaciones");
        List<Anotacion> anotaciones = null;
        Alumno instance = null;
        instance.setAnotaciones(anotaciones);
        
    }

    /**
     * Test of getEvaluaciones method, of class Alumno.
     */
    @Test
    public void testGetEvaluaciones() {
        System.out.println("getEvaluaciones");
        Alumno instance = null;
        Evaluacion[] expResult = null;
        Evaluacion[] result = instance.getEvaluaciones();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of setEvaluaciones method, of class Alumno.
     */
    @Test
    public void testSetEvaluaciones() {
        System.out.println("setEvaluaciones");
        Evaluacion[] evaluaciones = null;
        Alumno instance = null;
        instance.setEvaluaciones(evaluaciones);
        
    }

    /**
     * Test of agregarAnotacion method, of class Alumno.
     */
    @Test
    public void testAgregarAnotacion() {
        System.out.println("agregarAnotacion");
        Anotacion anotacion = null;
        Alumno instance = null;
        instance.agregarAnotacion(anotacion);
        
    }

    /**
     * Test of obtenerAsistencia method, of class Alumno.
     */
    @Test
    public void testObtenerAsistencia() {
        System.out.println("obtenerAsistencia");
        Alumno instance = null;
        double expResult = 0.0;
        double result = instance.obtenerAsistencia();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of estaAprobado method, of class Alumno.
     */
    @Test
    public void testEstaAprobado() {
        System.out.println("estaAprobado");
        Alumno instance = null;
        boolean expResult = false;
        boolean result = instance.estaAprobado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toXML method, of class Alumno.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Alumno instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
        
    }
    
}
