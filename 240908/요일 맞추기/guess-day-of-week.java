import java.util.*;

public class Main {

    public static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diffDays = (calTotalDays(m2, d2)) - (calTotalDays(m1, d1));

        String result = weeks[(calTotalDays(m2, d2) % 8)];
        while (diffDays < 0) {
            diffDays += 7;
        }

        System.out.println(weeks[diffDays % 7]);
    }

    private static int calTotalDays(int m, int d) {
        int result = 0;
        for (int i = 1; i < m; i++) {
            result += days[i - 1];
        }

        return result + d;
    }
}