public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Ana Torres");
        cuenta.setSaldo(1500.50);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: $" + cuenta.getSaldo());
    }
}
