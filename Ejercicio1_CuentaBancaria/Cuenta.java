package Ejercicio1_CuentaBancaria;

public class Cuenta {
    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
        numConsignaciones += 1;


    }

    public void retirar(float cantidad) {
        float newSaldo = saldo - cantidad;

        if(newSaldo >= 0) {
            saldo -= cantidad;
            numRetiros += 1;
        } else {
            System.out.println("No dispone de saldo suficiente para reañizar la operacion");
        }

    }

    public void calcInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;

    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcInteres();
    }

    
}
