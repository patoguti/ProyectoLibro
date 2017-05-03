package reportes;

import colegio.Evaluacion;
import enumLibro.NombreAsignatura;

/**
 * Clase que representa a un Alumno con los datos necesarios para
 * crear reporte de sus notas y su asistencia
 * @author toupa
 */
public class AlumnoNotasAsistencia {

    private String nombre; //nombre del alumno
    private String apellido; //apellido del alumno
    private String run; //run del alumno
    private Evaluacion[] evaluaciones; //evaluaciones del alumno
    private double asistencia; //porcentaje de asistencia del alumno

    public AlumnoNotasAsistencia() {
        this.evaluaciones = new Evaluacion[25];
        for (int i = 0; i < 5; i++) {
            this.evaluaciones[i] = new Evaluacion(NombreAsignatura.matematicas);
            this.evaluaciones[i + 5] = new Evaluacion(NombreAsignatura.lenguaje);
            this.evaluaciones[i + 10] = new Evaluacion(NombreAsignatura.ciencias);
            this.evaluaciones[i + 15] = new Evaluacion(NombreAsignatura.ingles);
            this.evaluaciones[i + 20] = new Evaluacion(NombreAsignatura.historia);
        }
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

    public Evaluacion[] getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Evaluacion[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }
    
    public String alumnoToXml(){
        String xml = "<alumno>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml += "<evaluaciones>\n";
        for (int i = 0; i < evaluaciones.length; i++) {
            xml += evaluaciones[i].toXML();
        }
        xml += "</evaluaciones>\n";
        xml+="<asistencia>"+asistencia+"</asistencia>\n";
        xml+="</alumno>\n";
        return xml;
    }

}
