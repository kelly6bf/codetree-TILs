import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] line = new int[200];
        int offset = 100;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start + offset; j < (end + offset); j++) {
                line[j] += 1;
                result = Math.max(line[j], result);
            }
        }

        System.out.println(result);
    }
}