package MapsActividad4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Traductor {
    private Map<String, String> diccionario;

    public Traductor(String fileName) {
        this.diccionario = new TreeMap<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line = in.readLine();
            while (line!=null){
                String[] words = line.split(",");
                diccionario.put(words[0],words[1]);
                line= in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException ioe){
            ioe.getMessage();
        }
    }

    public Map<String, String> getDiccionario() {
        return diccionario;
    }
}
