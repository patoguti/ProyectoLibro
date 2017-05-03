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
 * Clase que genera los reportes referentes a las notas y asistencias de cada
 * alumno
 *
 * @author toupa
 */
public class GenerarInformeNotasAsistencia {

    AlumnoNotasAsistencia[] alumnos;//alumnos de un colegio

    /**
     * Genera el poblamiento del atributo alumnos
     *
     * @param cursos Cursos de un colegio
     */
    public GenerarInformeNotasAsistencia(Curso[] cursos) {
        this.alumnos = new AlumnoNotasAsistencia[16 * 30];
        for (int i = 0; i < 480; i++) {
            this.alumnos[i] = new AlumnoNotasAsistencia();
        }
        int as = 0;
        for (int cantidadCurso = 0; cantidadCurso < 16; cantidadCurso++) {
            for (int alumnosTotal = 0; alumnosTotal < 30; alumnosTotal++) {
                alumnos[as].setNombre(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getNombre());
                alumnos[as].setApellido(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getApellido());
                alumnos[as].setRun(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getRun());
                double porcentajeAsistencia = 0;
                double totalAsistencia = cursos[cantidadCurso].getAlumnos()[alumnosTotal].isAsistencia().length;
                for (int asistencia = 0; asistencia < totalAsistencia; asistencia++) {
                    int sumarAsistencia = (cursos[cantidadCurso].getAlumnos()[alumnosTotal].isAsistencia()[asistencia]) ? 1 : 0;
                    porcentajeAsistencia += sumarAsistencia / totalAsistencia;

                }
                alumnos[as].setAsistencia(porcentajeAsistencia * 100);
                alumnos[as].setEvaluaciones(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getEvaluaciones());
                as++;
            }

        }

    }

    public void notaAsistenciaToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.alumnos);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Asistencia_notas/informeNotaAsistencia.json"));
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
    public void notaAsistenciatoXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml="<?xml version='1.0'?>";
            xml+="<alumnos>\n";
            for (int i = 0; i < alumnos.length; i++) {
                xml+=alumnos[i].alumnoToXml();
            }
            xml+="</alumnos>";
            
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Asistencia_notas/informeNotaAsistencia.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarInformeNotasAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
