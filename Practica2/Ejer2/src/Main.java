public class Main {
    public static void main(String[] args) {
        Mensajero m = new Mensajero();
        m.enviar("Hola");
        m.enviar("Hola", "Carlos");
        m.enviar("Hola", "Ana", 1);
    }
}
