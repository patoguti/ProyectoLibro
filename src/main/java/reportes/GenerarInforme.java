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
 * Clase que genera el informe de notas junto a las anotaciones y planificaciones
 * de los alumnos
 * @author toupa
 */
public class GenerarInforme {

    private AlumnoInforme[] alumnos; //alumnos a poblar
    private ApoderadoInforme[] apoderados; //apoderados a poblar
/**
 * Pobla los dos atributos para obtener el reporte final
 * @param apoderados Apoderados de un colegio
 * @param cursos Cursos de un colegio
 */
    public GenerarInforme(Apoderado[] apoderados, Curso[] cursos) {
        this.apoderados = new ApoderadoInforme[apoderados.length];
        System.out.println(apoderados.length);
        alumnos = new AlumnoInforme[16 * 30];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new AlumnoInforme();
        }
        for (int i = 0; i < apoderados.length; i++) {
            this.apoderados[i] = new ApoderadoInforme();
        }
        int as = 0;
        for (int cantidadCurso = 0; cantidadCurso < 16; cantidadCurso++) {
            for (int alumnosTotal = 0; alumnosTotal < 30; alumnosTotal++) {
                alumnos[as].setNombre(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getNombre());
                alumnos[as].setApellido(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getApellido());
                alumnos[as].setAsistencia(cursos[cantidadCurso].getAlumnos()[alumnosTotal].isAsistencia());
                alumnos[as].setRun(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getRun());
                alumnos[as].setEvaluaciones(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getEvaluaciones());
                alumnos[as].setAnotaciones(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getAnotaciones());
                for (int j = 0; j < 50; j++) {
                    alumnos[as].plan[j] = cursos[cantidadCurso].getAsignaturas()[(int) j / 10].getPlan()[(int) j % 10];
                }
                as++;
            }

        }
        for (int i = 0; i < this.apoderados.length; i++) {
            this.apoderados[i].setNombre(apoderados[i].getNombre());
            this.apoderados[i].setApellido(apoderados[i].getApellido());
            this.apoderados[i].setRun(apoderados[i].getRun());
            for (int j = 0; j < apoderados[i].getPupilos().size(); j++) {
                for (int k = 0; k < alumnos.length; k++) {
                    if (apoderados[i].getPupilos().get(j).getRun().equals(alumnos[k].getRun())) {
                        this.apoderados[i].agregarPupilo(alumnos[k]);
                        k = alumnos.length;
                    }
                }
            }
        }
    }

    public void alumToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.apoderados);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Informe_notas/informeGeneral.json"));
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
    public void alumToXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml="<?xml version='1.0'?>";
            xml+="<apoderados>\n";
            for (int i = 0; i < apoderados.length; i++) {
                xml+=apoderados[i].apoderadoToXml();
            }
            xml+="</apoderados>";
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Informe_notas/informeGeneral.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarInforme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
