package reportes;

import colegio.Apoderado;
import colegio.Curso;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que genera el reporte de las planificaciones de los pupilos de los
 * apoderados
 *
 * @author toupa
 */
public class GenerarInformePlanificacion {

    PlanificacionApoderado[] apoderados; //apoderados de un colegio

    /**
     * Genera el llenado del atributo apoderados
     *
     * @param cursos Cursos de un colegio
     * @param apoderados Apoderados de un colegio
     */
    public GenerarInformePlanificacion(Curso[] cursos, Apoderado[] apoderados) {
        this.apoderados = new PlanificacionApoderado[apoderados.length];
        for (int i = 0; i < apoderados.length; i++) {
            this.apoderados[i] = new PlanificacionApoderado();
        }

        int cantidadCurso = 0;

        for (int apTotal = 0; apTotal < this.apoderados.length; apTotal++) {
            this.apoderados[apTotal].nombre = apoderados[apTotal].getNombre();
            this.apoderados[apTotal].apellido = apoderados[apTotal].getApellido();
            this.apoderados[apTotal].run = apoderados[apTotal].getRun();
            for (int cantPupilos = 0; cantPupilos < apoderados[apTotal].getPupilos().size(); cantPupilos++) {

                PlanificacionAlumno alumnoAgregar = new PlanificacionAlumno();
                alumnoAgregar.nombre = apoderados[apTotal].getPupilos().get(cantPupilos).getNombre();
                alumnoAgregar.apellido = apoderados[apTotal].getPupilos().get(cantPupilos).getApellido();
                alumnoAgregar.run = apoderados[apTotal].getPupilos().get(cantPupilos).getRun();
                for (int j = 0; j < 16; j++) {
                    for (int alum = 0; alum < 30; alum++) {
                        if (cursos[j].getAlumnos()[alum].getRun().equals(apoderados[apTotal].getPupilos().get(cantPupilos).getRun())) {
                            cantidadCurso = j;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 50; i++) {
                    alumnoAgregar.plan[i] = cursos[cantidadCurso].getAsignaturas()[(int) i / 10].getPlan()[i % 10];
                }
                this.apoderados[apTotal].pupilos.add(alumnoAgregar);

            }
        }

    }

    public void planifToJson() {
        BufferedWriter mbrWriter = null;
         
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.apoderados);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Planificacion_por_alumno/planificacionPorPupilo.json"));
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
    public void planifToXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml="<?xml version='1.0'?>";
            xml+="<apoderados>\n";
            for (int i = 0; i < apoderados.length; i++) {
                xml+=apoderados[i].planiftoXml();
            }
            xml+="</apoderados>\n";
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Planificacion_por_alumno/planificacionPorPupilo.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarInformePlanificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
