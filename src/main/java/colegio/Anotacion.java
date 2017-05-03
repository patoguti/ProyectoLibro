package colegio;

import enumLibro.TipoAnotacion;

/**
 * Clase que representa una anotacion
 *
 * @author toupa
 */
public class Anotacion {

    private TipoAnotacion tipo; //tipo, ya sea positiva o negativa
    private String motivo; //motivo de la anotacion

    /**
     * Constructor de la clase Anotacion
     *
     * @param positiva Tipo de anotacion
     * @param motivo Motivo de la anotacion
     */
    public Anotacion(TipoAnotacion positiva, String motivo) {
        this.tipo = positiva;
        this.motivo = motivo;
    }

    public TipoAnotacion isPositiva() {
        return tipo;
    }

    public void setPositiva(TipoAnotacion positiva) {
        this.tipo = positiva;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String toXML() {
        String xml = "\n<anotacion>\n";
        xml += "\t<tipo>" + this.tipo + "</tipo>\n";
        xml += "\t<motivo>" + this.motivo + "</motivo>\n";
        xml += "</anotacion>\n";
        return xml;
    }
}
