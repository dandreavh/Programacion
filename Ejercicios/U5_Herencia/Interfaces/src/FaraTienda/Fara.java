package FaraTienda;

import java.util.Arrays;

public class Fara {
    private Vehiculo[] vehiculos;

    public Fara() {
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Fara{" +
                "vehiculos=" + Arrays.toString(vehiculos) +
                '}';
    }
}
