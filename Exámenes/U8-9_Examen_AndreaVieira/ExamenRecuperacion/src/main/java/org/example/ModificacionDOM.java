package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    /*
    Añada un nuevo nodo <sueldo>XXXXXX</sueldo> para cada uno del os empleados.
    Sustituir ese XXXX por un número aleatorio entre 1000 y 2000

    Escriba todoo al fichero resultado.xml
     */
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("empleados.xml"));
            Element root = doc.getDocumentElement();

            // AÑADIR NODO
            NodeList nl = doc.getElementsByTagName("empleado");

            for (int i = 0; i < nl.getLength(); i++) {
                int numRandom = (int)(Math.random() * (1000)+1000);
                Element sueldoTag = doc.createElement("sueldo");
                sueldoTag.setTextContent(Integer.toString(numRandom));
                nl.item(i).appendChild(sueldoTag);
            }

            // escribir en nuevo fichero

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            File archivo = new File("resultado.xml");
            StreamResult destino = new StreamResult(archivo);
            transformer.transform(origen, destino);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
