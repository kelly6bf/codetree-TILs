import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt();
        int startMin = sc.nextInt();
        int endHour = sc.nextInt();
        int endMin = sc.nextInt();

        System.out.println(calTotalMin(endHour, endMin) - calTotalMin(startHour, startMin));
    }

    private static int calTotalMin(int hour, int min) {
        return (hour * 60) + min;
    }
}