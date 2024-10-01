package Ejercicio3_Inmuebles;

public class Casa extends InmuebleVivienda{
    protected int numPisos;

    public Casa(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de Pisos: " + numPisos;
    }
    
}
