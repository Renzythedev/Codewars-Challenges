package challenge27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class ListFilter {

    public static List<Integer> filter(List<Object> list) {
        List<Integer> resultList = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof Integer)
                resultList.add((Integer) o);
        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(filter(Arrays.asList("213",343,"aasd",45, new ArrayList<>())));
    }
}
