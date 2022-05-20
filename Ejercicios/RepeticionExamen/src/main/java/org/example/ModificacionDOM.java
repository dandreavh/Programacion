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
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("restaurante.xml"));
            Element root = doc.getDocumentElement(); // solo para transformer y añadir

            Element plato = doc.createElement("plato");
            plato.setAttribute("calorias", "500");

            Element nombreTag = doc.createElement("nombre");
            Element precioTag = doc.createElement("precio");

            nombreTag.setTextContent("salmorejo");
            precioTag.setTextContent("3.60");

            plato.appendChild(nombreTag);
            plato.appendChild(precioTag);

            root.appendChild(plato);

            NodeList nl = doc.getElementsByTagName("plato");

            for (int i = 0; i < nl.getLength(); i++) {
                Element disponible = doc.createElement("disponible");
                disponible.setTextContent("sí");
                nl.item(i).appendChild(disponible);
            }


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            /*
            MUY IMPORTANTE
             */
            DOMSource origen = new DOMSource(root);
            File examen2 = new File("examen2.xml");
            StreamResult destino = new StreamResult(examen2);
            transformer.transform(origen,destino);

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
