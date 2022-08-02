// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Sem3;

public class Task_4 {
    public static void main(String[] args) {
        int n = 3;
        transferDisk(n, 'A', 'B', 'C');
    }

    public static void transferDisk(int disk, char tower1, char tower2, char tower3) {
        if (disk == 1) {
            System.out.println("Диск 1 переносим с башни " + tower1 + " на " + tower2);
            return;
        }

        transferDisk(disk - 1, tower1, tower3, tower2);
        System.out.printf("Диск %s переносим с башни %s на %s", disk, tower1, tower2);
        System.out.println();
        transferDisk(disk - 1, tower3, tower2, tower1);
    }

}
