package FaraTienda;

public class PrendaColgada extends Prenda{

    private Double alturaPercha;
    private static Integer cantPrendasColgadas = 0;

    public PrendaColgada(Double precio, String nombre, String codBarras, Double peso, Double alturaPercha) {
        super(precio, nombre, codBarras, peso);
        this.alturaPercha = alturaPercha;
        cantPrendasColgadas++;
    }

    public Double getAlturaPercha() {
        return alturaPercha;
    }
    public void setAlturaPercha(Double alturaPercha) {
        this.alturaPercha = alturaPercha;
    }
    public static Integer getCantPrendasColgadas() {
        return cantPrendasColgadas;
    }
    public static void setCantPrendasColgadas(Integer cantPrendasColgadas) {
        PrendaColgada.cantPrendasColgadas = cantPrendasColgadas;
    }

    @Override
    public String toString() {
        return (super.toString()+ ", altura percha= " + alturaPercha + "\n");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
