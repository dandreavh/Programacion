package Examen1920Morning;

public class Main {
    public static void main(String[] args) {
        Concurso concurso = new Concurso("La Feria", "Sevilla");
        Propietario p1 = new Propietario("Andrea", "Hernández", 11111, "Venezuela");
        Propietario p2 = new Propietario("Ana", "Ruiz", 222222, "Portugal");
        Propietario p3 = new Propietario("David", "González", 333333, "España");
        Propietario p4 = new Propietario("Pablo", "López", 44444, "Cuba");

        Perro dog1 = new Perro("Lobo", 9, 50.00, "si", p1, "Pastor Alemán");
        Perro dog2 = new Perro("Luna", 4, 25.00, "si", p2, "Labrador");
        Perro dog3 = new Perro("Dana", 1, 15.00, "si", p1, "San Bernardo");
        Perro dog4 = new Perro("Kaiser", 5, 60.00, "si", p4, "San Bernardo");
        Perro dog5 = new Perro("Niebla", 7, 65.00, "si", p4, "San Bernardo");
        Perro dog6 = new Perro("Mufasa", 6, 30.00, "si", p1, "Golden Retriever");

        concurso.cargarPerros();

        concurso.addDog("Pastor Alemán", dog1);
        concurso.addDog("Pastor Alemán", dog2);
        concurso.addDog("Labrador", dog2);
        concurso.addDog("San Bernardo", dog3);
        concurso.addDog("San Bernardo", dog4);
        concurso.addDog("Golden Retriever", dog6);
        concurso.addDog("San Bernardo", dog5);

        concurso.ownerDogs(11111);

        concurso.perrosporEdad("San Bernardo");
        concurso.perrosporPeso("San Bernardo");

        concurso.disqualifyDog(dog3);

        concurso.guardarPerros();
    }
}
