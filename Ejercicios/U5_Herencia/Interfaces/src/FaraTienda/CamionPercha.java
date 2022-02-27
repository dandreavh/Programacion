package FaraTienda;

import java.util.Arrays;

public class CamionPercha extends Vehiculo {

    private Caja[] cajas;
    private Integer cantCajas = 0;

    public CamionPercha(String matricula, Double cargaMaxima, Conductor conductor) {
        super(matricula, cargaMaxima, conductor);
        cajas = new Caja[0];
        cantCajas++;
    }

    public Caja[] getCajas() {
        return cajas;
    }
    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }
    public Integer getCantCajas() {
        return cantCajas;
    }
    public void setCantCajas(Integer cantCajas) {
        this.cantCajas = cantCajas;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + getCantCajas() + " cajas, que contienen ");
    }


    @Override
    public String toString() {
        return "CamionPercha{" +
                "cajas=" + Arrays.toString(cajas) +
                ", cantCajas=" + cantCajas +
                '}';
    }
}
