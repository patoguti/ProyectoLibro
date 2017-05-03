package reportes;

import enumLibro.NombreAsignatura;

/**
 * Clase con los elementos necesarios para crear un informe dirigido a los
 * profesores referente a sus alumnos
 *
 * @author toupa
 */
public class InformeProfesores {

    private String nombre; //nombre del profesor
    private String apellido; //apellido del profesor
    private String run; //run del profesor
    private NombreAsignatura asignatura;//asignatura a cargo del profesor
    private AlumnoConPromedio[] alumnos; //alumnos que cursan su asignatura

    /**
     * Constructor de la clase
     *
     * @param asignatura Nombre de la asignatura que dicta el profesor
     */
    public InformeProfesores(NombreAsignatura asignatura) {
        this.asignatura = asignatura;
        this.alumnos = new AlumnoConPromedio[30];
        for (int i = 0; i < 30; i++) {
            this.alumnos[i] = new AlumnoConPromedio();
        }

    }

    public AlumnoConPromedio[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(AlumnoConPromedio[] alumnos) {
        this.alumnos = alumnos;
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

    public NombreAsignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(NombreAsignatura asignatura) {
        this.asignatura = asignatura;
    }
    public String profetoXml(){
        String xml="<profesor>\n";
        xml+="<nombre>"+nombre+"</nombre>\n";
        xml+="<apellido>"+apellido+"</apellido>";
        xml+="<run>"+run+"</run>\n";
        xml+="<asignatura>"+asignatura+"</asignatura>\n";
        xml+="<alumnos>\n";
        for (int i = 0; i < alumnos.length; i++) {
            xml+=alumnos[i].alumnoToXml();
        }
        xml+="</alumnos>\n";
        xml+="</profesor>\n";
        return xml;
    }
}
