public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Luis");
        estudiante.setCarrera("Ingeniería de Software");

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Carrera: " + estudiante.getCarrera());
    }
}
