import java.util.Scanner;

/**
 * Created by lzy on 2016/10/26.
 */
public class reverseInteger {
    public static void main(String args[]) {
        reverseInteger ri = new reverseInteger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number ");
        int x = sc.nextInt();

        int result = ri.reverse(x);
        System.out.println(result);
    }

    public int reverse(int x) {
        long result = 0;
        int remainder;
        int flag = x>0 ? 1 : -1;
        x = Math.abs(x);

        for (; x > 0; x = x / 10) {
            remainder = x % 10;
            result = result * 10 + remainder;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result * flag;
    }
}
