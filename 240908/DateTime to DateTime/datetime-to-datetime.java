import java.util.*;

public class Main {

    public static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11);
        System.out.println((result >= 0) ? result : -1);
    }

}