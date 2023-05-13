class Gato extends Animal {
    public Gato(String nombre, int edad, Dueno dueno, String sexo, int peso) {
        super(nombre, edad, dueno, sexo, peso);
    }

    @Override
    public String obtenerTipoAnimal() {
        return "gato";
    }

    @Override
    public void mostrarDetalles(int posicion) {
        System.out.println("Tipo Animal: " + obtenerTipoAnimal());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre del dueño: " + dueno.getNombre());
        System.out.println("DNI del dueño: " + dueno.getDni());
        System.out.println("Dirección del dueño: " + dueno.getDireccion());
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso(grs): " + peso);
        System.out.println("Posición en la lista: " + posicion);
        System.out.println("-------------------------------");
    }
}