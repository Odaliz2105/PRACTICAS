abstract class Transporte {
    public abstract void iniciarViaje();

    public void registrarRuta(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            System.out.println("Error: dirección inválida");
            return;
        }
        System.out.println("Ruta registrada: " + direccion);
    }

    public void registrarRuta(String direccion, String hora) {
        if (direccion == null || direccion.isEmpty()) {
            System.out.println("Error: dirección inválida");
            return;
        }
        System.out.println("Ruta: " + direccion + ", Hora: " + hora);
    }

    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }
}

class Taxi extends Transporte {
    @Override
    public void iniciarViaje() {
        System.out.println("Taxi encendido");
    }
}

class Patineta extends Transporte {
    @Override
    public void iniciarViaje() {
        System.out.println("Patineta activada");
    }
}
