package Ejercicio4_TiendaDeAnimales;

class GatoSinPelo extends Gato {
    protected enum tipo {esfinge, elfo, donskoy}
    tipo raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}
