import java.util.Scanner;

public class horadia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una hora del día
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        int hora = scanner.nextInt();

        // Verificar si la hora está en el rango correcto (0-23)
        if (hora >= 0 && hora <= 23) {
            // Determinar el saludo según la hora
            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos días");
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        } else {
            // Mostrar un mensaje si la hora no está en el rango correcto
            System.out.println("La hora introducida no es correcta.");
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}


    

