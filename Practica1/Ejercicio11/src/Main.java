public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.velocidadMaxima = 180;
        vehiculo.setPlaca("ABC-123");

        vehiculo.mostrarInfo();
    }
}
