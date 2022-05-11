package EjemplosClase.Ejemplo4;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentTag = "";
        Integer currentQuantity = 0;
        Integer currentPrice = 0;
        Integer total = 0;
        String currentProductName = "";
        Integer counter = 0;

        System.out.println("Indique el nombre del producto");
        currentProductName = sc.nextLine();


        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("pedidos.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if(xmlEvent.isStartElement()){
                    StartElement start = xmlEvent.asStartElement();
                    currentTag = start.getName().getLocalPart();

                } else if (xmlEvent.isCharacters()){
                    Characters content = xmlEvent.asCharacters();
                    if(currentTag.equalsIgnoreCase("precio") && !content.getData().contains("\n")){
                        currentPrice = Integer.parseInt(content.getData());

                    } else if(currentTag.equalsIgnoreCase("cantidad") && !content.getData().contains("\n")){
                        currentQuantity = Integer.parseInt(content.getData());

                        total += currentPrice*currentQuantity;
                        currentTag = "";
                    } else if(currentTag.equalsIgnoreCase("nombreProducto") && !content.getData().contains("\n")){;
                        if(content.getData().equalsIgnoreCase(currentProductName)){
                            counter++;
                        }
                    }
                }
            }

        } catch (XMLStreamException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El total es " + total);
        System.out.println("El producto " +currentProductName + " está en " + counter + " pedidos");
    }
}
