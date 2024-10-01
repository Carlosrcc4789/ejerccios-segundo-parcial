package ejerccio6;

abstract class numerica {
    public abstract String toString();

    public abstract boolean equals(Object ob);

    public abstract numerica sumar(numerica numero);
    public abstract numerica restar(numerica numero);
    public abstract numerica multiplicar(numerica numero);
    public abstract numerica dividir(numerica numero);
}