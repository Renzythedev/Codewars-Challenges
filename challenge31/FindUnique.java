package challenge31;

import java.util.HashMap;
import java.util.Map;

public final class FindUnique {

    public static int find(int... arr){
        //number, count
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                result = entry.getKey();
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(find(1,2,3,1,1));
    }
}
