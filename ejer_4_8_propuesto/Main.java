package ejer_4_8_propuesto;


public class Main {

        public static void main(String[] args) {
            Circulo obj = new Circulo(5);
            Cuadrado obj2 = new Cuadrado(3.3);
            Rectangulo obj3 = new Rectangulo(2.7,9);
            Triangulo_Rectangulo obj4= new Triangulo_Rectangulo(5.3,6.6,5.3,9,10);

            System.out.println("area de un circulo :"+obj.Area());
            System.out.println("perimetro de un circulo: "+obj.Perimetro());
            System.out.println(" ");

            System.out.println("área de un cuadrado: "+obj2.Area());
            System.out.println("perímetro de un cuadrado: "+obj2.Perimetro());
            System.out.println(" ");

            System.out.println("área de un rectángulo: "+obj3.Area());
            System.out.println("perímetro de un rectángulo: "+obj3.Perimetro());
            System.out.println(" ");

            System.out.println("área de un triángulo retángulo: "+obj4.Area());
            System.out.println("perímetro de un triángulo rectángulo: "+obj4.Perimetro());
            System.out.println(" ");

        }
    }





