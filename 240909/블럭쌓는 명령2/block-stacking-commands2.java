import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = 0;
        int[] block = new int[N];
        for (int i = 0; i < K; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                block[j] += 1;
                result = Math.max(block[j], result);
            }
        }

        System.out.println(result);
    }
}