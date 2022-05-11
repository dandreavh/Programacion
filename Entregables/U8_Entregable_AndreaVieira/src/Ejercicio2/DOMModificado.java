package Ejercicio2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOMModificado {
    public static void main(String[] args) {
        /*
    Añada a todos los alumnos un nuevo nodo <instituto>IES ALIXAR</instituto>
    Que añada un nuevo alumno con los siguientes datos como primer alumno:
    Nombre:Luis Apellidos:Ruiz DNI:8888888X direccion: Allí y por supuesto la nueva etiqueta <instituto>IES ALIXAR</instituto>
    Que escriba todos al fichero alumnos_modificado.xml
         */
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("alumnos.xml"));

            NodeList nl = doc.getElementsByTagName("alumno");

            Text saltoLinea = doc.createTextNode("\n");

            Node root = doc.getDocumentElement();

            Element alumno = doc.createElement("alumno");
            alumno.setAttribute("dni","8888888X");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Ruiz");

            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Allí");

            alumno.appendChild(saltoLinea);
            alumno.appendChild(nombre);

            alumno.appendChild(saltoLinea);
            alumno.appendChild(apellido);

            alumno.appendChild(saltoLinea);
            alumno.appendChild(direccion);

            alumno.appendChild(saltoLinea);

            root.appendChild(alumno);

            for (int i = 0; i < nl.getLength(); i++) {
                Element instituto = doc.createElement("instituto");
                instituto.setTextContent("IES ALIXAR");
                nl.item(i).appendChild(instituto);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            //Podéis ver toda la lista de propiedes aquí
            // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevoPersonas = new File("alumnosModificado.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);


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
