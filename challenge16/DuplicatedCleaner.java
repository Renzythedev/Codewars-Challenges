package challenge16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatedCleaner {

    public static <T> Set<T> clean(T... args) {
        Set<T> set = new HashSet<>();
        Collections.addAll(set,args);
        return set;
    }

    public static void main(String[] args) {
        System.out.println(clean(1,1,4,3,5,6,6,6,6,6,5,5,5,5,4));
    }
}
