package Act1.Tarea1;

public class MainHora {
    public static void main(String[] args) {
        Hora hora0 = new Hora(25, 65);
        Hora hora1 = new Hora(12, 25);
        System.out.println(hora0);
        System.out.println(hora1);

        Hora hora2 = new Hora(12, 41);
        Hora hora3 = new Hora(2, 59);
        Hora hora4 = new Hora(23, 59);
        System.out.println(hora2);
        System.out.println(hora3);
        System.out.println(hora4);
        hora2.inc();
        hora3.inc();
        hora4.inc();
        System.out.println(hora2);
        System.out.println(hora3);
        System.out.println(hora4);
        hora2.setHora(0);
        System.out.println(hora2);

    }
}
