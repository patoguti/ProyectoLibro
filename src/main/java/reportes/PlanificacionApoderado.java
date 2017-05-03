package reportes;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase con los datos necesarios para generar reporte de las planificaciones
 * de cada pupilo de un apoderado
 * @author toupa
 */
public class PlanificacionApoderado {

    public String nombre; //nombre del apoderado
    public String apellido; //apellido del apoderado
    public String run; //run del apoderado
    public List<PlanificacionAlumno> pupilos;//pupilos a cargo del apoderado

    public PlanificacionApoderado() {
        pupilos = new ArrayList<>();
    }
    
    public String planiftoXml(){
        String xml="";
        xml+="<apoderado>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml+="<pupilos>\n";
        for (int i = 0; i < pupilos.size(); i++) {
            xml+= pupilos.get(i).planifAlumnotoXml();
        }
        xml+="</pupilos>\n";
        xml+="</apoderado>\n";
        return xml;
    }
    
}
