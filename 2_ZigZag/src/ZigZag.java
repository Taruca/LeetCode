/**
 * Created by liu on 2016/10/24.
 */
public class ZigZag {
    public static void main(String args[]) {
        ZigZag newZigZag = new ZigZag();
        String str = newZigZag.convert("PAYPALISHIRING", 4);
        System.out.println(str);
    }

    public String convert(String s, int numRows) {
        int len = s.length();
        int step1, step2;
        StringBuilder result = new StringBuilder();
        if(numRows == 1) {
            return s;
        }

        for(int i = 0; i < numRows; i++) {
            step1 = 2 * (numRows - i - 1);
            step2 = 2 * i;

            int pos = i;
            if (pos < len) {
                result.append(s.charAt(pos));
            }
            while(pos < len) {
                pos += step1;
                if(pos < len) {
                    if (step1 > 0) {
                        result.append(s.charAt(pos));
                    }
                } else {
                    break;
                }

                pos += step2;
                if(pos < len) {
                    if (step2 > 0) {
                        result.append(s.charAt(pos));
                    }
                } else {
                    break;
                }
            }
        }
        return result.toString();
    }
}
