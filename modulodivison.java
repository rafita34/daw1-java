public class modulodivison {
    public static void main(String[] args) {
        // Declarar dos variables enteras n1 y n2 con los valores 45 y 10, respectivamente
        int n1 = 45;
        int n2 = 10;

        // Realizar la división de n1 entre n2 y mostrar el resultado
        int division = n1 / n2
        ;
        System.out.println(n1 + " / " + n2 + " = " + division);

        // Realizar el cálculo del resto de la división de n1 entre n2 (módulo) y mostrar el resultado
        int modulo = n1 % n2;
        System.out.println(n1 + " % " + n2 + " = " + modulo);

        // Explicación adicional
        System.out.println("La operación '45 / 10' devuelve el cociente de la división.");
        System.out.println("La operación '45 % 10' devuelve el resto de la división.");

        // Utilidad: Determinar si un número es par o impar
        System.out.println("El resultado del módulo (resto) se puede utilizar para determinar si un número es par o impar:");
        System.out.println("Si el resultado del módulo es 0, el número es par. Si es diferente de 0, el número es impar.");
    }
}

