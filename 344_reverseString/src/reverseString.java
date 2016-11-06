import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lzy on 2016/11/6.
 */
public class reverseString {
    public static String reverseString(String s) {
        if (s == null) return null;
        if (s.equals("")) return s;

        int begin = 0;
        int end = s.length() - 1;
        char tmp;
        char[] chars = s.toCharArray();

        while (begin < end) {
            tmp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = tmp;
            begin++;
            end--;
        }

        return new String(chars);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a String.");
        String s = reverseString(sc.nextLine());

        System.out.println(s);
    }
}
