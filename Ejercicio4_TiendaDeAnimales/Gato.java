package Ejercicio4_TiendaDeAnimales;

class Gato extends Mascota {
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sound(){
        System.out.println("Los gatos maullan y ronronean");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAltura de salto: " + alturaSalto + "\nLongitud de Salto: " + longitudSalto;
    }
}
