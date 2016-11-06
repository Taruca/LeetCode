import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lzy on 2016/11/6.
 */
public class fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    list.add("FizzBuzz");
                } else {
                    list.add("Fizz");
                }
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number, ending with a Enter.");
        int n = sc.nextInt();
        List<String> list = fizzBuzz(n);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
