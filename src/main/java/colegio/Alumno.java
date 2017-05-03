package colegio;

import enumLibro.NombreAsignatura;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un alumno
 *
 * @author toupa
 */
public class Alumno {

    private String nombre; // nombre alumno
    private String apellido; // apellido alumno
    private boolean[] asistencia; // arreglo de asistencias
    private String run; // run alumno
    private Evaluacion[] promedios; //promedios de asignaturas
    private Evaluacion[] evaluaciones; // evaluaciones
    private List<Anotacion> anotaciones; //anotaciones del alumno

    /**
     * Construccion objeto alumno
     *
     * @param nombre Nombre alumno
     * @param apellido Apellido alumno
     * @param run Run alumno
     */
    public Alumno(String nombre, String apellido, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.asistencia = new boolean[30];
        this.promedios = new Evaluacion[5];
        this.promedios[0] = new Evaluacion(NombreAsignatura.matematicas);
        this.promedios[1] = new Evaluacion(NombreAsignatura.lenguaje);
        this.promedios[2] = new Evaluacion(NombreAsignatura.ciencias);
        this.promedios[3] = new Evaluacion(NombreAsignatura.ingles);
        this.promedios[4] = new Evaluacion(NombreAsignatura.historia);

        this.evaluaciones = new Evaluacion[25];
        for (int i = 0; i < 5; i++) {
            this.evaluaciones[i] = new Evaluacion(NombreAsignatura.matematicas);
            this.evaluaciones[i + 5] = new Evaluacion(NombreAsignatura.lenguaje);
            this.evaluaciones[i + 10] = new Evaluacion(NombreAsignatura.ciencias);
            this.evaluaciones[i + 15] = new Evaluacion(NombreAsignatura.ingles);
            this.evaluaciones[i + 20] = new Evaluacion(NombreAsignatura.historia);
        }
        this.anotaciones = new ArrayList<>();
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

    public boolean[] isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean[] asistencia) {
        this.asistencia = asistencia;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Evaluacion[] getPromedios() {
        return promedios;
    }

    public void setPromedios(Evaluacion[] promedios) {
        this.promedios = promedios;
    }

    public List<Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(List<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public Evaluacion[] getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Evaluacion[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    /**
     * Agrega una anotacion al alumno
     *
     * @param anotacion Anotacion tipo positiva o negativa junto con motivo
     */
    public void agregarAnotacion(Anotacion anotacion) {
        this.anotaciones.add(anotacion);
    }

    /**
     * Calcula el porcentaje de asistencia
     *
     * @return Porcentaje de asistencia
     */
    public double obtenerAsistencia() {
        double i = 0.0;
        for (boolean bol : this.asistencia) {
            if (bol) {
                i++;
            }
        }
        return (i / 30.0) * 100.0;
    }

    /**
     * Calcula si el alumno esta aprobado
     *
     * @return True si esta aprobado
     */
    public boolean estaAprobado() {
        int cantidadRojos = 0;
        double promedioGeneral = 0.0;
        if (this.obtenerAsistencia() >= 85.0) {
            for (int i = 0; i < 5; i++) {
                double promedio = this.promedios[i].getNota();
                promedioGeneral += promedio / 5;
                if (promedio < 4.0) {
                    cantidadRojos++;
                }
            }
            if (cantidadRojos == 0) {
                return true;
            } else if (cantidadRojos == 1 && promedioGeneral >= 4.5) {
                return true;
            } else if (cantidadRojos == 2 && promedioGeneral >= 5.0) {
                return true;
            }
        }

        return false;
    }

    public String toXML() {
        String xml = "\n<alumno>\n";
        xml += "\t<rut>" + this.run + "</rut>\n";
        xml += "\t<nombre>" + this.nombre + "</nombre>\n";
        xml += "\t<apellido>" + this.apellido + "</apellido>\n";
        xml += "\t<asistencias>\n";
        for (int i = 0; i < this.asistencia.length; i++) {
            xml += "\t\t<asistencia>";
            xml += this.asistencia[i];
            xml += "</asistencia>\n";
        }
        xml += "\t</asistencias>\n";
        xml += "\t<promedios>\n";
        for (int i = 0; i < this.promedios.length; i++) {
            xml += "\t\t<" + this.promedios[i].getAsignatura() + ">";
            xml += this.promedios[i].getNota();
            xml += "</" + this.promedios[i].getAsignatura() + ">\n";
        }
        xml += "\t</promedios>\n";
        xml += "\t<evaluaciones>\n";
        for (int i = 0; i < this.evaluaciones.length; i++) {

            xml += this.evaluaciones[i].toXML() + "\n";

        }
        xml += "\t</evaluaciones>\n";
        xml += "\t<anotaciones>\n";
        for (int i = 0; i < this.anotaciones.size(); i++) {
            xml += "\t\t" + this.anotaciones.get(i).toXML() + "\n";
        }
        xml += "\t</anotaciones>\n";
        xml += "</alumno>\n";
        return xml;
    }
}
