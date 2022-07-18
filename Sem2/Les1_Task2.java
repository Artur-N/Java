//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат - a4b3cd2

package Sem2;

public class Les1_Task2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(compressStr(s));
    }

    public static String compressStr(String str) {
        int count = 1;
        char t = str.charAt(0);
        String res = "";
        for (int i = 1; i < str.length(); i++) {
            if (t != str.charAt(i)) {
                res = res + t;
                t = str.charAt(i);
                if (count != 1) {
                    res = res + count;
                }
                count = 0;
            }
            count++;
        }
        // res = res + t + count;
        return res + t + count;
    }
}