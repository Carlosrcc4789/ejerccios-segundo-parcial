package Ejercicio3_Inmuebles;

public class Inmueble {
    protected int idInmueble;
    protected int area;
    protected String direccion;
    protected double precioVenta;
    
    public Inmueble(int idInmueble, int area, String direccion) {
        this.idInmueble = idInmueble;
        this.area = area;
        this.direccion = direccion;
    }

    double calcPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Identificador Inmobiliario: " + idInmueble + "\nArea: " + area + "\nDireccion: " + direccion + "\nPrecioVenta: " + precioVenta;
    }

    
}
