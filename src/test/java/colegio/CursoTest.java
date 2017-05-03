/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import enumLibro.ModuloCurso;
import enumLibro.NivelCurso;
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
public class CursoTest {
    
    public CursoTest() {
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
     * Test of getAlumnos method, of class Curso.
     */
    @Test
    public void testGetAlumnos() {
        System.out.println("getAlumnos");
        Curso instance = null;
        Alumno[] expResult = null;
        Alumno[] result = instance.getAlumnos();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setAlumnos method, of class Curso.
     */
    @Test
    public void testSetAlumnos() {
        System.out.println("setAlumnos");
        Alumno[] alumnos = null;
        Curso instance = null;
        instance.setAlumnos(alumnos);
    }

    /**
     * Test of getNivel method, of class Curso.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Curso instance = null;
        NivelCurso expResult = null;
        NivelCurso result = instance.getNivel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNivel method, of class Curso.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        NivelCurso nivel = null;
        Curso instance = null;
        instance.setNivel(nivel);
    }

    /**
     * Test of getModulo method, of class Curso.
     */
    @Test
    public void testGetModulo() {
        System.out.println("getModulo");
        Curso instance = null;
        ModuloCurso expResult = null;
        ModuloCurso result = instance.getModulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModulo method, of class Curso.
     */
    @Test
    public void testSetModulo() {
        System.out.println("setModulo");
        ModuloCurso modulo = null;
        Curso instance = null;
        instance.setModulo(modulo);
    }

    /**
     * Test of getAsignaturas method, of class Curso.
     */
    @Test
    public void testGetAsignaturas() {
        System.out.println("getAsignaturas");
        Curso instance = null;
        Asignatura[] expResult = null;
        Asignatura[] result = instance.getAsignaturas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of agregarAlumno method, of class Curso.
     */
    @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        Alumno al = null;
        Curso instance = null;
        instance.agregarAlumno(al);
    }

    /**
     * Test of estaAlumno method, of class Curso.
     */
    @Test
    public void testEstaAlumno() {
        System.out.println("estaAlumno");
        String run = "";
        Curso instance = null;
        boolean expResult = false;
        boolean result = instance.estaAlumno(run);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlumnoPorRut method, of class Curso.
     */
    @Test
    public void testGetAlumnoPorRut() {
        System.out.println("getAlumnoPorRut");
        String run = "";
        Curso instance = null;
        Alumno expResult = null;
        Alumno result = instance.getAlumnoPorRut(run);
        assertEquals(expResult, result);
    }

    /**
     * Test of toXML method, of class Curso.
     */
    @Test
    public void testToXML() {
        System.out.println("toXML");
        Curso instance = null;
        String expResult = "";
        String result = instance.toXML();
        assertEquals(expResult, result);
    }
    
}
