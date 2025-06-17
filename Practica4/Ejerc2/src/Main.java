public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoFijo(600);
        Empleado emp2 = new EmpleadoPorHoras(40, 5);
        System.out.println("Salario fijo: " + emp1.calcularSalario());
        System.out.println("Salario por horas: " + emp2.calcularSalario());
    }
}