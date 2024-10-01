package Ejercicio2_Libros;

public class Novela extends Libro {
    protected enum tipo {historica, romantica, policiaca, realista, ciencia_ficcion, aventuras}
    tipo genero;

    public Novela(String titulo, String autor, double precio, tipo genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public tipo getGenero() {
        return genero;
    }
    @Override
    public String toString(){
        return super.toString() + "\nGenero: " + genero;
    }
}
