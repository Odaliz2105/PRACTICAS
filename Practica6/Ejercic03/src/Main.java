//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Transporte
        Transporte t1 = new Taxi();
        Transporte t2 = new Patineta();
        t1.iniciarViaje();
        t2.iniciarViaje();
        t1.registrarRuta("Av. Quito", "08:00");
        t2.registrarRuta("Parque Central");
        t1.registrarRuta("", "10:00");

    }
}