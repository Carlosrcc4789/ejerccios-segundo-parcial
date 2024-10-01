package Motocicletas;
public class Deportiva extends Motocicleta {
    private int potencia;
    public Deportiva(String marca, String modelo, int potencia) {
        super(marca, modelo);
        this.potencia = potencia;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Motocicleta Deportiva: " + getMarca() + " " + getModelo() + ", Potencia: " + potencia + " CV");
    }
}
