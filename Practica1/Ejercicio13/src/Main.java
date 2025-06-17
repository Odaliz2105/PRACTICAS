public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "Interstellar";
        pelicula.setDirector("Juanito Perez");
        pelicula.setDuracion(169.0);

        pelicula.mostrarFicha();
    }
}
