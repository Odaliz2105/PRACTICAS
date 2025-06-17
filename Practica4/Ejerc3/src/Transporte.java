abstract class Transporte {
    public abstract void iniciarViaje();
}

class Bus extends Transporte {
    @Override
    public void iniciarViaje() {
        System.out.println("El bus arranca con motor.");
    }
}

class Bicicleta extends Transporte {
    @Override
    public void iniciarViaje() {
        System.out.println("La bicicleta comienza a pedalear.");
    }
}
