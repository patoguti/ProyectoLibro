package colegio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import enumLibro.ModuloCurso;
import enumLibro.NivelCurso;
import enumLibro.NombreAsignatura;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que crea el archivo de carga
 *
 * @author toupa
 */
public class App {

    public static void main(String[] args) throws IOException {
        String[] nombres = {"leonardo", "ernesto", "daniel", "alvaro", "daniel", "ignacio", "patricio",
            "laura", "maria", "emilia", "antonia", "josefa", "josefina", "alejandra", "alejandro", "macarena",
            "tatiana", "yusari", "catalina", "javiera", "paula", "martina", "martin", "claudio", "juan", "moises",
            "fernando", "fernanda", "mateo", "julio", "matias", "ivette", "jose", "valeria", "paulina", "pablo",
            "andres", "dario", "nicolas", "joaquin"};
        String[] apellidos = {"gonzales", "gutierrez", "fernandez", "mauro", "lopez", "torres", "hun", "rivas",
            "jara", "salas", "aguayo", "munoz", "lagos", "pinera", "gay", "garay", "bachelet", "chang", "sandoval",
            "quiroz", "bahamonde", "bahamondes", "quintana", "grez", "etcheverry", "salamanca", "uribe", "silva",
            "salgado", "avalos", "davalos", "henriquez", "neruda", "vergara", "segovia", "lazcano", "bobadilla",
            "toledo", "vargas", "carrasco"};
        int rutApoderado = 1000;
        int rutAlumnos = 3000;
        int rutProfe = 7000;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Random rnd = new Random();
        Curso[] cursos = new Curso[16];
        cursos[0] = new Curso(NivelCurso.primero, ModuloCurso.A);
        cursos[1] = new Curso(NivelCurso.primero, ModuloCurso.B);
        cursos[2] = new Curso(NivelCurso.segundo, ModuloCurso.A);
        cursos[3] = new Curso(NivelCurso.segundo, ModuloCurso.B);
        cursos[4] = new Curso(NivelCurso.tercero, ModuloCurso.A);
        cursos[5] = new Curso(NivelCurso.tercero, ModuloCurso.B);
        cursos[6] = new Curso(NivelCurso.cuarto, ModuloCurso.A);
        cursos[7] = new Curso(NivelCurso.cuarto, ModuloCurso.B);
        cursos[8] = new Curso(NivelCurso.quinto, ModuloCurso.A);
        cursos[9] = new Curso(NivelCurso.quinto, ModuloCurso.B);
        cursos[10] = new Curso(NivelCurso.sexto, ModuloCurso.A);
        cursos[11] = new Curso(NivelCurso.sexto, ModuloCurso.B);
        cursos[12] = new Curso(NivelCurso.septimo, ModuloCurso.A);
        cursos[13] = new Curso(NivelCurso.septimo, ModuloCurso.B);
        cursos[14] = new Curso(NivelCurso.octavo, ModuloCurso.A);
        cursos[15] = new Curso(NivelCurso.octavo, ModuloCurso.B);
        ArrayList<Alumno> alumaux = new ArrayList<>();
        Evaluacion[] evaluaciones = new Evaluacion[25];
        for (int i = 0; i < 5; i++) {
            evaluaciones[i] = new Evaluacion(NombreAsignatura.matematicas);
            evaluaciones[i + 5] = new Evaluacion(NombreAsignatura.lenguaje);
            evaluaciones[i + 10] = new Evaluacion(NombreAsignatura.ciencias);
            evaluaciones[i + 15] = new Evaluacion(NombreAsignatura.ingles);
            evaluaciones[i + 20] = new Evaluacion(NombreAsignatura.historia);
        }
        
        for (int cursoTotal = 0; cursoTotal < 16; cursoTotal++) {
            Alumno[] alumnoLlenar = new Alumno[30];
            for (int alumnado = 0; alumnado < 30; alumnado++) {
                String nombreRnd = nombres[rnd.nextInt(nombres.length)];
                String apellidoRnd = apellidos[rnd.nextInt(apellidos.length)];
                alumnoLlenar[alumnado] = new Alumno(nombreRnd, apellidoRnd, String.valueOf(rutAlumnos++));
                for(int i=0;i<25;i++){
                    evaluaciones[i].setNota(rnd.nextInt(7)+1);
                }
                alumnoLlenar[alumnado].setEvaluaciones(evaluaciones);
                alumaux.add(alumnoLlenar[alumnado]);
            }
            Apoderado[] apoderadoLlenar = new Apoderado[rnd.nextInt(5) + 25];
            for (int i = 0; i < apoderadoLlenar.length; i++) {
                String nombreRnd = nombres[rnd.nextInt(nombres.length)];
                String apellidoRnd = apellidos[rnd.nextInt(apellidos.length)];
                apoderadoLlenar[i] = new Apoderado(nombreRnd, apellidoRnd, String.valueOf(rutApoderado++), alumnoLlenar[i]);

            }
            for (int i = apoderadoLlenar.length; i < alumnoLlenar.length; i++) {
                int apoderadoRandom = rnd.nextInt(apoderadoLlenar.length);
                apoderadoLlenar[apoderadoRandom].agregarPupilo(alumnoLlenar[i]);
            }

            for (int i = 0; i < 5; i++) {
                String nombreRnd = nombres[rnd.nextInt(nombres.length)];
                String apellidoRnd = apellidos[rnd.nextInt(apellidos.length)];
                cursos[cursoTotal].getAsignaturas()[i].setProfesor(new Profesor(nombreRnd, apellidoRnd, String.valueOf(rutProfe++)));
                String[] plan= new String[20];
                plan[0]= "Prueba escrita";
                plan[1] = "Taller";
                plan[2] = "Control";
                plan[3] = "Trabajo grupal";
                plan[4] = "Trabajo individual";
                plan[5]= "Informe";
                plan[6] = "Informe grupal";
                plan[7] = "Tarea Clases";
                plan[8] = "Control grupal";
                plan[9] = "Trabajo investigacion";
                plan[10] = "Tarea grupal";
                plan[11] = "Prueba grupal";
                plan[12] = "Control materia clase anterior";
                plan[13] = "Prueba desarrollo";
                plan[14] = "Prueba conceptos";
                plan[15] = "Informe individual";
                plan[16] = "Tarea";
                plan[17] = "Control sorpresa";
                plan[18] = "Revision cuadernos";
                plan[19] = "Revision Avance informe";
                for(int m=0;m<5;m++){
                    for (int j = 0; j < 10; j++) {
                        cursos[cursoTotal].getAsignaturas()[m].agregarPlan(plan[rnd.nextInt(20)]);
                    }
                }
                
            }
            cursos[cursoTotal].setAlumnos(alumnoLlenar);
        }
        int cantidadTotalAp = 400 + rnd.nextInt(80);
        Apoderado[] apoderados = new Apoderado[cantidadTotalAp];
        for (int i = 0; i < cantidadTotalAp; i++) {
            int posPupilo = rnd.nextInt(alumaux.size());
            String nombreRnd = nombres[rnd.nextInt(nombres.length)];
            String apellidoRnd = apellidos[rnd.nextInt(apellidos.length)];
            apoderados[i] = new Apoderado(nombreRnd, apellidoRnd, String.valueOf(rutApoderado++), alumaux.get(posPupilo));
            alumaux.remove(posPupilo);
        }
        for (int i = 0; i < (480 - cantidadTotalAp); i++) {
            int posApoderado = rnd.nextInt(cantidadTotalAp);
            int posPupilo = rnd.nextInt(alumaux.size());
            apoderados[posApoderado].agregarPupilo(alumaux.get(posPupilo));
        }

        String archivo = gson.toJson(cursos);
        BufferedWriter mbrWriter = new BufferedWriter(new FileWriter("cursosTotal.json"));
        mbrWriter.write(archivo);
        mbrWriter.close();

        String archivoAp = gson.toJson(apoderados);
        BufferedWriter mbrWriter2 = new BufferedWriter(new FileWriter("apoderados.json"));
        mbrWriter2.write(archivoAp);
        mbrWriter2.close();

        String archivoXml = "<xml version='1.0'>\n";
        archivoXml += "<cursos>\n";
        for (int i = 0; i < 16; i++) {
            archivoXml += cursos[i].toXML();
        }
        archivoXml += "\n<cursos>";
        BufferedWriter mbrWriter3 = new BufferedWriter(new FileWriter("curso.xml"));
        mbrWriter3.write(archivoXml);
        mbrWriter3.close();

        String archivoXmlAp = "<xml version='1.0'>\n";
        archivoXmlAp += "<apoderados>\n";
        for (int i = 0; i < apoderados.length; i++) {
            archivoXmlAp += apoderados[i].toXML();
        }
        archivoXmlAp += "\n</apoderados>";
        BufferedWriter mbrWriter4 = new BufferedWriter(new FileWriter("apoderados.xml"));
        mbrWriter4.write(archivoXmlAp);
        mbrWriter4.close();
    }

}
