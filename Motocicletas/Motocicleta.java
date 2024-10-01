package Motocicletas;
public abstract class Motocicleta {
    private String marca;
    private String modelo;

    public Motocicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void mostrarDetalles();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
