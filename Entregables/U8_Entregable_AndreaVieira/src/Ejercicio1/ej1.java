package Ejercicio1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ej1 {
    /*
    Crea un ArrayList de Alumnos con los datos del ficheros XML
    Utilizando la estructura correcta muestra todos los DNIS ordenados.
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();s
        String dni = "";
        String nombre = "";
        String apellido = "";
        String direccion = "";

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("alumnos.xml"));

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength(); i++) {
                if(nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nl.item(i);
                    NodeList nl2 = nl.item(i).getChildNodes();
                        for (int j = 0; j < nl2.getLength(); j++) {
                            if(e.getChildNodes().item(i).getNodeName().equalsIgnoreCase("nombre")){
                                nombre = nl2.item(j).getTextContent();
                            } else if (e.getTagName().equalsIgnoreCase("apellido")) {
                                apellido = nl2.item(j).getTextContent();
                            } else if (e.getTagName().equalsIgnoreCase("direccion")) {
                                direccion = nl2.item(j).getTextContent();
                            } else if (e.hasAttribute("dni")) {
                                dni = nl2.item(j).getTextContent();
                            }
                        }
                        alumnos.add(new Alumno(dni, nombre, apellido, direccion));

                }
            }
            System.out.println(alumnos);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
