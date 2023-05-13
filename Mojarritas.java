class Mojarritas extends Animal {
    private String tipoAgua;
    public Mojarritas(String nombre, int edad, Dueno dueno, String sexo, int peso, String tipoAgua) {
        super(nombre, edad, dueno, sexo, peso);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String obtenerTipoAnimal() {
        return "mojarras";
    }

    public String getTipoAgua() {
        return tipoAgua;
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
        System.out.println("Tipo de Agua: " + tipoAgua);
        System.out.println("Posición en la lista: " + posicion);
        System.out.println("-------------------------------");
    }
}