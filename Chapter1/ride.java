/*
ID: kuaicha1
LANG: JAVA
PROG: ride
 */
import java.util.*;
import java.io.*;

public class ride {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter("ride.out");

        String comet = in.readLine();
        String group = in.readLine();
        // Scanner scanner = new Scanner(System.in);
        // String comet = scanner.nextLine();
        // String group = scanner.nextLine();

        if (convertNum(comet) == convertNum(group)) {
            //System.out.println("GO");
            out.println("GO");
        } else {
            //System.out.println("STAY");
            out.println("STAY");
        }
        out.close();
    }

    public static int convertNum(String name) {
        int[] c = new int[name.length()];
        int product = 1;
        int result = 0;

        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            c[i] = a - 'A' + 1;
            product = product * c[i];
            result = product % 47;
        }
        return result;

    }
}
