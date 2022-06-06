package Sem1;

public class DZ1_Task2 {
    public static void main(String[] args) {
        prob(3, 2);
    }
    public static void prob(int k, int n) {
        for (int i = 0; i < k ; i++) {
            for (int j = 0; j < k; j++) {
                System.out.format("%d, %d", j, i);
            }
        }
    }
}

