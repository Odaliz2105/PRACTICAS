public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setPrecio(899.99);

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}
