package reportes;

/**
 * Clase con lo datos necesarios para generar el reporte de un alumno reprobado
 *
 * @author toupa
 */
public class AlumnoReprobado {

    public String nombre; //nombre del alumno
    public String apellido; //apellido del alumno
    public String run; //run del alumno

    public AlumnoReprobado() {
    }
    public String alumnoToString(){
        String xml= "";
        xml+="<alumno>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml+="</alumno>\n";
        return xml;
    }

}
