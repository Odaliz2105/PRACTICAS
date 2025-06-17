public class Pelicula {
    public String titulo = "";
    public int anio = 2024;
    private String director = "";
    private double duracion = 0.0;

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
