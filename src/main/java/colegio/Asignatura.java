package colegio;

import enumLibro.NombreAsignatura;

/**
 * Clase que representa una asignatura del Curso
 *
 * @author toupa
 */
public class Asignatura {

    private String[] plan; // planes que posee la asignatura
    private NombreAsignatura nombre; //nombre de la asignatura
    private int cantidadActividad; // cantidad de actividades realizadas
    private Profesor profesor; //Profesor que imparte la asignatura

    /**
     * Constructo de la clase Asignatura
     *
     * @param nombre Nombre de la asignatura
     */
    public Asignatura(NombreAsignatura nombre) {
        this.plan = new String[10];
        this.cantidadActividad = 0;
        this.nombre = nombre;

    }

    public String[] getPlan() {
        return plan;
    }

    public void setPlan(String[] plan) {
        this.plan = plan;
    }

    /**
     * Permite agregar plan
     *
     * @param plan Descripcion del plan
     */
    public void agregarPlan(String plan) {
        if (cantidadActividad < 10) {
            this.plan[cantidadActividad++] = plan;
        } else {
            System.out.println("Plan lleno");
        }
    }

    public NombreAsignatura getNombre() {
        return nombre;
    }

    public void setNombre(NombreAsignatura nombre) {
        this.nombre = nombre;
    }

    public int getCantidadActividad() {
        return cantidadActividad;
    }

    public void setCantidadActividad(int cantidadActividad) {
        this.cantidadActividad = cantidadActividad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String toXML() {
        String xml = "\n<asignatura>\n";
        xml += "\t<nombre>" + this.nombre + "</nombre>\n";
        xml += "\t<plan>\n";
        for (int i = 0; i < this.plan.length; i++) {
            xml += "\t\t<actividad>";
            xml += this.plan[i];
            xml += "</actividad>\n";
        }
        xml += "\t</plan>";
        xml += this.profesor.toXML();
        xml += "</asignatura>\n";
        return xml;
    }

}
