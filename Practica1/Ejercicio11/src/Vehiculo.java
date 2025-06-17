public class Vehiculo {
    public String tipo = "Automóvil";
    public int velocidadMaxima;
    private String placa = "";
    private String marca = "Toyota";

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
    }
}
