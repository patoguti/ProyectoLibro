package colegio;

import enumLibro.NombreAsignatura;

/**
 * Clase que representa una Evaluacion
 *
 * @author toupa
 */
public class Evaluacion {

    private double nota; //nota obtenida en la evaluacion
    private NombreAsignatura asignatura; //Asignatura de donde procede la evaluacion

    /**
     * Constructor de la clase Evaluacion
     *
     * @param nota Nota obtenida
     * @param asignatura Asignatura donde fue tomada
     */
    public Evaluacion(double nota, NombreAsignatura asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public Evaluacion(NombreAsignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public NombreAsignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(NombreAsignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String toXML() {
        String xml = "\n<evaluacion>\n";
        xml += "\t<asignatura>" + this.asignatura + "</asignatura>\n";
        xml += "\t<nota>" + this.nota + "</nota>\n";
        xml += "</evaluacion>\n";
        return xml;
    }
}
