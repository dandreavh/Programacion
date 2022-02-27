package FaraTienda;

import java.util.Arrays;

public class CamionCaja extends Vehiculo{

    private Caja[] caja;

    public CamionCaja(String matricula, Double cargaMaxima, Conductor conductor) {
        super(matricula, cargaMaxima, conductor);
        caja = new Caja[0];
    }

    public Caja[] getCaja() {
        return caja;
    }
    public void setCaja(Caja[] caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "CamionCaja{" +
                "caja=" + Arrays.toString(caja) +
                '}';
    }
}
