package challenge7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class YourOrderPlease {

    public static String order(String s) {
        String[] splitedString = s.split(" ");
        Map<Integer,String> map = new HashMap<>();
        for (String word : splitedString) {

            for (char c : word.toCharArray()) {
                if (!Character.isDigit(c)) continue;
                map.put((int) c - '0',word);
            }
        }

        List<Integer> sortedIndex =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .map(Map.Entry::getKey)
                        .toList();

        String result = "";

        for (int i : sortedIndex) {
            result += map.get(i) + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
