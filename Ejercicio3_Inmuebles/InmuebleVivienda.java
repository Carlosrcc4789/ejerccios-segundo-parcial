package Ejercicio3_Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numHabitaciones;
    protected int numBaños;
    
    public InmuebleVivienda(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmueble, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de habitaciones: " + numHabitaciones + "\nNumero de baños: " + numBaños;
    }
}
