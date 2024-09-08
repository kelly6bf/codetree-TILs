import java.util.*;

public class Main { 

    private static final int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDays = calculateDaysFromZero(m2, d2) - calculateDaysFromZero(m1, d1);
        while (totalDays < 0) {
            totalDays += 7;
        }

        System.out.println(weeks[totalDays % 7]);
    }

    private static int calculateDaysFromZero(int m, int d) {
        int result = 0;
        for (int i = 1; i < m; i++) {
            result += days[i - 1];
        }

        return result + d;
    }
}