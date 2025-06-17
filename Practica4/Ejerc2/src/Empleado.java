abstract class Empleado {
    public abstract double calcularSalario();
}

class EmpleadoFijo extends Empleado {
    private double sueldo;
    public EmpleadoFijo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public double calcularSalario() {
        return sueldo;
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double tarifa;
    public EmpleadoPorHoras(int horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }
    @Override
    public double calcularSalario() {
        return horas * tarifa;
    }
}