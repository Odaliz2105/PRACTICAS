public class Agenda {
    public void agregarContacto(String nombre) {
        System.out.println("Contacto agregado: " + nombre);
    }

    public void agregarContacto(String nombre, String telefono) {
        System.out.println("Contacto agregado: " + nombre + ", Teléfono: " + telefono);
    }

    public void agregarContacto(String nombre, String telefono, String email) {
        System.out.println("Contacto agregado: " + nombre + ", Teléfono: " + telefono + ", Email: " + email);
    }
}
