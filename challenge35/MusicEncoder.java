package challenge35;

import java.util.ArrayList;
import java.util.List;

public final class MusicEncoder {

    public static List<String> encode(int... arr)  {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {
            final int start = i;
            while (i < arr.length -1 && arr[i] == arr[i+1]) {
                i++;
            }
            if (i > start) {
                result.add(arr[start] + "*" + (i - start + 1));
                i++;
                continue;
            }

            while(i < arr.length - 2 && arr[i + 1]- arr[i] == arr[i + 2] - arr[i + 1]) {
                i++;
            }
            if (i > start + 1) {
                int interval = arr[start + 1] - arr[start];
                result.add(arr[start] + "-" + arr[i] + "/" + interval);
                i++;
                continue;
            }

            while (i < arr.length -1 && arr[i] + 1 == arr[i + 1]){
                i++;
            }

            if (i> start) {
                result.add(arr[start] + "-" + arr[i]);
                i++;
                continue;
            }


            result.add(String.valueOf(arr[i]));
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode(1,1,1,1,1,3,3,3,4,5,6,8,10,12,14,16,18,1));
    }
}
