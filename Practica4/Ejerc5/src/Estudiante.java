class Estudiante {
    private double nota;
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Nota válida registrada: " + nota);
        } else {
            System.out.println("Error: Nota fuera de rango");
        }
    }
}