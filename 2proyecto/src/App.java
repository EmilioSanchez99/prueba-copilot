import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Juan", 25, "H", 70, 1.75, "1234");
        Persona persona2 = new Persona("Ana", 30, "M", 60, 1.60, "1234");

        // mete las dos personas en un arrayList de personas
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al gimnasio");
        System.out.println("1. Entrar");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.next();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.next();

            boolean encontrado = false;
            for (Persona persona : personas) {
                if (persona.getNombre().equalsIgnoreCase(nombre)
                        && persona.getContraseña().equalsIgnoreCase(contraseña)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                Persona persona = null;
                for (Persona p : personas) {
                    if (p.getNombre().equalsIgnoreCase(nombre) && p.getContraseña().equalsIgnoreCase(contraseña)) {
                        persona = p;
                        break;
                    }
                }

                if (persona != null) {
                    boolean salir=true;
                    while (salir) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Calcular IMC");
                        System.out.println("2. Reservar clase de Zumba");
                        System.out.println("3. Ver clases reservadas");
                        System.out.println("4. Salir");

                        System.out.print("Ingrese su opción: ");
                        int opcionMenu = scanner.nextInt();

                        if (opcionMenu == 1) {
                            //  calcular el IMC
                            double imc = persona.calcularIMC();
                            System.out.println("Su IMC es: " + imc);
                        } else if (opcionMenu == 2) {
                            // Código para reservar clase de Zumba
                            System.out.println("Horarios disponibles para la clase de Zumba:");
                            HashMap<Integer, String> horarios = new HashMap<>();
                            horarios.put(1, "Lunes 18:00 - 19:00");
                            horarios.put(2, "Martes 20:00 - 21:00");
                            horarios.put(3, "Miércoles 17:00 - 18:00");
                            horarios.put(4, "Jueves 19:00 - 20:00");
                            horarios.put(5, "Viernes 16:00 - 17:00");

                            System.out.println("Horarios disponibles para la clase de Zumba:");
                            for (Map.Entry<Integer, String> entry : horarios.entrySet()) {
                                System.out.println(entry.getKey() + ". " + entry.getValue());
                            }

                            System.out.print("Seleccione un horario: ");
                            int opcionHorario = scanner.nextInt();

                            if (horarios.containsKey(opcionHorario)) {
                                String horarioSeleccionado = horarios.get(opcionHorario);
                                horarios.remove(opcionHorario);
                                System.out.println("Ha reservado la clase de Zumba para " + horarioSeleccionado);
                            } else {
                                System.out.println("Opción inválida. Por favor, seleccione un horario válido.");
                            }
                        } else if (opcionMenu == 3) {
                            // Código para ver clases reservadas
                            System.out.println("Clases reservadas:");
                            for (Map.Entry<Integer, String> entry : horarios.entrySet()) {
                                System.out.println(entry.getKey() + ". " + entry.getValue());
                            }
                        } else if (opcionMenu == 4) {
                            System.out.println("Saliendo del programa...");
                            salir = false;
                            break;
                        } else {
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                    }
                } else {
                    System.out.println("Lo siento, no estás registrado en el gimnasio.");
                }

            } else {
                System.out.println("Lo siento, no estás registrado en el gimnasio.");
            }
        } else if (opcion == 2) {
            System.out.println("Gracias por visitar el gimnasio. ¡Hasta luego!");
        } else {
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}
