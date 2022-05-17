package org.example.Ej1ModificandoDOM;

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
import java.util.Scanner;

public class ModificacionDOM {
    /*
    Añada un nuevo libro a la biblioteca solicitando los datos al usuario.
    Inserte un nuevo nodo dentro cada autor que indique el país de origen del autor
     */
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("biblioteca.xml"));
            Element root = doc.getDocumentElement();

            Scanner sc = new Scanner(System.in);
            String titulo, autor, editorial, paginas;

            System.out.println("Indique el título");
            titulo = sc.nextLine();
            System.out.println("Indique el autor");
            autor = sc.nextLine();
            System.out.println("Indique la editorial");
            editorial = sc.nextLine();
            System.out.println("Indique las páginas");
            paginas = sc.nextLine();

            Element libro = doc.createElement("libro");
            Element tituloTag = doc.createElement("titulo");
            Element autorTag = doc.createElement("autor");
            Element editorialTag = doc.createElement("editorial");
            Element paginasTag = doc.createElement("paginas");

            tituloTag.setTextContent(titulo);
            autorTag.setTextContent(autor);
            editorialTag.setTextContent(editorial);
            paginasTag.setTextContent(paginas);

            libro.appendChild(tituloTag);
            libro.appendChild(autorTag);
            libro.appendChild(editorialTag);
            libro.appendChild(paginasTag);

            root.appendChild(libro);

            NodeList nl = doc.getElementsByTagName("libro");

            for (int i = 0; i < nl.getLength(); i++) {
                Element elem = (Element) nl.item(i);

                Element paisAutorTag = doc.createElement("paisAutor");
                paisAutorTag.setTextContent("España");

                elem.appendChild(paisAutorTag);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            StreamResult destino = new StreamResult(new File("ejercicio1.xml"));

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
