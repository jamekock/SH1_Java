package prueba;

import java.util.Random;

public class Libro {

    /*
     * ¿Qué es un ISBN? Un ISBN es un código normalizado internacional para libros
     * (International Standard Book Number). Los ISBN tuvieron 10 dígitos hasta
     * diciembre de 2006 pero, desde enero de 2007, tienen siempre 13 dígitos. Los
     * ISBN se calculan utilizando una fórmula matemática específica e incluyen un
     * dígito de control que valida el código.
     */
    /*
     * Cada ISBN se compone de 5 elementos separados entre sí por un espacio o un
     * guion. Tres de los cinco elementos pueden variar en longitud:
     */
    /*
     * ⦁ Elemento prefijo – actualmente sólo pueden ser 978 o 979. Siempre tiene 3
     * dígitos de longitud.
     */

    /*
     * ⦁ Elemento de grupo de registro –identifica a un determinado país, una región
     * geográfica o un área lingüística que participan en el sistema ISBN. Este
     * elemento puede tener entre 1 y 5 dígitos de longitud.
     */

    /*
     * ⦁ Elemento del titular – identifica a un determinado editor o a un sello
     * editorial. Puede tener hasta 7 dígitos de longitud.
     */

    /*
     * ⦁ Elemento de publicación – identifica una determinada edición y formato de
     * un determinado título. Puede ser de hasta 6 dígitos de longitud.
     */

    /*
     * ⦁ Dígito de control – es siempre el último y único dígito que valida
     * matemáticamente al resto del número. Se calcula utilizando el sistema de
     * Módulo 10 con pesos alternativos de 1 y 3.
     */
    /*
     * ¿Para qué sirve un ISBN? Un ISBN es, en lo esencial, un identificador de
     * producto utilizado por editores, libreros, tiendas online y otros
     * participantes en la cadena comercial para pedidos, listados, registros de
     * venta y control de existencias. El ISBN identifica tanto al titular como a un
     * título específico, su edición y su formato.
     */

    /*
     * 
     * – ISBN – Titulo – Autor – Número de páginas - Precio
     */

    /*
     * Crear sus respectivos métodos get y set correspondientes para cada
     * atributo. Crear el método toString() para mostrar la información relativa al
     * libro con el siguiente formato: “El libro con ISBN creado por el autor tiene
     * páginas” En el fichero main, crear 2 objetos Libro (los valores que se
     * quieran) y mostrarlos por pantalla. Por último, indicar cuál de los 2 tiene
     * más páginas.
     */
    Random random =new Random();
    private String ISBN;
    private String titulo;
    private String autor;
    private int nPaginas;
    private double precio;

    // Constructor con parametros
    public Libro(String titulo, String autor, int nPaginas, double precio) {
        generISBN();
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.precio = precio;
    }
    // setter
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNPaginas (int nPaginas){this.nPaginas = nPaginas;}

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // getter

    public String getISBN() {
        return this.ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNPaginas() {
        return this.nPaginas;
    }

    public double getPrecio() {
        return this.precio;
    }
    

    public String toString(){
        return "El libro: "+getTitulo() +" con ISBN creado: "+getISBN() + " por el autor(a): "+ getAutor()
        + "\ntiene "+ getNPaginas() +" páginas y cuesta : "+ getPrecio() + " Dolares";
    }

    public void generISBN(){
        int num1= random.nextInt(90)+10;
        String str1 = String.valueOf(num1);
        int num2= random.nextInt(900)+100;
        String str2 = String.valueOf(num2);
        setISBN("978-9945-"+str1+"-"+str2+"-7");
    }
}
