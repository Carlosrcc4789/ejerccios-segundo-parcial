package Ejercicio3_Inmuebles;


public class ApartStudio extends Apartamento {
    protected static double valorArea = 1500000;

    public ApartStudio(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
        
}