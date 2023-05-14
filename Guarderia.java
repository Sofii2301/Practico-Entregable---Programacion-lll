import java.util.ArrayList;
import java.util.Scanner;

public class Guarderia {
    private static ArrayList<Animal> animales = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarAnimal(scanner);
                    break;
                case 2:
                    retirarAnimal(scanner);
                    break;
                case 3:
                    int cantidadAnimales = calcularCantidadAnimales();
                    System.out.println("La cantidad de animales actualmente en la guardería es: " + cantidadAnimales);
                    break;
                case 4:
                    listarAnimales();
                    break;
                case 5:
                    hacerSaludarAnimales();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida del menú.");
                    break;
            }
        } while (opcion != 0);
    }
    private static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Ingresar animal a la guardería");
        System.out.println("2. Retirar animal de la guardería");
        System.out.println("3. Calcular cantidad de animales en la guardería");
        System.out.println("4. Listar todos los animales con sus datos");
        System.out.println("5. Hacer saludar a todos los animales");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void ingresarAnimal(Scanner scanner) {
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del animal: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del dueño: ");
        String nombreDueno = scanner.nextLine();

        System.out.print("Ingrese el DNI del dueño: ");
        String dniDueno = scanner.nextLine();

        System.out.print("Ingrese la dirección del dueño: ");
        String direccionDueno = scanner.nextLine();

        Dueno dueno = new Dueno(dniDueno, nombreDueno, direccionDueno);

        System.out.print("Ingrese el sexo del animal (macho/hembra): ");
        String sexo = scanner.nextLine();

        System.out.print("Ingrese el peso del animal en gramos: ");
        int peso = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el tipo de animal (perro/gato/hamster/mojarrita): ");
        String tipoAnimal = scanner.nextLine();

        switch (tipoAnimal) {
            case "perro":
                System.out.print("Ingrese la raza del perro: ");
                String razaPerro = scanner.nextLine();
                Perro perro = new Perro(nombre, edad, dueno, sexo, peso, razaPerro);
                animales.add(perro);
                break;
            case "gato":
                Gato gato = new Gato(nombre, edad, dueno, sexo, peso);
                animales.add(gato);
                break;
            case "hamster":
                Hamster hamster = new Hamster(nombre, edad, dueno, sexo, peso);
                animales.add(hamster);
                break;
            case "mojarrita--":
                System.out.print("Ingrese el tipo de agua de la mojarrita (fría/tropical): ");
                String tipoAguaMojarrita = scanner.nextLine();
                Mojarritas mojarras = new Mojarritas(nombre, edad, dueno, sexo, peso, tipoAguaMojarrita);
                animales.add(mojarras);
                break;
            default:
                System.out.println("Tipo de animal inválido.");
                break;
        }

        System.out.println("El animal ha sido ingresado a la guardería.");
    }

    private static void retirarAnimal(Scanner scanner) {
        System.out.print("Ingrese la posición en la lista del animal que desea retirar: ");
        int posicion = scanner.nextInt();
        scanner.nextLine();

        if (posicion >= 1 && posicion <= animales.size()) {
            Animal animal = animales.get(posicion - 1);
            animales.remove(posicion - 1);
            System.out.println("El animal " + animal.getNombre() + " ha sido retirado de la guardería.");
        } else {
            System.out.println("La posición ingresada no es válida. Por favor, asegúrese de ingresar una posición válida en la lista de animales.");
        }
    }
    private static int calcularCantidadAnimales() {
        return animales.size();
    }

    private static void listarAnimales() {
        System.out.println("---- Animales actualmente en la guardería ----");

        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            animal.mostrarDetalles(i + 1);
        }
    }

    private static void hacerSaludarAnimales() {
        System.out.println("---- Haciendo saludar a todos los animales ----");

        for (Animal animal : animales) {
            animal.saludar();
        }
    }
}