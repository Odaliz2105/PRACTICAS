public class Main {
    public static void main(String[] args) {
        Curso curso1 = new CursoRegular("Java Básico", 100);
        Curso curso2 = new CursoCertificado("Java Avanzado", 150, 50);
        curso1.mostrarInfo("Java Básico");
        curso2.mostrarInfo("Java Avanzado", curso2.calcularCosto());

    }
}