import java.util.ArrayList;
import java.util.Scanner;
public class App {
    Controlador con = new Controlador();
    public static void main(String[] args) throws Exception {
        //arraylist de tipo persona
        ArrayList<Persona> personas = new ArrayList<Persona>();
        //creamos un objeto de tipo persona
        Persona p1 = new Persona("Juan", 25, 1.75, 75);
        //agregamos el objeto al arraylist
        personas.add(p1);
        //creamos un objeto de tipo persona
        Persona p2 = new Persona("Maria", 30, 1.60, 60);
        //agregamos el objeto al arraylist
        personas.add(p2);

        //recorremos el arraylist
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Estatura: " + persona.getEstatura());
            System.out.println("Peso: " + persona.getPeso());
            System.out.println("-------------------------------");
        }

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Añadir persona");
            System.out.println("2. Eliminar persona por nombre");
            System.out.println("3. Ver personas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad de la persona: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese la estatura de la persona: ");
                    double estatura = scanner.nextDouble();
                    System.out.print("Ingrese el peso de la persona: ");
                    double peso = scanner.nextDouble();
                    Persona nuevaPersona = new Persona(nombre, edad, estatura, peso);
                    personas.add(nuevaPersona);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                            personas.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Personas:");
                    for (Persona persona : personas) {
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("Edad: " + persona.getEdad());
                        System.out.println("Estatura: " + persona.getEstatura());
                        System.out.println("Peso: " + persona.getPeso());
                        System.out.println("-------------------------------");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();

        System.out.println("Hasta luego!");
    }
}

