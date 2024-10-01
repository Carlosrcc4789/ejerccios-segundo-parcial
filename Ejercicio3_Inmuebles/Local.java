package Ejercicio3_Inmuebles;

public class Local extends Inmueble {

    enum tipo {Interno, Calle}
    protected tipo tipolocal;
    
    public Local(int idInmueble, int area, String direccion, tipo tipolocal) {
        super(idInmueble, area, direccion);
        this.tipolocal = tipolocal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de local: " + tipolocal;
    }


}
