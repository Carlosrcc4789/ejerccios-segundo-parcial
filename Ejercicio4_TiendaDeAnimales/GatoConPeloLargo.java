package Ejercicio4_TiendaDeAnimales;

class GatoConPeloLargo extends Gato {
    protected enum tipo {angora, himalayo, balinés, somalí}
    tipo raza;

    public GatoConPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}