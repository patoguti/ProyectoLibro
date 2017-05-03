package colegio;

/**
 * Clase que representa a un profesor del Colegio
 * @author toupa
 */
public class Profesor {

	private String nombre; //nombre del profesor
	private String apellido; //apellido del profesor
	private String run; //run del profesor
        /**
         * Constructor de la clase profesor
         * @param nombre Nombre del profesor
         * @param apellido Apellido del profesor
         * @param run Run del profesor
         */
    public Profesor(String nombre, String apellido, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
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
    
    public String toXML(){
		String xml = "\n<profesor>\n";
		xml += "\t<rut>"+this.run+"</rut>\n";
		xml += "\t<nombre>"+this.nombre+"</nombre>\n";
		xml += "\t<apellido>"+this.apellido+"</apellido>\n";
		xml += "</profesor>\n";
		return xml;
	}
}