import java.util.Scanner;

public class secuencia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números a introducir
        System.out.print("Introduce la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        // Solicitar al usuario que introduzca los números
        System.out.println("Introduce los números (uno por uno):");

        // Leer el primer número para comparar con los siguientes
        int numeroAnterior = scanner.nextInt();
        boolean ascendente = true;
        boolean descendente = true;

        // Iterar para leer el resto de los números
        for (int i = 1; i < cantidadNumeros; i++) {
            int numeroActual = scanner.nextInt();

            // Verificar si están en secuencia ascendente o descendente
            ascendente &= numeroActual >= numeroAnterior;
            descendente &= numeroActual <= numeroAnterior;

            // Actualizar el número anterior para la próxima comparación
            numeroAnterior = numeroActual;
        }

        // Mostrar el resultado basado en las verificaciones
        if (ascendente) {
            System.out.println("Secuencia ascendente");
        } else if (descendente) {
            System.out.println("Secuencia descendente");
        } else {
            System.out.println("No hay secuencia");
        }

        scanner.close();
    }
}
