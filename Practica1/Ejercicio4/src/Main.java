import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        System.out.print("Ingrese su contraseña: ");
        String inputPassword = scanner.nextLine(); // se captura lo que el usuario escribe

        cuenta.setPassword(inputPassword); // se guarda la contraseña
        System.out.println("Su contraseña se ha guardado exitosamente.");
    }
}
