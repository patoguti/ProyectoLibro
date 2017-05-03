package reportes;

import java.util.List;

/**
 * Clase con los datos necesarios para representar un apoderado
 *
 * @author toupa
 */
public class ApoderadoPupilos {

    public String nombre; //nombre del apoderado
    public String apellido; // apellido del apoderado
    public String run; //run del apoderado

    public ApoderadoPupilos() {
    }
    
    public String apoderadoToString(){
        String xml= "";
        xml+="<apoderado>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml+="</apoderado>\n";
        return xml;
    }

}
