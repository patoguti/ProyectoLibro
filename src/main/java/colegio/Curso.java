package colegio;

import enumLibro.ModuloCurso;
import enumLibro.NivelCurso;
import enumLibro.NombreAsignatura;

/**
 * Clase que representa un curso
 *
 * @author toupa
 */
public class Curso {

    private Alumno[] alumnos; //alumnos dentro del curso
    private NivelCurso nivel; //nivel de basica del curso
    private ModuloCurso modulo; //modulo del curso (A o B)
    private Asignatura[] asignaturas; // asignaturas que posee el curso
    private int cantAlumnos; //cantidad de alumnos que posee el curso

    /**
     * Creacion del Curso
     *
     * @param nivel Nivel del Curso
     * @param modulo Modulo del Curso
     */
    public Curso(NivelCurso nivel, ModuloCurso modulo) {
        this.nivel = nivel;
        this.modulo = modulo;
        this.alumnos = new Alumno[30];
        this.asignaturas = new Asignatura[5];
        this.cantAlumnos = 0;
        this.asignaturas[0] = new Asignatura(NombreAsignatura.matematicas);
        this.asignaturas[1] = new Asignatura(NombreAsignatura.lenguaje);
        this.asignaturas[2] = new Asignatura(NombreAsignatura.ciencias);
        this.asignaturas[3] = new Asignatura(NombreAsignatura.ingles);
        this.asignaturas[4] = new Asignatura(NombreAsignatura.historia);
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public NivelCurso getNivel() {
        return nivel;
    }

    public void setNivel(NivelCurso nivel) {
        this.nivel = nivel;
    }

    public ModuloCurso getModulo() {
        return modulo;
    }

    public void setModulo(ModuloCurso modulo) {
        this.modulo = modulo;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void agregarAlumno(Alumno al) {
        if (this.cantAlumnos < 30) {
            this.alumnos[this.cantAlumnos++] = al;
        }
    }

    public boolean estaAlumno(String run) {
        for (int i = 0; i < 30; i++) {
            if (alumnos[i].getRun().equals(run)) {
                return true;
            }
        }
        return false;
    }

    public Alumno getAlumnoPorRut(String run) {
        for (int i = 0; i < 30; i++) {
            if (alumnos[i].getRun().equals(run)) {
                return alumnos[i];
            }
        }
        return null;
    }

    public String toXML() {
        String xml = "\n<curso>\n";
        xml += "\t<nivel>" + this.nivel + "</nivel>\n";
        xml += "\t<modulo>" + this.modulo + "</modulo>\n";
        xml += "\t<alumnos>\n";
        for (int i = 0; i < this.alumnos.length; i++) {
            xml += "\t\t" + this.alumnos[i].toXML() + "\n";
        }
        xml += "\t</alumnos>\n";
        xml += "\t<asignaturas>\n";
        for (int i = 0; i < this.asignaturas.length; i++) {
            xml += "\t\t" + this.asignaturas[i].toXML() + "\n";
        }
        xml += "\t</asignaturas>\n";
        xml += "</curso>\n";
        return xml;
    }
}
