public class Empleado {
    public String departamento = "Ventas";
    public String horario;
    private String nombre = "";
    private double salario = 0.0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horario: " + horario);
    }
}
