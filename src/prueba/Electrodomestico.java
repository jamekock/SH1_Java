package prueba;

public class Electrodomestico {

    private int precioBase = 100; // euros
    private String color = "blanco"; // blanco, negro, rojo, azul y gris.
    private char consumoEnergetico = 'F';
    private double peso = 5; // kilogramos

    public Electrodomestico(int precio, String color, char consumo, double peso) {
        this.precioBase = precio;
        this.color = color;
        this.consumoEnergetico = consumo;
        this.peso = peso;
    }

    public Electrodomestico(int precio, double peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico  = 'F';
    }

    public int getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }
    
    public char getConsumoEnergetico (){
        return this.consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    } 



}
