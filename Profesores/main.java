package Profesores;
class main {

    public static void main(String[] args) {
        Arquitecto arquitecto = new ArquitectoTitular();
        arquitecto.imprimir();

        if (arquitecto instanceof ArquitectoTitular) {
            ArquitectoTitular arquitectoTitular = (ArquitectoTitular) arquitecto;
            arquitectoTitular.imprimir();
        } else {
            System.out.println("El objeto no es un ArquitectoTitular.");
        }

        Arquitecto otroArquitecto = new Arquitecto();
        try {
            ArquitectoTitular arquitectoFalso = (ArquitectoTitular) otroArquitecto;
        } catch (ClassCastException e) {
            System.out.println("No se puede convertir a ArquitectoTitular: " + e.getMessage());
        }
    }
}
