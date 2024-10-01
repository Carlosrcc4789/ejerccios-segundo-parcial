package Motocicletas;
public class Cruiser extends Motocicleta {
    private boolean tieneBaquetas;

    public Cruiser(String marca, String modelo, boolean tieneBaquetas) {
        super(marca, modelo);
        this.tieneBaquetas = tieneBaquetas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Motocicleta Cruiser: " + getMarca() + " " + getModelo() + ", Baquetas: " + (tieneBaquetas ? "Sí" : "No"));
    }
}
