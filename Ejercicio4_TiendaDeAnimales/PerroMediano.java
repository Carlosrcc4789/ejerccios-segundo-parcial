package Ejercicio4_TiendaDeAnimales;

public class PerroMediano extends Perro {
    protected enum tipo {collie, dálmata, bulldog, galgo, sabueso}
    tipo raza;

    public PerroMediano(String nombre, int edad, String color, boolean muerde, double peso, tipo raza) {
        super(nombre, edad, color, muerde, peso);
        this.raza = raza;

    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}