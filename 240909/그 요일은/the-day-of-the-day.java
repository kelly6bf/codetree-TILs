import java.util.*;

public class Main {

    private static final int[] DAYS = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] WEEKS = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine();
        String A = sc.nextLine();

        int diffDays = calculateTotalDays(m2, d2) - calculateTotalDays(m1, d1);
        int distanceToTargetWeek = (getDaysIndex(A) - getDaysIndex("Mon") + WEEKS.length) % WEEKS.length;

        int result = 0;
        if (diffDays >= distanceToTargetWeek) {
            result = ((diffDays - distanceToTargetWeek) / 7) + 1;
        } 

        System.out.println(result);
    }

    private static int calculateTotalDays(int m, int d) {
        int result = 0;
        for (int i = 1; i < m; i++) {
            result += DAYS[i - 1];
        }

        return result + d;
    }

    private static int getDaysIndex(String target) {
        for (int i = 0; i < WEEKS.length; i++) {
            if (WEEKS[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}