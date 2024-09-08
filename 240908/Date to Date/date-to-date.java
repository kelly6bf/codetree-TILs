import java.util.*;

public class Main {

    public static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.println(calTotalDays(m2, d2) - calTotalDays(m1, d1) + 1);
    }

    private static int calTotalDays(int m, int d) {
        int result = 0;
        for (int i = 1; i < m; i++) {
            result += days[i - 1];
        }

        return result += d;
    }
}