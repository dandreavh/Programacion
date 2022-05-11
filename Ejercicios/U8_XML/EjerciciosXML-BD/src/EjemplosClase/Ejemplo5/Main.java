package EjemplosClase.Ejemplo5;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // creo la lista que voy a recorrer
        ArrayList<Modulo> modulos = new ArrayList<>();

        // creo los elementos que voy a añadir
        Modulo m1 = new Modulo("1", "LM", "4");
        Modulo m2 = new Modulo("2", "PG", "8");
        Modulo m3 = new Modulo("3", "BD", "6");
        Modulo m4 = new Modulo("4", "SI", "6");
        Modulo m5 = new Modulo("5", "FOL", "3");
        Modulo m6 = new Modulo("6", "ED", "3");

        // añado los objetos en el arraylist
        modulos.add(m1);
        modulos.add(m2);
        modulos.add(m3);
        modulos.add(m4);
        modulos.add(m5);
        modulos.add(m6);

        try {
            // creo el objeto donde escribir
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("ciclo.xml"));

            // creo lo que me sirve para crear eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            // creo el principio del documento
            StartDocument sd = eventFactory.createStartDocument();
            xmlWriter.add(sd);

            //Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
            //Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoTabulado = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            //Creo el evento necesario para crear la etiqueta raíz pedidos
            StartElement cicloStartElement = eventFactory.createStartElement("","","ciclos");
            xmlWriter.add(cicloStartElement);
            xmlWriter.add(saltoTabulado);

            //xmlWriter.add();


        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
