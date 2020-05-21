import java.util.*;

public class Prime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (isPrime(scanner.nextInt())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    static boolean isPrime(int n) {
        if (n <=1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
}