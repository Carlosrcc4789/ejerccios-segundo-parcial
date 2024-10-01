package ejerccio6;
class Main {
    public static void main(String[] args) {
        fraccion f1 = new fraccion(1, 2); // 1/2
        fraccion f2 = new fraccion(3, 4); // 3/4

        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);
        System.out.println("Suma: " + f1.sumar(f2));
        System.out.println("Resta: " + f1.restar(f2));
        System.out.println("Multiplicación: " + f1.multiplicar(f2));
        System.out.println("División: " + f1.dividir(f2));
    }
}
