package reportes;

import colegio.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que utiliza los datos necesarios para generar el Informe general el
 * cual contempla todos los datos del apoderado
 *
 * @author toupa
 */
public class ApoderadoInforme {

    private String nombre;
    private String apellido;
    private String run;
    private List<AlumnoInforme> pupilos;

    public ApoderadoInforme(String nombre, String apellido, String run, AlumnoInforme alum) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.pupilos = new ArrayList<>();
        this.pupilos.add(alum);
    }

    public ApoderadoInforme() {
        this.pupilos = new ArrayList<>();
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

    public List<AlumnoInforme> getPupilos() {
        return pupilos;
    }

    public void setPupilos(List<AlumnoInforme> pupilos) {
        this.pupilos = pupilos;
    }

    public void agregarPupilo(AlumnoInforme al) {
        this.pupilos.add(al);
    }
    public String apoderadoToXml(){
        String xml= "";
        xml+="<apoderado>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>\n";
        xml+="<run>"+run+"</run>\n";
        xml+="<pupilos>\n";
        for (int i = 0; i < pupilos.size(); i++) {
            xml+=pupilos.get(i).alumnoToXml();
        }
        xml+="</pupilos>\n";
        xml+="</apoderado>\n";
        return xml;
    }
}
