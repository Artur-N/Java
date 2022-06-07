/*Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"*/

package Sem1;

import java.util.Arrays;

public class DZ1_Task2 {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        int[] array = new int[n];
        prob(k, array, 0);
    }

    public static void prob(int k, int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < k; i++) {
            arr[index] = i;
            prob(k, arr, index + 1);
        }
    }
}
