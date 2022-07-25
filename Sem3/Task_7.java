// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

package Sem3;

public class Task_7 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];

        if (!checkChess(board, 0)) {
            System.out.println("Решения нет");
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkPos(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public static boolean checkChess(int[][] board, int col) {
        if (col >= board.length)
            return true;

        for (int i = 0; i < board.length; i++) {
            if (checkPos(board, i, col)) {
                board[i][col] = 1;

                if (checkChess(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
}
