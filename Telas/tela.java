package Telas;
abstract class Tela {
    private String color;

    public Tela(String color) {
        this.color = color;
    }
    public abstract void mostrarPropiedades();

    public String getColor() {
        return color;
    }
}
