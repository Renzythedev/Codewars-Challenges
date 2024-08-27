package challenge19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class DescendingOrder {

    public static int order(int input) {
        List<Integer> resultList = new ArrayList<>();

        for (char c : String.valueOf(input).toCharArray()) {
            resultList.add(c - '0');
        }

        resultList.sort(Comparator.comparingInt(i -> -i));

        String resultStr = "";

        for (int i : resultList) {
            resultStr += i;
        }

        return Integer.parseInt(resultStr);
    }

    public static void main(String[] args) {
        System.out.println(order(42145));
    }
}
