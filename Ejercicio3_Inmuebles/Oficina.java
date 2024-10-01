package Ejercicio3_Inmuebles;

public class Oficina extends Local {

    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    public Oficina(int idInmueble, int area, String direccion, tipo tipolocal, boolean esGobierno) {
        super(idInmueble, area, direccion, tipolocal);
        this.esGobierno = esGobierno;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs oficina gubernamental?: " + esGobierno;
    }

    
}
