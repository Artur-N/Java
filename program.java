import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        var s = 123;
        var q = 123.123;
        var r = "fgd";
        System.out.println(getType(s));
        System.out.println(getType(q));
        System.out.println(getType(r));

        String f = "qwertb";
        // f.charAt(3);
        System.out.println(f.charAt(2));

        s = --s - s--;
        System.out.println(s);

        int[] arr = new int[] { 0, 1, 2, 3, 4, 5 };
        // arr[3] = 55;
        System.out.println(arr[3]);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.println(x);
        iScanner.close();

        System.out.println(sum(3, 5));
    }

    static String getType(Object z) {
        return z.getClass().getSimpleName();
    }

    static int sum(int a, int b) {
        return a + b;
    }

}


