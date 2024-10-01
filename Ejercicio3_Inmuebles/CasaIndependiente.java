package Ejercicio3_Inmuebles;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;

    public CasaIndependiente(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños,
            int numPisos) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños, numPisos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
 
}
