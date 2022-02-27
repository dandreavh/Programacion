package FaraTienda;

public class MainFara {
    public static void main(String[] args) {


        Fara tienda = new Fara();

        Conductor conduct1 = new Conductor("Pedro", "Picapiedras", "123456-A");

        CamionPercha cp1 = new CamionPercha("111111A", 250.00, conduct1);
        PrendaColgada pc1 = new PrendaColgada(25.50, "Camiseta", "111111a", 1.75, 1.00);
        PrendaColgada pc2 = new PrendaColgada(56.80, "Abrigo", "222222b", 4.56, 2.00);
        PrendaColgada pc3 = new PrendaColgada(25.50, "Pantalón", "3333333c", 1.75, 1.00);
        PrendaColgada pc4 = new PrendaColgada(56.80, "Jersey", "4444444d", 4.56, 2.00);
        PrendaColgada pc5 = new PrendaColgada(25.50, "Sudadera", "5555555e", 1.75, 1.00);
        PrendaColgada pc6 = new PrendaColgada(56.80, "Chaqueta", "6666666f", 4.56, 2.00);



        System.out.println(cp1);

        System.out.println(cp1);



    }
}
