package challenge10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class HighAndLow {

    public static String highAndLow(String numberArray) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : numberArray.split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        int highest = numbers.get(0);
        int lowest = numbers.get(0);
        for (int i : numbers) {
            if (i > highest)
                highest = i;
            else if (i < lowest)
                lowest =i;
        }

        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // out: "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // out: "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5")); // out: "9 -5"
    }
}
