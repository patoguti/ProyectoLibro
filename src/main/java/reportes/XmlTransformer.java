package reportes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author toupa
 */
public class XmlTransformer {

    public XmlTransformer() {
    }
    
public void GenerarTransformacion(String salida,String xslt,String fuente) throws TransformerConfigurationException, FileNotFoundException, IOException, TransformerException {
        
        File outputFile = new File(salida);
        File xsltSource = new File(xslt);
        File xmlSource = new File(fuente);
        Source source = new StreamSource(new FileInputStream(xmlSource));
        Result result = new StreamResult(new FileOutputStream(outputFile));
        
        TransformerFactory cFactory = TransformerFactory.newInstance();
        Templates template=null;
        try {
            template = cFactory.newTemplates(new StreamSource(new FileInputStream(xsltSource)));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XmlTransformer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XmlTransformer.class.getName()).log(Level.SEVERE, null, ex);
        }
        Transformer xformer = template.newTransformer();
        
	
        xformer.transform(source, result);
    }
}
