package reportes;

/**
 * Clase con los atributos necesarios de un alumno para obtener su planificacion
 * de cada asignatura
 *
 * @author toupa
 */
public class PlanificacionAlumno {

    public String nombre; //nombre del alumno
    public String apellido;//apellido del alumno
    public String run; //run del alumno
    public String[] plan; //planes de las asignaturas que cursa el alumno

    public PlanificacionAlumno() {
        plan = new String[50];
    }

    public String planifAlumnotoXml() {
        String xml = "<pupilo>\n";
        xml += "<nombre>" + nombre + "</nombre>\n";
        xml += "<apellido>" + apellido + "</apellido>\n";
        xml += "<run>" + run + "</run>\n";
        xml += "<planes>\n";
        for (int i = 0; i < plan.length; i++) {
            xml += "<plan>" + plan[i] + "</plan>\n";
        }
        xml += "</planes>\n";
        xml += "</pupilo>\n";
        return xml;
    }

}
