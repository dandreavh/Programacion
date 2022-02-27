package FaraTienda;

import java.util.Arrays;
import java.util.Objects;

public class Caja {
    private Prenda[] prendas;
    private static int cantPrendas = 0;
    private String id;

    public Caja(String id) {
        this.id = id;
        prendas = new Prenda[0];
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Prenda[] getPrendas() {
        return prendas;
    }
    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }
    public static int getCantPrendas() {
        return cantPrendas;
    }
    public static void setCantPrendas(int cantPrendas) {
        Caja.cantPrendas = cantPrendas;
    }

    public boolean addPrenda(Prenda prenda){
        if(prendas.length<5){
            prendas = Arrays.copyOf(prendas, prendas.length+1);
            prendas[prendas.length-1] = prenda;
            return true;
        }
        return false;
    }

    public boolean deletePrenda(Prenda prenda){
        Prenda[] result = new Prenda[0];
        for (int i = 0; i < prendas.length; i++) {
            if(!prendas[i].equals(prenda)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = prendas[i];
                return true;
            }
        }
        prendas = result;
        return false;
    }


    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caja caja = (Caja) o;
        return id.equals(caja.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
