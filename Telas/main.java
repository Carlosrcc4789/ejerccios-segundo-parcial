package Telas;

public class main {
    public static void main(String[] args) {

        Tela[] telas = new Tela[2];

        telas[0] = new Algodon("Blanco", true);
        telas[1] = new Seda("Rojo", 0.5);

        for (Tela tela : telas) {
            tela.mostrarPropiedades();
        }
    }
}
