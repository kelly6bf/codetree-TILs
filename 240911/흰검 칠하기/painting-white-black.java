import java.util.*;

public class Main {

    private static final int MAX_N = 1000;
    private static final int MAX_X = 100;;
    private static final int OFFSET = MAX_N * MAX_X;

    private static final int WHITE_COUNT_INDEX = 0;
    private static final int BLACK_COUNT_INDEX = 1;
    private static final int CURRENT_COLOR_INDEX = 2;

    private static final int WHITE = 1;
    private static final int BLACK = 2;
    private static final int GRAY = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] blocks = new int[(MAX_N * MAX_X) * 2 + 1][3];
        int current = 0;
        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            for (int j = 0; j < distance; j++) {
                if (direction == 'R') {
                    current = (j == 0) ? current : current + 1;
                    if (isGray(blocks, current)) {
                        continue;
                    }
                    blocks[current + OFFSET][CURRENT_COLOR_INDEX] = BLACK;
                    blocks[current + OFFSET][BLACK_COUNT_INDEX] += 1;
                } else {
                    current = (j == 0) ? current : current - 1;
                    if (isGray(blocks, current)) {
                        continue;
                    }
                    blocks[current + OFFSET][CURRENT_COLOR_INDEX] = WHITE;
                    blocks[current + OFFSET][WHITE_COUNT_INDEX] += 1;
                }

                if (blocks[current + OFFSET][WHITE_COUNT_INDEX] >= 2 && blocks[current + OFFSET][BLACK_COUNT_INDEX] >= 2) {
                    blocks[current + OFFSET][CURRENT_COLOR_INDEX] = GRAY;
                }
            }
        }

        int blackBlockCount = 0;
        int whiteBlockCount = 0;
        int grayBlockCount = 0;

        for (int[] block : blocks) {
            if (block[CURRENT_COLOR_INDEX] == BLACK) {
                blackBlockCount++;
            } else if (block[CURRENT_COLOR_INDEX] == WHITE) {
                whiteBlockCount++;
            } else if (block[CURRENT_COLOR_INDEX] == GRAY) {
                grayBlockCount++;
            }
        }

        System.out.println(whiteBlockCount + " " + blackBlockCount + " " + grayBlockCount);
    }

    private static boolean isGray(int[][] blocks, int current) {
        return blocks[current + OFFSET][CURRENT_COLOR_INDEX] == GRAY;
    }
}