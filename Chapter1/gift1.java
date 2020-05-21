/*
ID: kuaicha1
LANG: JAVA
TASK: gift1
*/
import java.util.*;
import java.io.*;

public class gift1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter("gift1.out");


        //read in the input
        int N = Integer.parseInt(in.readLine());

        //set up system
        int[] credit = new int[N];

        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = in.readLine();
        }
        String giver;
        while ((giver = in.readLine()) != null) {
            String [] str = in.readLine().split("\\s");
            int moneyToGive = Integer.parseInt(str[0]);
            int num = Integer.parseInt(str[1]);

            String[] receiver = new String[num];
            // int[] credit = new int[N];

            for (int i = 0; i < num; i++) {
                receiver[i] = in.readLine();

            }
            // for (int i = 0; i < num; i++) {
            //     String receiver = in.readLine();
            // }

            // calculate method
            credit = calculateCredit(credit, names, giver, moneyToGive, num, receiver);


        }
        //correspond with the names and output
        for (int j = 0; j < names.length; j++) {
            out.println(names[j] + " " + credit[j]);
        }
        out.close();


    }


    public static int[] calculateCredit(int[] credit, String[] names, String giver, int moneyToGive, int num, String[] receiver) {

        //int averageToEach = moneyToGive / num;

        for (int i = 0; i < names.length; i++) {

            if (names[i].equals(giver)) {
                if (num == 0) {
                    credit[i] = credit[i] - moneyToGive ;
                } else {
                    credit[i] = credit[i] - moneyToGive + moneyToGive % num;
                }
            }

            for (int j = 0; j < receiver.length; j++) {

                if (names[i].equals(receiver[j])) {
                    if(num == 0) {
                        continue;
                    } else {
                        credit[i] += (moneyToGive / num);
                    }
                }
            }

        }

        return credit;
    }


}