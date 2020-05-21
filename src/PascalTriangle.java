import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i=0; i<N; i++){
            int[][] num = new int[N][i+1];
            for (int j=0; j<i+1; j++){
                num[i][0] = 1;num[i][i]=1;
                if (i>=2 && j!=0 && j!=i){
                    num[i][j] = num[i-1][j-1] + num[i-1][j];
                }
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

