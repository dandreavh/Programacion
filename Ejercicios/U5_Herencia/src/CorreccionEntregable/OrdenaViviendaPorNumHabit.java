package CorreccionEntregable;

import java.util.Comparator;

public class OrdenaViviendaPorNumHabit implements Comparator<Vivienda> {
    // preguntar !!
    @Override
    public int compare(Vivienda v1, Vivienda v2) {
        return v1.getNumHabitaciones() - v2.getNumHabitaciones();
    }
}