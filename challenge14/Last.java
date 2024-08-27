package challenge14;

import java.util.Arrays;
import java.util.List;

public final class Last {

    public static String getLast(String s) {
        return String.valueOf(s.charAt(s.length() -1));
    }

    public static <T> T getLast(List<T> list){
        return list.getLast();
    }

    public static <T> T getLast(T... args){
        return args[args.length -1];
    }


    public static void main(String[] args) {
        System.out.println(getLast("xyz"));
        System.out.println(getLast(Arrays.asList(1,2,3,4)));
        System.out.println(getLast(3,4,6,2));
    }
}
