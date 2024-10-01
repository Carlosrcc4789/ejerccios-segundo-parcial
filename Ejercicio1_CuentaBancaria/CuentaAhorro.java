package Ejercicio1_CuentaBancaria;

public class CuentaAhorro extends Cuenta {
    private boolean activa;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }

    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            super.consignar(cantidad);
        }

    }

    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
            
        }

        super.extractoMensual();

        if (saldo < 10000) {
            activa = false;
        }

        
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numConsignaciones + numRetiros));
        System.out.println();

    
    }
    
}
