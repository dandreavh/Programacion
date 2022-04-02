package MapsActividad1;

import java.util.HashMap;

/*
Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
La clave ha de calcularse mediante un método que reciba un String que represente el dni,
y devuelva la suma de sus dígitos.
46221877D -> 4+6+2+2+1+8+7+7=37
Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.
 */
public class main {
    public static void main(String[] args) {
        HashMap<Integer,String> myMap = new HashMap<>();

        String nombre1 = "Claudia";
        String dni1 = "46221877D";

        myMap.put(calculaKey(dni1),nombre1);

        System.out.println(myMap);

    }
    public static Integer calculaKey(String dni){
        Integer result = 0;
        for (int i = 0; i < dni.length()-1; i++) {
            result += Character.getNumericValue(dni.charAt(i));
            // Otra forma:
            // result += Integer.parseInt(""+dni.charAt(i); -- concadeno una cadena con el caracter
        }
        return result;
    }
}
