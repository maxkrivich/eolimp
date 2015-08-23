
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = Integer.parseInt(in.next());
        int[][] arr = new int[n][n];
        for (int[] row : arr) {
            Arrays.fill(row, 0);
        }
        while(m-- > 0){
            int i = in.nextInt() - 1, j = in.nextInt() - 1;
            arr[i][j] = 1;
            arr[j][i] = 1;
        }
        for(int i = 0; i< n; i++){
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println("");
        }

    }

}
