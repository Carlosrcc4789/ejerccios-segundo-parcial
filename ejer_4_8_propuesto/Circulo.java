package ejer_4_8_propuesto;

public class Circulo extends Figura_Geometrica{

    double radio;

    public Circulo(double radio){
        this.radio = radio;

    }

    public double Area(){

        return Math.PI*Math.pow(radio,2);
    }
    public double Perimetro(){
        return 2*Math.PI*radio;
    }


}
