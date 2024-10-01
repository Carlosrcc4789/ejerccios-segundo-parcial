package Telas;
public class Seda extends Tela {
    private double grosor;

    public Seda(String color, double grosor) {
        super(color);
        this.grosor = grosor;
    }
    @Override
    public void mostrarPropiedades() {
        System.out.println("Tela de Seda: Color: " + getColor() + ", Grosor: " + grosor + " mm");
    }
}
