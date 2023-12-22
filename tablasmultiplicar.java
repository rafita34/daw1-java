import java.util.Scanner;

public class tablasmultiplicar {
    public static void main(String[] args) {
        // Crear un objeto para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número del 1 al 10
        System.out.print("Introduzca un número [1-10]: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}





