package EjemplosClase.Ejemplo2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("ejemplo2.xml"));
            Element root = doc.getDocumentElement(); // carga la etiqueta

            // nº nodo de todoo el documento
            int numNodos = doc.getChildNodes().getLength();
            System.out.println("nº nodos de todo el documento: " + numNodos);

            // nº nodo del elemento raíz
            numNodos = root.getChildNodes().getLength();
            System.out.println("nº nodos del elemento raíz: " + numNodos);

            // nombres completos
            NodeList nl = doc.getElementsByTagName("nombre");
            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println(nl.item(i).getTextContent());
                System.out.println("--------------------------");
            }

            // mostrar solo comentarios
            for (int i = 0; i < root.getChildNodes().getLength(); i++) {
                if(root.getChildNodes().item(i).getNodeType() == (Node.COMMENT_NODE)){
                    System.out.println(root.getChildNodes().item(i));
                    System.out.println(root.getChildNodes().item(i).getTextContent());
                }
            }

            // scar edad media
            NodeList edades = doc.getElementsByTagName("edad");
            int media = 0;
            for (int i = 0; i < edades.getLength(); i++) {
                media += Integer.parseInt(edades.item(i).getTextContent());
            }
            System.out.println("La media de las edades es " + (media / edades.getLength()));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
