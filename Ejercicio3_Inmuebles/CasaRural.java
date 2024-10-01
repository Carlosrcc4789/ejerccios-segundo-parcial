package Ejercicio3_Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;
    
    public CasaRural(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCabecera, int altitud) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    public String toString() {
        return super.toString() + "Distancia a la cabecera municipal: " + distanciaCabecera + "\nAltitud: " + altitud;
    }

    
    
}
