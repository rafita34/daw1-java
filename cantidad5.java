import java.util.Scanner;

public class cantidad5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // al usuario que ingrese un número entre 1 y 1.000.000
        System.out.print("Introduce un numero (1-1.000.000): ");
        int numero = scanner.nextInt();

        // Contador para tener la cantidad de dígitos 5
        int contador = 0;

        // Utilizar un bucle while para contar los dígitos 5
        while (numero < 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Verificar si el dígito es 5 e aumentar el contador
            if (digito == 5) {
                contador++;
            }

            // Eliminar el último número
            numero = numero / 10;
        }

        // Mostrar la cantidad de dígitos 5 en el número ingresado
        System.out.println(contador);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
