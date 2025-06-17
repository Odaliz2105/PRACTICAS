public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Cien Años de Soledad");
        libro.setAnioPublicacion(1967);

        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Año de publicación: " + libro.getAnioPublicacion());
    }
}
