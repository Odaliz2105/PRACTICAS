abstract class Curso {
    protected String nombre;

    public Curso(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre de curso inválido");
        }
        this.nombre = nombre;
    }

    public abstract double calcularCosto();

    public void mostrarInfo(String nombre) {
        System.out.println("Curso: " + nombre);
    }

    public void mostrarInfo(String nombre, double costo) {
        System.out.println("Curso: " + nombre + ", Costo: " + costo);
    }

    public double calcularDescuento() {
        double costo = calcularCosto();
        return costo > 150 ? costo * 0.9 : costo;
    }
}

class CursoRegular extends Curso {
    private double costoBase;

    public CursoRegular(String nombre, double costoBase) {
        super(nombre);
        this.costoBase = costoBase;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}

class CursoCertificado extends Curso {
    private double costoBase;
    private double recargo;

    public CursoCertificado(String nombre, double costoBase, double recargo) {
        super(nombre);
        this.costoBase = costoBase;
        this.recargo = recargo;
    }

    @Override
    public double calcularCosto() {
        return costoBase + recargo;
    }
}