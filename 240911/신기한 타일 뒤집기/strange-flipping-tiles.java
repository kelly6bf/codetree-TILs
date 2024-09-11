import java.util.*;

public class Main {

    private static final int MAX_N = 1000;
    private static final int MAX_X = 100;
    private static final int OFFSET = MAX_N * MAX_X;

    private static final int WHITE = 1;
    private static final int BLACK = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tiles = new int[MAX_N * MAX_X * 2 + 1];
        int current = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            int direction = sc.next().charAt(0);

            for (int j = 0; j < distance; j++) {
                if (direction == 'R') {
                    current = (j == 0) ? current : current + 1;
                    tiles[current + OFFSET] = BLACK;
                } else {
                    current = (j == 0) ? current : current - 1;
                    tiles[current + OFFSET] = WHITE;
                }
            }
        }

        int whiteTilesCount = 0;
        int blackTilesCount = 0;
        for (int tile : tiles) {
            if (tile == WHITE) {
                whiteTilesCount++;
            } else if (tile == BLACK) {
                blackTilesCount++;
            }
        }

        System.out.println(whiteTilesCount + " " + blackTilesCount);
    }
}