package Sem1;

public class DZ1_1 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(1234));
    }

    public static int subtractProductAndSum(int n) {
        int mult = 1;
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            mult = mult * a;
            sum = sum + a;
        }
        int res = mult - sum;
        return res;
    }
}