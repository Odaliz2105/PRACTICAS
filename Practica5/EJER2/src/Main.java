public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoFijo("Luis", 500);
        Empleado emp2 = new EmpleadoPorComision("María", 1000, 0.1);
        emp1.mostrarDatos();
        emp2.mostrarDatos();

    }
}