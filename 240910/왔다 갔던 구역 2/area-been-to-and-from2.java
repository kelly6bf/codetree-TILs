import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lineLength = (n * 20) + 1;
        int[] line = new int[lineLength];
        int current = lineLength / 2;

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char command = sc.next().charAt(0);
            
            int direction = (command == 'L') ? -1 : 1;
            for (int j = 0; j < distance; j++) {
                current += direction; // 먼저 이동한 다음에
                line[current] += 1;
            }
        }

        int result = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] >= 2)
                result++;
        }

        System.out.println(result);
    }
}