package Ejercicio4_TiendaDeAnimales;

class GatoConPeloCorto extends Gato {
    protected enum tipo {azul,ruso, británico, manx, devon_rex}
    tipo raza;

    public GatoConPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }
}
