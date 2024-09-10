import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lineLength = (n * 20) + 1;
        int[] rightFlow = new int[lineLength];
        int[] leftFlow = new int[lineLength];
        int current = lineLength / 2;

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char command = sc.next().charAt(0);
            
            int direction = (command == 'L') ? -1 : 1;
            for (int j = 0; j < distance; j++) {
                if (direction == 'L') {
                    leftFlow[current] += 1;
                } else {
                    rightFlow[current] += 1;
                }
                current += direction;
            }
        }

        int result = 0;
        for (int i = 0; i < lineLength; i++) {
            if (leftFlow[i] >= 2 || rightFlow[i] >= 2)
                result++;
        }

        System.out.println(result);
    }
}