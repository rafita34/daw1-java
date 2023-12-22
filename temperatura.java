import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        
        // F = 32+ (9*C/5)

        Scanner manoloScanner = new Scanner(System.in);

        System.out.println("dame los grados celsius: ");
        float c = manoloScanner.nextFloat();

        float F = 32 + (9*c/5);

        System.out.println("Los grados Fahrenheit son " + F);

        manoloScanner.close();

    }
    
}
