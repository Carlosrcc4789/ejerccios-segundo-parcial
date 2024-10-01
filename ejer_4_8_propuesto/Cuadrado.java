package ejer_4_8_propuesto;

public class Cuadrado extends Figura_Geometrica{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double Area(){
        return lado*lado;
    }
    public double Perimetro(){
        return 4*lado;
    }


}
