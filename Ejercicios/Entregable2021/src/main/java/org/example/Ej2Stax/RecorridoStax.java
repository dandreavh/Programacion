package org.example.Ej2Stax;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RecorridoStax {
    /*
    Muestre por pantalla los datos del libro con menos páginas.
    Que muestre por pantalla el número de libros de un autor determinado que sesolicitará al usuario.
     */
    public static void main(String[] args) {
        XMLInputFactory xif = XMLInputFactory.newInstance();
        try {
            XMLEventReader xer = xif.createXMLEventReader(new FileReader("biblioteca.xml"));
            while (xer.hasNext()){
                XMLEvent xe = xer.nextEvent();
                if(xe.isStartElement()){
                    StartElement se = xe.asStartElement();
                    if(se.getName().getLocalPart().equalsIgnoreCase("libro")){
                        System.out.println("es un libro");
                    }
                }
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
