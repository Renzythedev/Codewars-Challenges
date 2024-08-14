package challenge2;

import java.util.ArrayList;
import java.util.List;

public final class SplitString {

    public static List<String> split(String s) {
        if (! (s.length() % 2 == 0))
            s += "_";

        List<String> result = new ArrayList<>();

        for (int i = 0; i<s.length(); i +=2)
            result.add(s.substring(i,i+2));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(split("abc"));
        System.out.println(split("abcd"));
    }
}
