package challenge18;

import java.util.Arrays;
import java.util.List;

public final class TheHighest {

    public static List<Integer> f(int... array) {
        int smallest = array[0];
        int highest = 0;

        for (int i : array) {
            if (i > highest)
                highest = i;

            if (i < smallest) {
                smallest = i;
            }
        }

        return Arrays.asList(smallest,highest);
    }

    public static void main(String[] args) {
        System.out.println(f(1));
    }
}
