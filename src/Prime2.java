import java.util.*;
import java.io.*;

public class Prime2 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("Prime2.in"));
        PrintWriter out = new PrintWriter("Prime2.out");

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();

        int N = Integer.parseInt(in.readLine());
        int count = 0;

        for (int num = 2; count < N; num++) {

            boolean isPrime = true;

            for (int i=2; i <= num/2; i++) {
                if ( num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime ) {
                if (count == 0) {
                    out.print(num);
                    //System.out.print(num);
                    count++;
                } else {
                    //System.out.print( " " + num);
                    out.print( " " + num);
                    count++;
                }
            }

        }

        out.close();
    }
}