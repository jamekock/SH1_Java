/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author John
 */
public class Persona {
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("###.##");
    private String nombre = "";
    private int edad = 0;
    private final char sexo ;
    private double peso = 0.0;
    private double altura = 0.0;

    // nombre, la edad, sexo, peso y altura
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(double value) {
        this.peso = value;
    }

    public void setAltura(double value) {
        this.altura = value;
    }

    // getter
    public String getNombre() {
        return this.nombre;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    // methods
    public void convertirPieAMetros() {
        altura /= 3.281;
        setAltura(altura);
    }

    public void convertirLibraAKilogramos() {
        peso /= 2.205;
        setPeso(peso);
    }

    public int calcularPesoIdeal() {
        peso /= altura * altura;
        if (peso < 20) {
            return -1;
        } // -1 en su peso ideal
        else if (peso > 19 && peso < 26) {
            return 1;
        } // 1 sobrepeso
        else {
            return 0;
        } // 0 por debajo de su peso ideal
    }

    public boolean esMayorDeEdad() {
        return edad > 17;
    }

    public boolean comprobarSexo(char sexo) {
        return sexo == 'M';
    }

    public String toString() {
        String esEdad;
        String pesoIdeal;
        String esSexo;

        if (comprobarSexo(getSexo()) == true) {
            esSexo = "Mujer";
        } else {
            esSexo = "Hombre";
        }

        if (esMayorDeEdad() == true) {
            esEdad = "mayor";
        } else {
            esEdad = "menor";
        }

        pesoIdeal = switch (calcularPesoIdeal()) {
            case -1 -> "esta en su peso ideal";
            case 1 -> "esta en sobrepeso ";
            default -> "por debajo de su peso ideal ";
        };
        return "Hola " + getNombre() + " tienes " + getEdad() + " Años" + "\nentonces eres " + esEdad + " de edad"
                + "\nmides " + df.format(getAltura()) + " metros " + "y pesas " + df.format(getPeso())
                + " kilogramos \nes decir " + pesoIdeal + " para ser " + esSexo + "\nCedula: " + generCedula() + ".";
    }

    public String generCedula() {
        int num1;
        String str1;
        int num2;
        String str2;
        num1 = random.nextInt(900000) + 10000;
        str1 = String.valueOf(num1);
        num2 = random.nextInt(90000) + 1000;
        str2 = String.valueOf(num2);
        return str1 + str2;
    }
}
