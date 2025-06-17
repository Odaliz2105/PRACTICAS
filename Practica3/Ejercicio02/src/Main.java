public class Main {
    public static void main(String[] args) {
        Vehiculo[] lista = { new Moto(), new Carro() };

        for (Vehiculo v : lista) {
            v.arrancar();
        }
    }
}
