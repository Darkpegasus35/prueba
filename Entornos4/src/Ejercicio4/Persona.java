package Ejercicio4;

/**
 * Clase que representa a una persona con la edad que introduzca el usuario
 */
public class Persona {
    /** La edad actual de la persona */
    private int edad;

    /**
     * Constructor para inicializar una persona con la edad.
     * @param edad La edad de la persona.
     */
    public Persona(int edad) {
        this.edad = edad;
    }

    /**
     * Método para calcular los años restantes hasta la jubilación de la persona en función de su edad y mostrar un mensaje.
     */
    public void calcularAñosHastaJubilacion() {
        int añosRestantes = 67 - this.edad;
        if (añosRestantes < 10) {
            System.out.println("¡Solo te quedan " + añosRestantes + " años! ¡Vamos que ya queda poco!");
        } else if (añosRestantes > 20) {
            System.out.println("¡Te quedan " + añosRestantes + " años! ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + añosRestantes + " años para jubilarte.");
        }
    }
}
