package Ejercicio3;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    /*

    Muestre por pantalla la cantidad de alumnos del fichero.
    Que muestre por pantalla la cantidad de alumnos que viven en una dirección determinada que se solicitará al usuario.

     */
    public static void main(String[] args) {
        int cantidadAlumnos = 0;
        int cantidadResidentesEnX = 0;
        Scanner sc = new Scanner(System.in);
        String miDir;
        String tagActual = "";

        System.out.println("Indique la dirección");
        miDir = sc.nextLine();

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("alumnos.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();
                    tagActual = startTag.getName().getLocalPart();

                    String tagName = startTag.getName().getLocalPart();
                    if(tagName.equalsIgnoreCase("alumno")){
                        cantidadAlumnos++;
                    }

                }  else if (xmlEvent.isCharacters()) {
                    Characters dir = xmlEvent.asCharacters();
                    if (tagActual.equalsIgnoreCase("direccion")){
                        if (dir.getData().equalsIgnoreCase(miDir)) {
                            cantidadResidentesEnX++;
                        }
                    }
                }
            }

            System.out.println("Hay " + cantidadAlumnos + " alumnos");
            System.out.println(cantidadResidentesEnX + " alumnos viven en " + miDir);

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
