import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2000][2000];
        int offset = 1000;

        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            marking(arr, 1, x1, y1, x2, y2);
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        marking(arr, 2, x1, y1, x2, y2);

        int result = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    private static void marking(int[][] arr, int m, int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                arr[i][j] = m;
            }
        }
    }
}