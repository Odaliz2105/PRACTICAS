public class Libro {
    private String titulo = "";
    private int anioPublicacion = 0;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioPublicacion(int anio) {
        this.anioPublicacion = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
