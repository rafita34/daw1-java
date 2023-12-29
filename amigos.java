import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca dos números
        System.out.print("Introduce el primer número: ");
        int numeroA = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numeroB = scanner.nextInt();

        // Calcular la suma de los divisores de A y B
        int sumaDivisoresA = calcularSumaDivisores(numeroA);
        int sumaDivisoresB = calcularSumaDivisores(numeroB);

        /* Estilos de escritura
         * Pascal: SumaDivisoresA
         * camelCase: sumaDivisoresA
         * snake: suma-divisores-a
         * guiones_bajos: suma_divisores_a
         */

        // Verificar si los números son amigos
        if (sumaDivisoresA == numeroB && sumaDivisoresB == numeroA) {
            System.out.println("¡Los números " + numeroA + " y " + numeroB + " son amigos!");
        } else {
            System.out.println("Los números no son amigos.");
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }

    // Función para calcular la suma de los divisores de un número
    public static int calcularSumaDivisores(int numero) {
        int suma = 0;

        // Iterar desde 1 hasta numero/2 para encontrar los divisores
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i; // suma = suma + i
            }
        }

        // System.out.println(suma);

        return suma;
    }
}
