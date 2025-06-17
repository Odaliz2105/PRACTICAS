public class Vehiculo {
    public void arrancar() {
        System.out.println("El vehículo arranca.");
    }
}

class Moto extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La moto arranca con botón");
    }
}

class Carro extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El carro arranca con llave");
    }
}
