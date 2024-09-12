import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[200][200];
        int offset = 100;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;
            marking(arr, x1, y1, x2, y2);
        }

        int result = 0;
        for (int[] i : arr) {
            for (int j : i) {
                result += j;
            }
        }

        System.out.println(result);
    }

    private static void marking(int[][] arr, int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                arr[i][j] = 1;
            }
        }
    }
}