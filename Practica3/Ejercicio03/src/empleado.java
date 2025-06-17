public class empleado {
    public void mostrarInfo() {
        System.out.println("Información general del empleado.");
    }
}

class Gerente extends empleado {
    @Override
    public void mostrarInfo() {
        System.out.println("Soy el gerente de la empresa.");
    }
}

class Asistente extends empleado {
    @Override
    public void mostrarInfo() {
        System.out.println("Soy asistente del área administrativa.");
    }
}
