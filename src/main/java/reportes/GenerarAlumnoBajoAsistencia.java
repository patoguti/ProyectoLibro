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
 * Convierte las clases bases en las clases con los datos necesarios para
 * generar reporte de alumnos bajo un cierto % de asistencia
 *
 * @author toupa
 */
public class GenerarAlumnoBajoAsistencia {

    private AlumnoBajoAsistencia[] alumnos; //alumnos bajo cierta asistencia

    /**
     * Pobla el atributo alumnos
     *
     * @param cursos Cursos totales
     * @param bajoAsistencia Porcentaje de asistencia usado como umbral
     */
    public GenerarAlumnoBajoAsistencia(Curso[] cursos, double bajoAsistencia) {
        int alumnosBajoAsistencia = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                double porcentajeAsistencia = 0;
                double totalAsistencia = cursos[i].getAlumnos()[j].isAsistencia().length;
                for (int asistencia = 0; asistencia < totalAsistencia; asistencia++) {
                    int sumarAsistencia = (cursos[i].getAlumnos()[j].isAsistencia()[asistencia]) ? 1 : 0;
                    porcentajeAsistencia += sumarAsistencia / totalAsistencia;
                }
                if (porcentajeAsistencia < bajoAsistencia) {
                    alumnosBajoAsistencia++;
                }
            }
        }
        System.out.println(alumnosBajoAsistencia);
        this.alumnos = new AlumnoBajoAsistencia[alumnosBajoAsistencia];
        for (int i = 0; i < this.alumnos.length; i++) {
            this.alumnos[i] = new AlumnoBajoAsistencia();
        }
        int as = 0;
        for (int cantidadCurso = 0; cantidadCurso < 16; cantidadCurso++) {
            for (int alumnosTotal = 0; alumnosTotal < 30; alumnosTotal++) {

                double porcentajeAsistencia = 0;
                double totalAsistencia = cursos[cantidadCurso].getAlumnos()[alumnosTotal].isAsistencia().length;
                for (int asistencia = 0; asistencia < totalAsistencia; asistencia++) {
                    int sumarAsistencia = (cursos[cantidadCurso].getAlumnos()[alumnosTotal].isAsistencia()[asistencia]) ? 1 : 0;
                    porcentajeAsistencia += sumarAsistencia / totalAsistencia;
                    if (porcentajeAsistencia < bajoAsistencia) {
                        alumnos[as].setNombre(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getNombre());
                        alumnos[as].setApellido(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getApellido());
                        alumnos[as].setRun(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getRun());
                        alumnos[as].setAsistencia(porcentajeAsistencia * 100);
                    }
                }
                as++;
            }

        }
    }

    /**
     * Genera Json usando el atributo alumnos previamente llenado
     */
    public void bajoAsistenciaToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.alumnos);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Alumno_por_asistencia/informeBajoAsistencia.json"));
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

    public void bajoAsistenciaToXml() {
        BufferedWriter mbrWriter = null;
        try {
            String xml = "<?xml version='1.0'?>";
            xml += "<alumnos>\n";
            for (int i = 0; i < alumnos.length; i++) {
                xml += alumnos[i].alumnoToXml();
            }
            xml += "</alumnos>";
            
            String archivo = xml;
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Alumno_por_asistencia/informeBajoAsistencia.xml"));
            mbrWriter.write(archivo);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarAlumnoBajoAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
