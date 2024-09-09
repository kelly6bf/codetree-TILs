import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[100];
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start - 1; j <= end - 1; j++) {
                line[j] += 1;
                result = Math.max(line[j], result);
            }
        }

        System.out.println(result);
    }
}