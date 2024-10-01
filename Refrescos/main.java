package Refrescos;

public class main {
    public static void main(String[] args) {
        Refresco[] refrescos = new Refresco[3];
        refrescos[0] = new RefrescoDeCola();
        refrescos[1] = new RefrescoDeNaranja();
        refrescos[2] = new Refresco();
        for (Refresco refresco : refrescos) {
            refresco.servir();
        }
    }
}

