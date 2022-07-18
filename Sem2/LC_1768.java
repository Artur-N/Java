package Sem2;

public class LC_1768 {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "pqrs";
        System.out.println(mergeAlternately(str1, str2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int s = word1.length();
        int d = word2.length();
        String merge = "";

        while (d != s) {
            if (s > d) {
                word2 += " ";
                d++;
            }
            if (s < d) {
                word1 += " ";
                s++;
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            merge = merge + word1.charAt(i) + word2.charAt(i);
        }
        merge = merge.replace(" ", "");
        return merge;
    }

}
