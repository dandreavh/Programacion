package org.example;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
    /*
    Utilizando el parserStax crear una clase llamada RecorridoStax que:
    Muestre por pantalla la media de las edades del fichero.

     */
    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        int sumaEdades = 0;
        int cantidadEdades = 0;
        double mediaEdades;
        try {
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("empleados.xml"));
            while (xmlReader.hasNext()){
                XMLEvent evento = xmlReader.nextEvent();
                if (evento.isStartElement()){
                    StartElement start = evento.asStartElement();
                    if(start.getName().getLocalPart().equals("empleado")){
                        Attribute edad = start.getAttributeByName(new QName("edad"));
                        sumaEdades += Integer.parseInt(edad.getValue());
                        cantidadEdades++;
                    }
                }
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        mediaEdades = sumaEdades/cantidadEdades;
        System.out.printf("La edad media de los empleados es de " + mediaEdades + " años");
    }
}
