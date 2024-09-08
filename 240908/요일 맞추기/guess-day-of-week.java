import java.util.*;

public class Main {

    public static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] weeks = new String[]{"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String result = weeks[(calTotalDays(m2, d2) % 7) + 1];
        System.out.println(result);
    }

    private static int calTotalDays(int m, int d) {
        int result = 0;
        for (int i = 0; i < m; i++) {
            result += days[i];
        }

        return result + d;
    }
}