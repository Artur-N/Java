// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package Sem3;

public class Task_8 {
    static int[][] board;
    static int maxMove;
    static int[] x;
    static int[] y;

    public static void main(String[] args) {
        int n = 5;
        board = new int[n][n];
        x = new int[] { 0, 1, 1, -1, -1, 2, 2, -2, -2 };
        y = new int[] { 0, 2, -2, 2, -2, 1, -1, 1, -1 };
        maxMove = board.length * board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (checkChess(i, j, 1)) {
                    print();
                    System.out.println("______________________");
                    board = new int[n][n];
                }
                System.out.println();
            }
        }
        System.out.println("Решения нет");
    }

    private static void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.printf("%1d\t", board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkChess(int curX, int curY, int numMove) {
        board[curX][curY] = numMove;
        if (numMove >= maxMove)
            return true;

        for (int i = 0; i < x.length && i < y.length; i++) {
            int nextX = curX + x[i];
            int nextY = curY + y[i];
            if (borders(nextX, nextY) && checkChess(nextX, nextY, numMove + 1)) {
                return true;
            }
        }
        board[curX][curY] = 0;
        return false;
    }

    public static boolean borders(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] == 0;
    }
}
