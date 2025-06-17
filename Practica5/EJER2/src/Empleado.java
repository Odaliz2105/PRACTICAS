abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDatos();
}

class EmpleadoFijo extends Empleado {
    private double salarioBase;

    public EmpleadoFijo(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public void aplicarBono(int anios) {
        if (anios > 5) {
            salarioBase += 100;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado Fijo: " + nombre + ", Salario: " + calcularSalario());
    }
}

class EmpleadoPorComision extends Empleado {
    private double ventas;
    private double comision;

    public EmpleadoPorComision(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return ventas + (ventas * comision);
    }

    public void aplicarBono() {
        if (ventas > 1000) {
            ventas += 100;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado Comisión: " + nombre + ", Salario: " + calcularSalario());
    }
}