import java.util.Scanner;

public class PowerOfTwo {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int num =scanner.nextInt();

       int currNum = 1;
       int i;
       for (i = 0; currNum < num; i++){
           currNum *= 2;
       }
       System.out.println(i);
   }
}
