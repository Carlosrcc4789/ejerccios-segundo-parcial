package Ejercicio2_Libros;

public class Main {
    public static void main(String[] args) {

        Novela libro1 = new Novela("Cien años de soledad", "Juan Garcia Marquez", 600, Novela.tipo.realista);
        TextoUniversidad libro2 = new TextoUniversidad("Calculo", "Stewart", 550, "Fisica 1", "Facultad de Ciencias y Tecnologia");
        Novela libro3 = new Novela("Cronica de una muerte anunciada", "Juan Garcia Marquez", 700, Novela.tipo.aventuras);

        System.out.println(libro1);
        System.out.println();
        System.out.println(libro2);
        System.out.println();
        System.out.println(libro3);
    }
}