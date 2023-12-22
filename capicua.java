import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {
        Scanner juan = new Scanner (System.in);
        System.out.println("dame un numero");

        String num = juan.nextLine();

        StringBuilder reversed = new StringBuilder(num);
        reversed.reverse(); // aqui le damos la vuelta al string inicial que el usuario mete por teclado

        String numR = reversed.toString();
        // System.out.println(numR);

        if ( num.equals(numR) ) {
            System.out.println("el numero es capicuo");
        } else { 
            System.out.println("pues el numero no es capicuo");
        }

        juan.close();
    }
}
