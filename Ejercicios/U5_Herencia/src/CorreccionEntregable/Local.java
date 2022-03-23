package CorreccionEntregable;

public abstract class Local extends Propiedad implements Vender {
    private Persona propietario;
    private double precio;

    public Local(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietario, double precio) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.propietario = propietario;
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "propietario=" + propietario +
                ", precio=" + precio +
                "} " + super.toString(); // para añadir la información de propiedad
    }
}