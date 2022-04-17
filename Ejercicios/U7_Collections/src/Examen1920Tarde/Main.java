package Examen1920Tarde;

public class Main {
    public static void main(String[] args) {
        Coronavirus cv = new Coronavirus();

        Medico m1 = new Medico("Andrea", "Hernández", 11111, "Virgen del Rocío");
        Medico m2 = new Medico("Andrés", "Fernández", 22222, "Virgen Macarena");
        Medico m3 = new Medico("Ana", "Arenas", 33333, "San Juan de Dios");

        Paciente p1 = new Paciente("Luna", 19, 78.50, "si", m1, 'A');
        Paciente p2 = new Paciente("Sol", 29, 68.50, "si", m1, 'O');
        Paciente p3 = new Paciente("Rosa", 69, 88.50, "si", m2, 'O');
        Paciente p4 = new Paciente("Luis", 79, 58.50, "si", m3, 'E');

        cv.cargarPacientes();

        cv.addPaciente('A',p1);
        cv.addPaciente('O',p2);
        cv.addPaciente('O',p3);
        cv.addPaciente('E',p4);
        cv.addPaciente('A',p4);

        System.out.println("Pacientes de " + m1.getNombre());
        cv.pacientesDeUnDoctor(11111);

        System.out.println("Ordenados por edad");
        cv.pacientesporEdad('O');

        System.out.println("Ordenados por peso");
        cv.pacientesporPeso('O');

        cv.darDeAltaPaciente(p2);

        cv.guardarPacientes();
    }
}
