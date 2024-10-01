package ejer_4_8_propuesto;

public class Rectangulo extends Figura_Geometrica{

    double base,altura;

    public Rectangulo(double base,double altura){

        this.base = base;
        this.altura = altura;
    }


    public double Area(){
        return base*altura;
    }
    public double Perimetro(){
        return 2+(base*altura);
    }


}
