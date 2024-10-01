package Ejercicio4_TiendaDeAnimales;

public class Main {
    public static void main(String[] args) {
        PerroGrande perro1 = new PerroGrande("firulais", 12, "griss", true, 24.5, PerroGrande.tipo.rotweiller);
        PerroPequeño perro2 = new PerroPequeño("Tommy", 5, "negro", true, 23, PerroPequeño.tipo.caniche);
        System.out.println(perro1);
        perro1.sound();
        System.out.println();
        System.out.println(perro2);
        perro2.sound();
        System.out.println();

        GatoConPeloLargo gato1 = new GatoConPeloLargo("michi", 7, "naranja", 5, 6.5, GatoConPeloLargo.tipo.himalayo);
        GatoSinPelo gato2 = new GatoSinPelo("rooney", 10, "rosado", 4.5, 6, GatoSinPelo.tipo.esfinge);
        System.out.println(gato1);
        gato1.sound();
        System.out.println();
        System.out.println(gato2);
        gato2.sound();

    }
}