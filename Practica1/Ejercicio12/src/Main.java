public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.codigoCliente = 1001;
        cliente.setNombre("Odaliz Balseca");
        cliente.setTelefono("0968232374");

        cliente.verCliente();
    }
}
