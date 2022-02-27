package Act1.Tarea1;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        if(hora<0 || hora>23){
            this.hora = 0;
        } else{
            this.hora = hora;
        }
        if (minuto<0 || minuto>59){
            this.minuto = 0;
        } else{
            this.minuto = minuto;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        if(hora<0 || hora>23){
            this.hora = 0;
        } else{
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
        if (minuto<0 || minuto>59){
            this.minuto = 0;
        } else{
            this.minuto = minuto;
        }
    }

    public void inc(){
        // añade 1 min

        if (minuto<=59){
            this.minuto = minuto+1;
          if(minuto>59){
              this.minuto = 0;
              this.hora++;
              if (hora>23){
                  this.hora = 0;
              }
          }

        }
    }

    @Override
    public String toString() {
        return "Hora: " +
                hora +
                ":" + minuto;
    }
}
