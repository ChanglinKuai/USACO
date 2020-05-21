/*
ID: kuaicha1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

public class friday {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter("friday.out");



        int years = Integer.parseInt(in.readLine());
        int dayOfWeek = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] week = new int[7];

        for (int year = 1900; year <= 1900 + (years - 1); year++) {

            if (isLeap(year)) {
                months[1] = 29;
            } else {
                months[1] = 28;
            }

            for (int month = 0; month < months.length; month++) {

                for (int day = 1; day <= months[month]; day++) {

                    if (day == 13) {
                        week[(dayOfWeek + 2) % 7]++;
                    }
                    //System.out.println(year + " " + (month + 1) + " " + day + " " + (dayOfWeek + 1));

                    dayOfWeek = (dayOfWeek + 1) % 7;

                }
            }
        }

        for (int i = 0; i < week.length; i++) {
            sb.append(week[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        out.println(sb.toString());
        out.close();
    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }


}