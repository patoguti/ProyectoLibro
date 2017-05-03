package reportes;

import colegio.Anotacion;
import colegio.Evaluacion;
import enumLibro.NombreAsignatura;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que utiliza todos los datos necesarios del alumno para generar el
 * informe de notas en conjunto con las anotaciones y planificaciones de cada
 * asignatura
 *
 * @author toupa
 */
public class AlumnoInforme {

    private String nombre; //nombre del alumno
    private String apellido; //apellido del alumno
    private boolean[] asistencia; // asistencias del alumno
    private String run; //run del alumno
    private Evaluacion[] promedios; //promedio de cada asignatura
    private Evaluacion[] evaluaciones; //total de evaluaciones
    private List<Anotacion> anotaciones; //total de anotaciones
    public String[] plan; //planes de cada asignatura

    /**
     * Constructo de la clase
     *
     * @param nombre Nombre del alumno
     * @param apellido Apellido del alumno
     * @param run Run del alumno
     */
    public AlumnoInforme(String nombre, String apellido, String run) {
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
        this.plan = new String[50];
        this.anotaciones = new ArrayList<>();
    }

    public AlumnoInforme() {
        this.asistencia = new boolean[30];
        this.promedios = new Evaluacion[5];
        this.plan = new String[50];
        this.plan = new String[50];
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

    public void agregarAnotacion(Anotacion anotacion) {
        this.anotaciones.add(anotacion);
    }

    /**
     * Obtiene la asistencia en forma de porcentaje
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
     * Saber si un alumno esta aprobado
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

    public String alumnoToXml() {
        String xml = "<alumno>\n";
        xml += "<nombre>" + nombre + "</nombre>\n";
        xml += "<apellido>" + apellido + "</apellido>\n";
        xml += "<run>" + run + "</run>\n";
        xml += "<asistencias>\n";
        for (int i = 0; i < asistencia.length; i++) {
            xml += "<asistencia>" + asistencia[i] + "</asistencia>\n";
        }
        xml += "</asistencias>\n";
        xml += "<promedios>\n";
//        for (int i = 0; i < this.promedios.length; i++) {
//            System.out.println("promedios");
//            xml += this.promedios[i].toXML();
//        }
        xml += "</promedios>\n";
        xml += "<evaluaciones>\n";
        for (int i = 0; i < this.evaluaciones.length; i++) {
            
            xml += this.evaluaciones[i].toXML();
        }
        xml += "</evaluaciones>\n";
        xml += "<anotaciones>\n";
        for (int i = 0; i < anotaciones.size(); i++) {
            xml += anotaciones.get(i).toXML();
        }
        xml += "</anotaciones>\n";
        xml +="<planes>\n";
        for (int i = 0; i < plan.length; i++) {
            xml+="<plan>"+plan[i]+"</plan>\n";
        }
        xml +="</planes>\n";
        xml += "</alumno>\n";
        return xml;
    }
}
