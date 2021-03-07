/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author John
 */
public class Prueba {

    /**
     * @param args the command line arguments
     * @throws IOException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        
        //var console = System.console();        

        // Ejercicio 1                        
        
        // String titular = console.readLine("Cual es tu nombre: ");
        // var cuenta = new Cuenta(titular);
        // double cantidad;
        // do {
        //     int opcion = Integer.parseInt(console.readLine("\nSelecciona 1.Ingresar 2.Retirar 3.Exit: "));
        //     switch (opcion) {
        //         case 1 -> {
        //             cantidad = Double.parseDouble(console.readLine("\nIngrese cantidad a ingresar: "));
        //             cuenta.ingresar(cantidad);
        //             System.out.print(cuenta.toString());
        //         }
        //         case 2 -> {
        //             cantidad = Double.parseDouble(console.readLine("\nIngrese cantidad a retirar: "));
        //             cuenta.retirar(cantidad);
        //             System.out.print(cuenta.toString());
        //         }
        //         case 3 -> {
        //             return;
        //         }
        //     }
        // } while (true);
        
            // Ejercicio 2
        
        // String nombre =console.readLine("Cual es su nombre: ");
        // int edad =Integer.parseInt( console.readLine("Cual es su edad: "));
        // char sexo = console.readLine("H Hombre - M Mujer ").charAt(0);
        // double peso =Double.parseDouble( console.readLine("Cual es su peso en Libras: "));
        // double altura = Double.parseDouble(console.readLine("Cual es su altura en Pies: "));
        // var persona = new Persona(nombre, edad, sexo, peso, altura);
        // persona.convertirLibraAKilogramos();
        // persona.convertirPieAMetros();
        // persona.calcularPesoIdeal();        
        // System.out.print(persona.toString());

        // Ejercicio 6
        
        Libro libro1 = new Libro("El almohadón de plumas","Horacio Quiroga",200,20.0);
        Libro libro2 = new Libro("Mujercitas ","Louisa M. Alcott",201,20.0);
        System.out.print(libro1.toString());
        System.out.print("\n"+libro2.toString());
            if(libro1.getNPaginas() > libro2.getNPaginas())             {
                System.out.print("\nEl libro: " + libro1.getTitulo() + "tiene mas paginas");
            }
            else if(libro2.getNPaginas() > libro1.getNPaginas())             {
                System.out.print("\nEl libro: " + libro2.getTitulo() + "tiene mas paginas");
            }
            
    }
}
