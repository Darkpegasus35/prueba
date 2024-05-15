package Ejercicio4;

import java.util.Scanner;

/**
 * Esta es la clase principal, desde donde se inicia el programa.
 */
public class Main {
    /**
     * Método principal que solicita la edad al usuario, crea una instancia de Persona y llama al método calcularAñosHastaJubilacion.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Pedir la edad al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad en años: ");
        int edad = scanner.nextInt();

        // Crear una instancia de Persona con la edad ingresada
        Persona persona = new Persona(edad);

        // Calcular años hasta la jubilación y mostrar el mensaje correspondiente
        persona.calcularAñosHastaJubilacion();

        // Cerrar el scanner
        scanner.close();
    }
}
