package Ejercicio2_Libros;

public class TextoUniversidad extends LibroTexto{
    protected String facultad;

    public TextoUniversidad(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    @Override
    public String toString(){
        return super.toString() + "\nFacultad : " + facultad;
    }
}
