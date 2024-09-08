import java.util.*;

public class Main {

    public static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int totalDays = calculateTotalDays(11, day) - calculateTotalDays(11, 11);
        int totalMin = calculateTotalMin(hour, min) -  calculateTotalMin(11, 11);
        int result = (totalDays * 24 * 60) + totalMin;

        System.out.println((result >= 0) ? result : -1);
    }

    private static int calculateTotalDays(int mon, int day) {
        int result = 0;
        for (int i = 1; i < mon; i++) {
            result += days[i - 1];
        }

        return result + day;
    }

    private static int calculateTotalMin(int hour, int min) {
        return (hour * 60) + min;
    }
}