package Telas;

public class Algodon extends Tela {
    private boolean esOrgánico;

    public Algodon(String color, boolean esOrgánico) {
        super(color);
        this.esOrgánico = esOrgánico;
    }

    @Override
    public void mostrarPropiedades() {
        System.out.println("Tela de Algodón: Color: " + getColor() + ", Orgánico: " + (esOrgánico ? "Sí" : "No"));
    }
}
