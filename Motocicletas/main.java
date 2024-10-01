package Motocicletas;
public class main {
    public static void main(String[] args) {

        Motocicleta[] motocicletas = new Motocicleta[2];

        motocicletas[0] = new Deportiva("Yamaha", "YZF-R1", 200);
        motocicletas[1] = new Cruiser("Harley-Davidson", "Street 750", true);

        for (Motocicleta motocicleta : motocicletas) {
            motocicleta.mostrarDetalles();
        }
    }
}
