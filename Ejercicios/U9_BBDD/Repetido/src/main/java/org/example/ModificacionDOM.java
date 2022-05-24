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
    Inserte un nuevo nodo en todos los platos indicando que el plato está disponible
    <disponible>si</disponible>
    Inserte un nuevo plato en el restaurante.
    Escriba todoo esto en un fichero llamado examen2.xml
     */
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("restaurante.xml"));
            Element root = doc.getDocumentElement();

            // parte 1 crear nuevo plato
            Element platoTag = doc.createElement("plato");
            platoTag.setAttribute("calorias", "800");

            Element nombreTag = doc.createElement("nombre");
            Element precioTag = doc.createElement("precio");

            nombreTag.setTextContent("Croquetas de puchero");
            precioTag.setTextContent("3.00");


            platoTag.appendChild(nombreTag);
            platoTag.appendChild(precioTag);

            root.appendChild(platoTag);


            // parte 2 insertar nodo
            NodeList nl = doc.getElementsByTagName("plato");

            for (int i = 0; i < nl.getLength(); i++) {
                Element disponibleTag =  doc.createElement("disponible");
                disponibleTag.setTextContent("sí");
                nl.item(i).appendChild(disponibleTag);
            }


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            File archivo = new File("examen2.xml");
            StreamResult destino = new StreamResult(archivo);
            transformer.transform(origen, destino);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
