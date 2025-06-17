public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Pedro");
        agenda.agregarContacto("Ana", "0998765432");
        agenda.agregarContacto("Laura", "0981234567", "laura@email.com");
    }
}
