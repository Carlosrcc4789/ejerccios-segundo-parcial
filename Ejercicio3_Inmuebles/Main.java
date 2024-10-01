package Ejercicio3_Inmuebles;

public class Main {
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(5568, 120, "Avenida Santander", 3, 2);

        System.out.println("Datos del Inmueble: ");
        apto1.calcPrecioVenta(apto1.valorArea);
        System.out.println(apto1);
        System.out.println();
        System.out.println("Datos del Inmueble: ");
        ApartStudio aptstudio1 = new ApartStudio(5569, 50, "Calle Caracas", 1, 2);
        aptstudio1.calcPrecioVenta(aptstudio1.valorArea);
        System.out.println(aptstudio1);



    }
    
}
