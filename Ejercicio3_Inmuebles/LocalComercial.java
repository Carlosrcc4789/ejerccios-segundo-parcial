package Ejercicio3_Inmuebles;

public class LocalComercial extends Local{

    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    public LocalComercial(int idInmueble, int area, String direccion, tipo tipolocal, String centroComercial) {
        super(idInmueble, area, direccion, tipolocal);
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCentro comercial: " + centroComercial;
    }

    
}
