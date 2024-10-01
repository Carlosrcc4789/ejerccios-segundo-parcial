package Ejercicio3_Inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected static double valorArea = 2000000;
    protected int valorAdmin;
    
    public ApartamentoFamiliar(int idInmueble, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idInmueble, area, direccion, numHabitaciones, numBaños);
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor Administracion: " + valorAdmin;
    }

    
    
}
