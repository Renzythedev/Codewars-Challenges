package challenge20;

import java.util.ArrayList;
import java.util.List;

public final class DigitTier{

    public static List<Integer> tier(int input) {
        List<Integer> list = new ArrayList<>();

        final String inputAsStr = String.valueOf(input);

        int result = 0;
        for (char c : inputAsStr.toCharArray()) {
            if (result == 0) {
                result = c - '0';
                list.add(result);
                continue;
            }

            String resultStr = String.valueOf(result) + c;
            result = Integer.valueOf(resultStr);
            list.add(result);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(tier(4020));
        System.out.println(tier(50102));
    }
}
