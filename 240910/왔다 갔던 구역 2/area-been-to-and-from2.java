import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] startPoints = new int[100];
        int[] endPoints = new int[100];
        int[] checked = new int[2000 + 1];
        int offset = 1000;
        int current = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            // if (direction == 'R') {
            //     startPoints[i] = current;
            //     endPoints[i] = current + distance;
            //     current += distance;
            // } else {
            //     startPoints[i] = current - distance;
            //     endPoints[i] = current;
            //     current -= direction;
            // }
            // startPoints[i] += offset;
            // endPoints[i] += offset;

            if (direction == 'L') {
                startPoints[i] = current - distance;
                endPoints[i] = current;
                current -= distance;
            } else {
                startPoints[i] = current;
                endPoints[i] = current + distance;
                current += distance;
            }
            startPoints[i] += offset;
            endPoints[i] += offset;

        }

        for (int i = 0; i < n; i++) {
            for (int j = startPoints[i]; j < endPoints[i]; j++) {
                checked[j]++;
            }
        }

        int result = 0;
        for (int i : checked) {
            if (i >= 2)
                result++;
        }

        System.out.println(result);
    }
}