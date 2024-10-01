package ejer_4_8_propuesto;

public class Triangulo_Rectangulo extends Triangulo{


    public Triangulo_Rectangulo(double base, double altura, double lado1, double lado2, double lado3){
        super(base,altura,lado1, lado2, lado3);

    }

    public double Area(){
        return ((base*altura)/2);
    }
    public double Perimetro(){
        return lado1+lado2+lado3;
    }

}
