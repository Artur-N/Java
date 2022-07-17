package Sem1;

public class DZ1_Task3 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(1245));
    }

    public static int subtractProductAndSum(int n) {
        int mult = 1;
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            mult *= a;
            sum += a;
            n = n / 10;
        }
        return mult - sum;
    }
}