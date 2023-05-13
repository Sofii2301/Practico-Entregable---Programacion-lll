class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, Dueno dueno, String sexo, int peso, String raza) {
        super(nombre, edad, dueno, sexo, peso);
        this.raza = raza;
    }

    @Override
    public String obtenerTipoAnimal() {
        return "perro";
    }

    public String getRaza() {
        return raza;
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
        System.out.println("Raza: " + raza);
        System.out.println("Posición en la lista: " + posicion);
        System.out.println("-------------------------------");
    }
}