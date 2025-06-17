public class Main {
    public static void main(String[] args) {
        empleado[] personal = { new Gerente(), new Asistente() };

        for (empleado e : personal) {
            e.mostrarInfo();
        }
    }
}
