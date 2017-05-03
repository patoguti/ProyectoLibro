package colegio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un Apoderado
 *
 * @author toupa
 */
public class Apoderado {

    private String nombre; //nombre del apoderado
    private String apellido; //apellido del apoderado
    private String run; //run del apoderado
    private List<Alumno> pupilos; // lista de sus pupilos

    /**
     * Constructo de la clase Apoderado
     *
     * @param nombre Nombre del apoderado
     * @param apellido Apellido del apoderado
     * @param run Run del apoderado
     * @param alum Alumno (pupilo) que debe tener el Apoderado
     */
    public Apoderado(String nombre, String apellido, String run, Alumno alum) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.pupilos = new ArrayList<>();
        this.pupilos.add(alum);
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

    public List<Alumno> getPupilos() {
        return pupilos;
    }

    public void setPupilos(List<Alumno> pupilos) {
        this.pupilos = pupilos;
    }

    /**
     * Agrega pupilos a la lista
     *
     * @param al Nuevo Alumno a agregar
     */
    public void agregarPupilo(Alumno al) {
        this.pupilos.add(al);
    }

    public String toXML() {
        String xml = "\n<apoderado>\n";
        xml += "\t<run>" + this.run + "</run>\n";
        xml += "\t<nombre>" + this.nombre + "</nombre>\n";
        xml += "\t<apellido>" + this.apellido + "</apellido>\n";
        xml += "\t<pupilos>\n";
        for (int i = 0; i < this.pupilos.size(); i++) {
            xml += this.pupilos.get(i).toXML();
        }
        xml += "\t</pupilos>\n";
        xml += "</apoderado>";
        return xml;
    }
}
