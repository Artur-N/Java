package Sem1;

/* Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5: входные данные находятся в файле input.txt в виде a=10, b=3
Результат нужно сохранить в файле output.txt, 1000
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(degreePow(2, 3));
        System.out.println(degreePow(2, -2));
        System.out.println(degreePow(3, 0));
        System.out.println(degreePow(0, 5));
        System.out.println(degreePow(1, 5));
        System.out.println("======================");
        System.out.println(recPow(2, 3));
        System.out.println(recPow(2, -2));
        System.out.println(recPow(3, 0));
        System.out.println(recPow(0, 5));
        System.out.println(recPow(1, 5));
        System.out.println("======================");
        System.out.println(iterPow(2, 3));
        System.out.println(iterPow(2, -2));
        System.out.println(iterPow(3, 0));
        System.out.println(iterPow(0, 5));
        System.out.println(iterPow(1, 5));
    }

    public static double degreePow(double a, int b) {
    if (b == 0)
    return 1;
    if (a == 0 || a == 1)
    return a;

    if (b < 0) {
    b = -b;
    a = 1 / a;
    }
    double res = 1;
    for (int i = 0; i < b; i++) {
    res = a * res;
    }
    return res;
    }

    public static double recPow(double a, int b) {
    if (b == 0)
    return 1;
    if (b < 0)
    return recPow(1 / a, -b);

    double res = recPow(a, b / 2);
    if (b % 2 == 0)
    return res * res;
    else
    return res * res * a;
    }

    public static double iterPow(double a, int b) {
        if (b == 0) return 1;
        if (a == 0 || a == 1) return a;

        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
            
        double result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result *= a;
            }
            b = b / 2;
            a *= a;
        }
        return result;
    }
}
