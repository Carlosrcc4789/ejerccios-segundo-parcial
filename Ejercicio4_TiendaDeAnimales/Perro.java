package Ejercicio4_TiendaDeAnimales;

public class Perro extends Mascota {
    protected boolean muerde;
    protected double peso;

    public Perro(String nombre, int edad, String color, boolean muerde, double peso) {
        super(nombre, edad, color);
        this.muerde = muerde;
        this.peso = peso;

    }
    public static void sound(){
        System.out.println("Los perros ladran");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMuerde: " + muerde + "\nPeso: " + peso;
    }
}
