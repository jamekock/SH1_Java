package prueba;

public class VideoJuego {
    // ⦁ Crearemos una clase Videojuego con las siguientes características:
    // ⦁ Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    // ⦁ Por defecto, las horas estimadas serán de 10 horas y entregado false. El
    // resto de atributos serán valores por defecto según el tipo del atributo.
    // ⦁ Los constructores que se implementaran serán:
    // ⦁ Un constructor por defecto.
    // ⦁ Un constructor con el titulo y horas estimadas. El resto por defecto.
    // ⦁ Un constructor con todos los atributos, excepto de entregado.
    // ⦁ Los métodos que se implementara serán:
    // ⦁ Métodos get de todos los atributos, excepto de entregado.
    // ⦁ Métodos set de todos los atributos, excepto de entregado.
    // ⦁ Sobrescribe los métodos toString para que imprima todos los datos de los
    // atributos.
    // ⦁ Realizar instancia con cada uno de los constructores mostrar datos con lo
    // obtenido del método toString().

    private String titulo;
    private int hrEstimadas = 10; // hr
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public VideoJuego(String titulo, int horas) {
        this.titulo = titulo;
        this.hrEstimadas = horas;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public VideoJuego(String titulo, int horas, String genero, String compañia) {
        this.titulo = titulo;
        this.hrEstimadas = horas;
        this.genero = genero;
        this.compañia = compañia;
    }

    // setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHrEstimadas(int hrEstimadas) {
        this.hrEstimadas = hrEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    // getter
    public String getTitulo() {
        return this.titulo;
    }

    public int getHrEstimadas() {
        return this.hrEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCompañia() {
        return this.compañia;
    }

    @Override
    public String toString(){
        return "Titulo: " + getTitulo() + "Horas Estimadas: " + getHrEstimadas() + "Entregado: " +this.entregado + "Genero: "+ getGenero()+ "Compañia"+ getCompañia();
    }

}
