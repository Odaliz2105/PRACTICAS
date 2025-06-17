public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("sumar(5, 3): " + calc.sumar(5, 3));
        System.out.println("sumar(2.5, 3.1): " + calc.sumar(2.5, 3.1));
        System.out.println("sumar(1, 2, 3): " + calc.sumar(1, 2, 3));
    }
}
