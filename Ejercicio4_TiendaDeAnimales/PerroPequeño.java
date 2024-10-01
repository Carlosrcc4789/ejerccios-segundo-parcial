package Ejercicio4_TiendaDeAnimales;

class PerroPequeño extends Perro {
    protected enum tipo {caniche, yorkshire, terrier, schnauzer, chihuahua}
    tipo raza;

    public PerroPequeño(String nombre, int edad, String color, boolean muerde, double peso, tipo raza) {
        super(nombre, edad, color, muerde, peso);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}
