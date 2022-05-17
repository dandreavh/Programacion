package org.example;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    /*
    Inserte un nuevo nodo en todos los platos indicando que el plato está disponible <disponible>si</disponible>
    Inserte un nuevo plato en el restaurante.
    Escriba todoo esto en un fichero llamado examen2.xml
     */
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("restaurante.xml"));

            Element disponibleTag = document.createElement("disponible");
            disponibleTag.setTextContent("sí");

            NodeList nl = document.getElementsByTagName("plato");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);
                nodo.appendChild(disponibleTag);
            }

            Element plato = document.createElement("plato");
            Element nombreTag = document.createElement("nombre");
            nombreTag.setTextContent("Salmorejo");
            Element precioTag = document.createElement("precio");
            precioTag.setTextContent("6.00");

            plato.setAttribute("calorias", "200");
            plato.appendChild(nombreTag);
            plato.appendChild(precioTag);

            document.appendChild(plato);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        }

    }
}


