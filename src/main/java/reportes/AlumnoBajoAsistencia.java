package reportes;

/**
 * Clase que representa los datos necesarios para crear el reporte de alumnos
 * con baja asistencia
 *
 * @author toupa
 */
public class AlumnoBajoAsistencia {

    private String nombre; //nombre del alumno
    private String apellido; //apellido del alumno
    private String run; // run del alumno
    private double asistencia; // porcentaje de asistencia del alumno

    public AlumnoBajoAsistencia() {
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
        xml+="<asistencia>"+asistencia+"</asistencia>\n";
        xml+="</alumno>\n";
        return xml;
    }
}
