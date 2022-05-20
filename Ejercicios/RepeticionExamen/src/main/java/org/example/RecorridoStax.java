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
    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        ArrayList<Plato> platos = new ArrayList<>();
        int cantidadPlatos;

        try {
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("restaurante.xml"));
            cantidadPlatos = 0;
            Plato p = null;
            String tagActual = "";

            while (xmlReader.hasNext()){
                XMLEvent evento = xmlReader.nextEvent(); // guardo el evento

                if(evento.isStartElement()){ // miro si el evento es el inicio
                    StartElement start = evento.asStartElement(); // creo el elemento de inicio
                    switch (start.getName().getLocalPart()){ // evalúo el nombre de la etiqueta
                        case "plato":
                            cantidadPlatos++; // cuando encuentre, cuento
                            p = new Plato(); // creo un objeto
                            Attribute a = start.getAttributeByName(new QName("calorias")); // aprovecho y saco el atributo
                            p.setCalorias(a.getValue()); // actualizo el valor
                            break;
                        case "nombre":
                            tagActual = "nombre"; // actualizo el nombre de la etiqueta
                            break;
                        case "precio":
                            tagActual = "precio"; // actualizo el nombre de la etiqueta
                            break;
                    }

                } else if (evento.isCharacters()) {  // busco el texto - el contenido
                    Characters c = evento.asCharacters(); // creo el objeto texto
                    switch (tagActual){ // evalúo la etiqueta en la que estoy
                        case "nombre":
                            p.setNombre(c.getData()); // actualizo el valor del nombre con el texto
                            break;
                        case "precio":
                            p.setPrecio(c.getData()); // actualizo el valor del precio con el texto
                            break;
                    }
                } else if (evento.isEndElement()) { // miro si es el final
                    EndElement end = evento.asEndElement(); // creo el elemento fin
                    tagActual = "";
                    if(end.getName().getLocalPart().equals("plato")){ // evalúo si ese elemento fin es el de plato (ya he terminado con todoo el plato)
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

        Collections.sort(platos, new Comparator<Plato>() {
            @Override
            public int compare(Plato p1, Plato p2) {
                return p1.getCalorias().compareTo(p2.getCalorias());
            }
        });

        System.out.println(platos);

        System.out.println("El plato con menos calorias es " + platos.get(0));
        System.out.println("Hay " + cantidadPlatos + " platos en el restaurante");
    }
}
