package Ejercicio3_Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdmin;
    protected boolean tienePiscina;
    protected boolean tieneCampoDeportivo;
    
    public CasaConjuntoCerrado(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños,
            int numPisos, int valorAdmin, boolean tienePiscina, boolean tieneCampoDeportivo) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorAdmin = valorAdmin;
        this.tienePiscina = tienePiscina;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor De Administracion: " + valorAdmin + "\nTiene Piscina?: " + tienePiscina + "\nTiene campos deportivos?: " + tieneCampoDeportivo;
    }

    
    
}
