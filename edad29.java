// Siempre que necesitemos que el usuario ingrese algo por teclado, vamos a necesitar importar la libreria Scanner.
import java.util.Scanner;

public class edad29 {
    public static void main(String[] args) {
        // Como necesitamos que el usuario escriba cosas por teclado, necesitamos INSTANCIAR el objeto scanner.

        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario . Recordar el truquito de escribir 'sout'
        System.out.println("cuantos años tienes?: ");
        int edad = scanner.nextInt(); 

        // Limpiar el búfer del Scanner leyendo y descartando el resto de la línea
        scanner.nextLine();

        // Solicitar el peso al usuario.
        System.out.println("cuanto pesas?: ");
        float peso = scanner.nextFloat(); // Ingresa el peso con una COMA si tiene decimales! El punto no sirve en JAVA para decimales.

        // Voy a calcular edad nueva y sumar 1 año mas y el peso duplicarlo
        int edad_nueva = edad + 1;
        float peso_nuevo = peso * 2;

        // ahora vamos a ver el resultado
        System.out.println("la edad que tienes es " + edad +". al año siguiente tendras " + edad_nueva );
        System.out.println("dijiste que pesabas " + peso+". menos mal que no pesas "+ peso_nuevo);

        scanner.close();
    }
}
