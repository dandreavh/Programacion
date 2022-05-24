package org.example;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecorridoStax {
    /*
    Muestre por pantalla los datos del plato con menos calorías.
    Que muestre por pantalla el número de platos de la carta.
     */
    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        ArrayList<Plato> platos = new ArrayList<>();
        Plato p = null;
        int cantidadPlatos = 0;
        String tagActual = "";

        try {
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("restaurante.xml"));

            while (xmlReader.hasNext()){
                XMLEvent evento = xmlReader.nextEvent();

                if (evento.isStartElement()){
                    StartElement start = evento.asStartElement();
                    switch (start.getName().getLocalPart()){
                        case "plato":
                            p = new Plato();
                            cantidadPlatos++;

                            Attribute a = start.getAttributeByName(new QName("calorias"));
                            p.setCalorias(a.getValue());
                            break;
                        case "nombre":
                            tagActual = "nombre";
                            break;
                        case "precio":
                            tagActual = "precio";
                            break;
                    }

                } else if (evento.isCharacters()) {
                    Characters contenido = evento.asCharacters();
                    switch (tagActual){
                        case "nombre":
                            p.setNombre(contenido.getData());
                            break;
                        case "precio":
                            p.setPrecio(contenido.getData());
                    }

                } else if (evento.isEndElement()) {
                    EndElement end = evento.asEndElement();
                    tagActual = "";
                    if(end.getName().getLocalPart().equals("plato")){
                        platos.add(p);
                    }
                }
            }

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(platos);

        System.out.println("Hay " + cantidadPlatos + " platos");

        Collections.sort(platos, new Comparator<Plato>() {
            @Override
            public int compare(Plato p1, Plato p2) {
                return p1.getCalorias().compareTo(p2.getCalorias());
            }
        });

        System.out.println("El plato con menos calorias es el " + platos.get(0));

    }
}
