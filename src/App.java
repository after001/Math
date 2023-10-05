import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        // Test the expression for n ranging from 1 to 100
        for (int n = 1; n <= 100; n++) {
            int resultado = n * n + n + 41;
            if (!isPrime(resultado)) {
                System.out.println("Contra-exemplo encontrado para n = " + n + ", resultado = " + resultado);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
