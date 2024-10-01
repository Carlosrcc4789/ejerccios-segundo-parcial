package Ejercicio4_TiendaDeAnimales;

public class PerroGrande extends Perro {
    protected enum tipo {pastor_alemán, doberman, rotweiller}
    tipo raza;

    public PerroGrande(String nombre, int edad, String color, boolean muerde, double peso, tipo raza) {
        super(nombre, edad, color, muerde, peso);
        this.raza = raza;

    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}
