import java.io.*;
import java.util.*;

public class Sae implements Serializable {
    private Map<Integer, Oferta> ofertas;

    public Sae() {
        ofertas = new HashMap<>();
    }

    public Map<Integer, Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(Map<Integer, Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sae sae = (Sae) o;
        return ofertas.equals(sae.ofertas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ofertas);
    }

    @Override
    public String toString() {
        return "Sae{" +
                "ofertas=" + ofertas +
                '}' + "\n";
    }

    // MÉTODOS PROPIOS

    public boolean addOferta(Oferta o){
        if(!ofertas.containsKey(o.getCodigo())){
            ofertas.put(o.getCodigo(), o);
            return true;
        } else{
            System.out.println("Ya existe una oferta con ese código");
            return false;
        }
    }

    public boolean addTrabajador(Integer codigo, Trabajador t){
        if(!ofertas.containsKey(codigo)){
            System.out.println("No hay ninguna oferta con ese código, créela primero");
            return false;
        } else{
            if(ofertas.get(codigo).isCubierta()){
                System.out.println("Esta oferta no admite más trabajadores");
                return false;
            } else{
                ofertas.get(codigo).getTrabajadores().add(t);
                return true;
            }
        }
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t){
        if(ofertas.containsKey(codigo)){
            ofertas.get(codigo).getTrabajadores().remove(t);
            return true;
        } else{
            return false;
        }
    }

    public void mostrarTrabajadores(Integer codigo){
        if(ofertas.containsKey(codigo)){
            System.out.println("Mostrando trabajadores...");
            System.out.println(ofertas.get(codigo).getTrabajadores());
        } else{
            System.out.println("Código erróneo");
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo){
        ArrayList<Trabajador> lista = new ArrayList<>(ofertas.get(codigo).getTrabajadores());

        Collections.sort(lista, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador t1, Trabajador t2) {
                return t1.getEdad().compareTo(t2.getEdad());
            }
        });

        System.out.println("Mostrando trabajadores por edad...");
        System.out.println(lista);
    }

    public int cantidadOfertas(String dni){
        int contador = 0;
        Iterator it = ofertas.values().iterator();
        while (it.hasNext()){
            Oferta o = (Oferta) it.next();

            for (Trabajador t: o.getTrabajadores()) {
                if(t.getDni().equalsIgnoreCase(dni)){
                    contador++;
                }
            }
        }
        return contador;
    }

    public void mostrarOfertas(){
        ArrayList<Oferta> lista = new ArrayList<>(ofertas.values());

        Collections.sort(lista, new Comparator<Oferta>() {
            @Override
            public int compare(Oferta o1, Oferta o2) {
                return o2.getTrabajadores().size()-o1.getTrabajadores().size();
            }
        });

        System.out.println("Mostrando todas las ofertas...");
        System.out.println(lista);
    }

    public void guardarDatos(){
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("sae.dat"));

            for (Oferta o: ofertas.values()){
                out.writeObject(o);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public void cargarDatos(){
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("sae.dat"));
            while (true){
                Oferta o = (Oferta) in.readObject();

                ofertas.put(o.getCodigo(),o);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
