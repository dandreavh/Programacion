package org.example;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

public class RecorridoStax {
    /*
    Muestre por pantalla los datos del plato con menos calorías.
    Que muestre por pantalla el número de platos de la carta.
     */
    public static void main(String[] args) {
        XMLInputFactory xif = XMLInputFactory.newInstance();
        int cantidadPlatos = 0;
        int menorCalorias = 0;

        try {
            XMLEventReader xmlEventReader = xif.createXMLEventReader(new FileInputStream("restaurante.xml"));
            ArrayList<String> calorias = new ArrayList<>();
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    if (startElement.getName().getLocalPart().equals("plato")) {
                        cantidadPlatos++;
                    }
                } else if (xmlEvent.isAttribute()) {
                    
                    Characters att = xmlEvent.asCharacters();
                    calorias.add(att.getData());
                }

            }
            
            calorias.sort(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return (s1.compareTo(s2));
                }
            });

            for (int i = 0; i < calorias.size()-1; i++) {
                menorCalorias = Integer.parseInt(calorias.get(0));
            }

            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("plato")) {
                        if(startElement.getAttributes().equals(menorCalorias)){
                            if(startElement.getName().getLocalPart().equals("nombre")){
                                Characters nombre = startElement.asCharacters();
                                System.out.println("Nombre del plato : " + nombre.getData());
                            } else if (startElement.getName().getLocalPart().equals("precio")) {
                                Characters precio = startElement.asCharacters();
                                System.out.println("Precio del plato : " + precio.getData());
                            }
                        }
                    }
                }
            }

            System.out.println("Esta carta tiene " + cantidadPlatos + " platos");

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}