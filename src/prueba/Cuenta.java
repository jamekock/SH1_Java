/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author John
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }


    public void setTitular(String value) {
        this.titular = value;
    }

    public String getTitular() {
        return titular;
    }

    public void setCantidad(double value) {
        this.cantidad = value;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad < 0) {
        } else {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            setCantidad(0);
        } else if (cantidad < 0) {
        } else {
            this.cantidad -= cantidad;
        }
    }
    @Override
    public String toString() {
        return "El titular " + getTitular() + " tiene " + getCantidad() + " pesos en la cuenta";
    }
}
