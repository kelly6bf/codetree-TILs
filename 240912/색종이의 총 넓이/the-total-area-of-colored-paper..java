import java.util.*;

public class Main {

    private static final int MAX_SIZE = 200;
    private static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[MAX_SIZE][MAX_SIZE];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            marking(arr, row, col);
        }

        int result = 0;
        for (int[] row : arr) {
            for (int col : row) {
                result += (col == 1) ? 1 : 0;
            }
        }

        System.out.println(result);
    }

    private static void marking(int[][] arr, int row, int col) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[row + OFFSET + i][col + OFFSET + j] = 1;
            }
        }
    }
}