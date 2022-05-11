package EjemplosClase.Ejemplo3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona(1, "Ana", 28);
        Persona p2 = new Persona(2, "Luis", 30);
        Persona p3 = new Persona(3, "Paula", 32);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);


        try {

            //Obtenemos la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //No parseo ningún fichero XML existente, simplemente lo obtengo
            Document doc = db.newDocument();

            //Creo el elemento raíz ya que está vacío
            Element root = doc.createElement("personas");

            //Añado el elemento raíz
            doc.appendChild(root);


            //Procedo a crear la etiqueta que voy a almacenar el fichero
            // El número de horas será un atributo y el resto de lo atributos del objeto serán
            // etiquetas hijas
            Element persona = doc.createElement("persona");

            //Creo la etiqueta y les añado contenido

            for (Persona p: personas) {

                persona.appendChild((Node) p);
                Element id = doc.createElement("id");
                id.setTextContent(String.valueOf(p.getId()));

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(p.getNombre());

                Element edad = doc.createElement("edad");
                edad.setTextContent(String.valueOf(p.getEdad()));
            }

            //Añado esa nueva etiqueta al nodo raíz
            root.appendChild(persona);


            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TodoeL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
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
            File nuevoPersonas = new File("personasXML.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);


        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
