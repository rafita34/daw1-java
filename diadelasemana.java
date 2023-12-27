import java.util.Scanner;

public class diadelasemana {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número del 1 al 7
        System.out.print("Por favor, introduzca un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();

        // Utilizar la instrucción switch para  el nombre del día
        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                // Mostrar un mensaje si el número se pasa de la semana
                System.out.println("Error: El número debe estar entre 1 y 7.");
        }

       
        scanner.close();
    }
}


