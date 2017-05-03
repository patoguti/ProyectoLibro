package reportes;

import colegio.Apoderado;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que genera un reporte con los datos de los apoderados que poseen mas de
 * un pupilo matriculado en el colegio
 *
 * @author toupa
 */
public class GenerarApoderadoPupilos {

    ApoderadoPupilos[] apoderados; //apoderados de un colegio

    /**
     * Genera el poblamiento de apoderados
     *
     * @param apo Apoderados de un colegio
     */
    public GenerarApoderadoPupilos(Apoderado[] apo) {
        int apoderadoPupilos = 0;
        for (int i = 0; i < apo.length; i++) {
            if (apo[i].getPupilos().size() > 1) {
                apoderadoPupilos++;
            }
        }
        this.apoderados = new ApoderadoPupilos[apoderadoPupilos];
        apoderadoPupilos = 0;
        for (int i = 0; i < apo.length; i++) {
            if (apo[i].getPupilos().size() > 1) {
                this.apoderados[apoderadoPupilos] = new ApoderadoPupilos();
                this.apoderados[apoderadoPupilos].nombre = apo[i].getNombre();
                this.apoderados[apoderadoPupilos].apellido = apo[i].getApellido();
                this.apoderados[apoderadoPupilos++].run = apo[i].getRun();
            }
        }
    }

    public void apoderadoPupilosToJson() {
        BufferedWriter mbrWriter = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String archivo = gson.toJson(this.apoderados);
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Apoderados_con_pupilos/apoderadoPupilos.json"));
            mbrWriter.write(archivo);
            mbrWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(GenerarInforme.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                mbrWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(GenerarInforme.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void apoderadoPupilostoXml(){
        try {
            BufferedWriter mbrWriter = null;
            String xml="<?xml version='1.0'?>";
            xml+="<apoderados>\n";
            for (int i = 0; i < apoderados.length; i++) {
                xml+=apoderados[i].apoderadoToString();
            }
            xml+="</apoderados>";
            
            mbrWriter = new BufferedWriter(new FileWriter("Reportes/Apoderados_con_pupilos/apoderadoPupilos.xml"));
            mbrWriter.write(xml);
            mbrWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarApoderadoPupilos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
