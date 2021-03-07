package prueba;

public class Serie {
    // ⦁ Crearemos una clase llamada Serie con las siguientes características:
    // ⦁ Sus atributos son titulo, numero de temporadas, entregado, genero y
    // creador.
    // ⦁ Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
    // El resto de atributos serán valores por defecto según el tipo del atributo.
    // ⦁ Los constructores que se implementaran serán:
    // ⦁ Un constructor por defecto.
    // ⦁ Un constructor con el titulo y creador. El resto por defecto.
    // ⦁ Un constructor con todos los atributos, excepto de entregado.
    // ⦁ Los métodos que se implementara serán:
    // ⦁ Métodos get de todos los atributos, excepto de entregado.
    // ⦁ Métodos set de todos los atributos, excepto de entregado.
    // ⦁ Sobrescribe los métodos toString para que imprima todos los datos de los
    // atributos.
    // ⦁ Realizar instancia con cada uno de los constructores mostrar datos con lo
    // obtenido del método toString()

    private String titulo;
    private int nTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.nTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, int Ntemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.nTemporadas = Ntemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    @Override 
    public String toString(){
        return "Titulo: " + this.titulo + "Numero de temporadas: "
        + this.nTemporadas + "Entregado: " + this.entregado + "Genero: " + this.genero+ ""+ this.creador ;
    }
}
