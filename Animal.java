import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
    protected String nombre;
    protected int edad;
    protected Dueno dueno;
    protected String sexo;
    protected int peso;

    public Animal(String nombre, int edad, Dueno dueno, String sexo, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
        this.sexo = sexo;
        this.peso = peso;
    }

    public abstract String obtenerTipoAnimal();

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y soy un " + obtenerTipoAnimal());
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public abstract void mostrarDetalles(int posicion);
}