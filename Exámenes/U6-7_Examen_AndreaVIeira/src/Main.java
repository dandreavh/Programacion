import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Sae sae = new Sae();

        Trabajador t1 = new Trabajador("111111A", "Ana", "López", 35, "Graduada universitaria");
        Trabajador t2 = new Trabajador("222222B", "Pepe", "Martín", 25, "Técnico superior");
        Trabajador t3 = new Trabajador("333333C", "Luis", "Castro", 45, "Técnico superior");
        Trabajador t4 = new Trabajador("444444D", "Rosa", "Martínez", 32, "Técnico superior");
        Trabajador t5 = new Trabajador("555555E", "Lola", "Flores", 52, "Graduada universitaria");
        Trabajador t6 = new Trabajador("666666F", "Samuel", "Hernández", 60, "Graduada universitaria");
        Trabajador t7 = new Trabajador("777777G", "Marcos", "Pérez", 34, "Técnico medio");
        Trabajador t8 = new Trabajador("888888H", "Víctoria", "Polo", 27, "Graduada universitaria");
        Trabajador t9 = new Trabajador("999999I", "Ariadna", "Ruiz", 41, "Técnico medio");
        Trabajador t10 = new Trabajador("101010J", "Unai", "Sánchez", 28, "Técnico medio");

        Oferta o1 = new Oferta(1, "Sanitarios",false);
        Oferta o2 = new Oferta(2, "Profesores", false);
        Oferta o3 = new Oferta(3, "Aparejadores", false);
        Oferta o4 = new Oferta(4, "Telefonistas", false);
        Oferta o5 = new Oferta(5, "Correos", false);

        sae.cargarDatos();

        sae.addOferta(o1);
        sae.addOferta(o2);
        sae.addOferta(o3);
        sae.addOferta(o4);
        sae.addOferta(o5);

        sae.addTrabajador(1,t1); // repe
        sae.addTrabajador(1,t2);
        sae.addTrabajador(1,t3);
        System.out.println(o1);

        sae.removeTrabajador(1, t3);
        System.out.println(o1);

        sae.addTrabajador(2,t1); // repe
        sae.addTrabajador(2,t4);
        sae.addTrabajador(2,t5);
        sae.addTrabajador(2,t6);
        sae.addTrabajador(2,t7);
        sae.addTrabajador(2,t8);
        System.out.println(o2);

        sae.addTrabajador(5,t10);
        sae.addTrabajador(5,t9);
        sae.addTrabajador(5,t1); // repe
        o5.setCubierta(false); // ya no va a permitir añadir otro
        sae.addTrabajador(5,t8);
        System.out.println(o5);

        sae.mostrarTrabajadores(1);

        sae.mostrarTrabajadoresXEdad(1);

        System.out.println("Nº de ofertas inscritas por el trabajador: " + sae.cantidadOfertas(t1.getDni()));
        System.out.println("Nº de ofertas inscritas por el trabajador: " + sae.cantidadOfertas(t2.getDni()));

        sae.mostrarOfertas();

        sae.guardarDatos();

    }
}