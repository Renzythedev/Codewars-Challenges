package challenge4;

import java.util.Arrays;

public final class challenge4 {

    public static long nextSmaller(long n) {
        char[] digits = Long.toString(n).toCharArray();

        int i;
        for (i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i])
                break;
        }
        if (i == 0)
            return -1;

        int x = digits[i - 1];
        int smallest = i;
        for(int j = i + 1; j < digits.length; j++) {
            if (digits[j]< x && digits[j] >digits[smallest])
                smallest = j;
        }

        char c = digits[i -1];
        digits[i -1] = digits[smallest];
        digits[smallest] = c;

        long result = Long.parseLong(new String(digits));

        return (result < n) ? result : -1;
    }

    public static void main(String[] args) {
        System.out.println(nextSmaller(531));
        System.out.println(nextSmaller(9));
        System.out.println(nextSmaller(2071));
        System.out.println(nextSmaller(1111));
    }

}
