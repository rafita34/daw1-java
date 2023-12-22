import java.util.Scanner;

public class edad29_GPT {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Indica tu edad: ");
        int edad = scanner.nextInt();

        // Solicitar el peso al usuario
        System.out.print("Indica tu peso: ");
        double peso = scanner.nextDouble();

        // Calcular la edad con un año más y el doble del peso
        int nuevaEdad = edad + 1;
        double doblePeso = peso * 2;

        // Mostrar los resultados en una única línea
        System.out.println("Con un año más tendrás " + nuevaEdad + " años y el doble de tu peso sería " + doblePeso + " kg");

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
