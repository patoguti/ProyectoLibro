package reportes;

import colegio.Curso;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que genera un reporte con los alumnos reprobados de todos los cursos
 *
 * @author toupa
 */
public class GenerarAlumnoReprobado {

    AlumnoReprobado[] alumnos; //alumnos reprobados

    /**
     * Llena el atributo alumnos con los alumnos reprobados
     *
     * @param cursos Cursos de un colegio
     */
    public GenerarAlumnoReprobado(Curso[] cursos) {
        int alumnosReprobados = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                if (!cursos[i].getAlumnos()[j].estaAprobado()) {
                    alumnosReprobados++;
                }

            }
        }
        this.alumnos = new AlumnoReprobado[alumnosReprobados];
        for (int i = 0; i < this.alumnos.length; i++) {
            this.alumnos[i] = new AlumnoReprobado();
        }
        int as = 0;
        for (int cantidadCurso = 0; cantidadCurso < 16; cantidadCurso++) {
            for (int alumnosTotal = 0; alumnosTotal < 30; alumnosTotal++) {
                if (!cursos[cantidadCurso].getAlumnos()[alumnosTotal].estaAprobado()) {
                    alumnos[as].nombre = (cursos[cantidadCurso].getAlumnos()[alumnosTotal].getNombre());
                    alumnos[as].apellido = (cursos[cantidadCurso].getAlumnos()[alumnosTotal].getApellido());
                    alumnos[as].run = (cursos[cantidadCurso].getAlumnos()[alumnosTotal].getRun());
                }

                as++;
            }

        }
    }

    public void ReprobadosToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.alumnos);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Reprobados/informeReprobados.json"));
            mbrWriter.write(archivo);
            mbrWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(GenerarInforme.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                mbrWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(GenerarInforme.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void ReprobadosToXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml ="<?xml version='1.0'?>\n";
            xml+="<alumnos>\n";
            for (int i = 0; i < alumnos.length; i++) {
                xml+=alumnos[i].alumnoToString();
            }
            xml+="</alumnos>";
            
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Reprobados/informeReprobados.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarAlumnoReprobado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
