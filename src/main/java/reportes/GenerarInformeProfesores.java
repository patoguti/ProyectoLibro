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
 * Clase que genera el reporte del informe dirigido a los profesores
 *
 * @author toupa
 */
public class GenerarInformeProfesores {

    private InformeProfesores[] infoProfe; //profesores del colegio

    /**
     * Pobla el atributo para crear el reporte
     *
     * @param cursos Cursos del colegio
     */
    public GenerarInformeProfesores(Curso[] cursos) {
        this.infoProfe = new InformeProfesores[5 * 16];

        int as = 0;
        int profe = 0;
        for (int cantidadCurso = 0; cantidadCurso < 16; cantidadCurso++) {
            for (as = 0; as < 5; as++) {
                this.infoProfe[profe] = new InformeProfesores(cursos[cantidadCurso].getAsignaturas()[as].getNombre());
                this.infoProfe[profe].setNombre(cursos[cantidadCurso].getAsignaturas()[as].getProfesor().getNombre());
                this.infoProfe[profe].setApellido(cursos[cantidadCurso].getAsignaturas()[as].getProfesor().getApellido());
                this.infoProfe[profe].setRun(cursos[cantidadCurso].getAsignaturas()[as].getProfesor().getRun());
                for (int alumnosTotal = 0; alumnosTotal < 30; alumnosTotal++) {

                    this.infoProfe[profe].getAlumnos()[alumnosTotal].setNombre(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getNombre());
                    this.infoProfe[profe].getAlumnos()[alumnosTotal].setApellido(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getApellido());
                    this.infoProfe[profe].getAlumnos()[alumnosTotal].setRun(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getRun());
                    for (int j = 0; j < 5; j++) {
                        if (cursos[cantidadCurso].getAlumnos()[alumnosTotal].getPromedios()[j].getAsignatura().equals(infoProfe[profe].getAsignatura())) {
                            infoProfe[profe].getAlumnos()[alumnosTotal].setPromedio(cursos[cantidadCurso].getAlumnos()[alumnosTotal].getPromedios()[j].getNota());
                        }
                    }
                }
                profe++;
            }
        }

    }

    public void profeToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.infoProfe);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Promedio_para_profesor/informeProfesores.json"));
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
    public void profetoXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml="<?xml version='1.0'?>";
            xml+="<profesores>\n";
            for (int i = 0; i < infoProfe.length; i++) {
                xml+=infoProfe[i].profetoXml();
            }
            xml+="</profesores>";
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Promedio_para_profesor/informeProfesores.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarInformeProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
