// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package Sem2;

import java.util.ArrayList;
import java.util.List;

public class Les1_Task5 {
    static char[] textGlobal;
    static List<Integer> arrIndexGlobal;
    public static void main(String[] args) {
        ArrayList<Integer> arrIndex = new ArrayList<>();
        String s = "2? + ?5 = 6?";
        char[] sChar = s.replace(" ", "").toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == '+' || sChar[i] == '=') {
                sChar[i] = '-';
            }
            if (sChar[i] == '?') {
                arrIndex.add(i);
            }
        }
        textGlobal = sChar;
        arrIndexGlobal = arrIndex;

        combiWithRep(new int[arrIndex.size()], 0, 10);
    }

    public static void combiWithRep(int[] combi, int index, int K) {
        if (index == combi.length){
            checkCombi(combi);
            return;
        
        }

        for (int i = 0; i < K; i++) {
            combi[index] = i;
            combiWithRep(combi, index + 1, K);
        }
    }

    public static void checkCombi(int[] combi) {
        for (int i = 0; i < combi.length; i++) {
            textGlobal[arrIndexGlobal.get(i)] = Character.forDigit(combi[i], 10);
        }

        String[] numbers = String.valueOf(textGlobal).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }
}
