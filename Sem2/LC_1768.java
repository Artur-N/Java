package Sem2;

public class LC_1768 {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "pqrs";
        System.out.println(mergeAlternately(str1, str2));
    }

    // public static String mergeAlternately(String word1, String word2) {
    //     int s = word1.length();
    //     int d = word2.length();
    //     String merge = "";

    //     while (d != s) {
    //         if (s > d) {
    //             word2 += " ";
    //             d++;
    //         }
    //         if (s < d) {
    //             word1 += " ";
    //             s++;
    //         }
    //     }

    //     for (int i = 0; i < word2.length(); i++) {
    //         merge = merge + word1.charAt(i) + word2.charAt(i);
    //     }
    //     merge = merge.replace(" ", "");
    //     return merge;
    // }
    public static String mergeAlternately(String word1, String word2) {
        int ptr1 = 0;
        int ptr2 = 0;
        StringBuilder res = new StringBuilder();
        while (ptr1 < word1.length() && ptr2 < word2.length()) {
            res.append(word1.charAt(ptr1));
            res.append(word2.charAt(ptr2));
            ptr1++;
            ptr2++;

        }
        System.out.println(res);
        
        while (ptr1 < word1.length()) {
            res.append(word1.charAt(ptr1));
            ptr1++;
        }
        System.out.println(res);
        while (ptr2 < word2.length()) {
            res.append(word2.charAt(ptr2));
            ptr2++;
        }
        System.out.println(res);

        return res.toString();
    }
}

