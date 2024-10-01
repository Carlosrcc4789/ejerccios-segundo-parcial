package Ejercicio2_Libros;

public class LibroTexto extends Libro {
    protected String curso;

    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    @Override
    public String toString(){
        return super.toString() + "\nCurso: " + curso;
    }
}
