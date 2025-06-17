public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Carlos Pérez");
        empleado.setSalario(1200.75);
        empleado.horario = "08:00 - 17:00"; // directo porque es público

        empleado.mostrarDatos();
    }
}
