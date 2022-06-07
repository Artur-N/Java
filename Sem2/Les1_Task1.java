//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
// (возвращает boolean значение)

package Sem2;

public class Les1_Task1 {
    public static void main(String[] args) {
        String s = "ababaabbaa";
        System.out.println(palindrom(s));
    }    
    public static boolean palindrom(String str) {
        int mid = str.length()/2;
        for (int i = 0; i < mid; i++) {
            System.out.println(str.charAt(i)); 
            System.out.println(str.charAt(str.length()-i-1));
            if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
}

