package Ejercicio1_CuentaBancaria;

public class CuentaCorriente extends Cuenta {
    
    float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;

        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;

        if (sobregiro > 0) {
            if (sobregiro > 0) {

                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro -= residuo;
                saldo = 0;
            }

        } else {
            super.consignar(cantidad);
        }
    }

    public void extractoMensual(){
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numConsignaciones + numRetiros));
       
        System.out.println("Valor de sogregiro = $" + (numConsignaciones + numRetiros));
        System.out.println();

    
    }

}