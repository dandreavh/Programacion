package CorreccionEntregable;

import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedades;

    public Registro() {
        this.propiedades = new Propiedad[0];
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }
    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    // MÉTODOS PROPIOS
    // AÑADIR PROPIEDAD al array
    public void addPropiedad(Propiedad propiedad) {
        propiedades = Arrays.copyOf(propiedades, propiedades.length + 1);
        propiedades[propiedades.length - 1] = propiedad;
    }
    // ELIMINAR PROPIEDAD del array
    public boolean eliminarPropiedad(Propiedad propiedad) {
        if (existePropiedad(propiedad)) { // verifico que exista
            Propiedad[] result = new Propiedad[0];
            for (int i = 0; i < propiedades.length; i++) {
                if (!propiedades[i].equals(propiedad)) { // añado todos los que no sean el que busco
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = propiedades[i];
                }
            }
            propiedades = result; // hago la asignación
            return true;
        }
        return false;
    }
    // para comprobar que existe
    private boolean existePropiedad(Propiedad propiedad) {
        for (Propiedad prop : propiedades) { // for each para recorrer el array de propiedades y busco si exite el que quiero
            if (prop.equals(propiedad)) {
                return true;
            }
        }
        return false;
    }
    // ORDENA POR DEFECTO las propiedades
    public void informeSuperficie() {
        Arrays.sort(propiedades);
        for (Propiedad propiedad : propiedades) { // for each para recorrer e imprimir línea a línea
            System.out.println(propiedad);
        }
    }
    // ORDENA POR LOS OTROS CRITERIOR las propiedades
    public void informeAntiguedad() {
        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                int result = p2.getYearConstruccion() - p1.getYearConstruccion();

                if (result == 0) {
                    result = p2.compareTo(p1);
                }
                return result;
            }
        });
        for (Propiedad propiedad : propiedades) {
            System.out.println(propiedad);
        }
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }
}
