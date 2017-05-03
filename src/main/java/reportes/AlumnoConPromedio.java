package reportes;

import colegio.Evaluacion;
import enumLibro.NombreAsignatura;

/**
 * Clase que representa a un alumno con los datos necesarios para mostrar su
 * promedio en cada ramo
 *
 * @author toupa
 */
public class AlumnoConPromedio {

    private String nombre; //nombre alumno
    private String apellido; //apellido alumno
    private String run; //run alumno
    private double promedio; //promedio del alumno en una asignatura

    public AlumnoConPromedio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public String alumnoToXml(){
        String xml = "<alumno>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml+="<promedio>"+promedio+"</promedio>\n";
        xml+="</alumno>\n";
        return xml;
    }
}
