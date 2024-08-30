package challenge32;

import java.util.Arrays;

public final class SuperMarketQueue {

    public static int queueTime(int [] customers, int n) {
        int[] tills = new int[n];

        for (int i : customers) {
            tills[0] += i;
            Arrays.sort(tills);
        }

        return tills[tills.length -1];
    }

    public static void main(String[] args) {
        System.out.println(queueTime(new int[]{5, 3, 4}, 1)); // 12
        System.out.println(queueTime(new int[]{10, 2, 3, 3}, 2)); // 10
        System.out.println(queueTime(new int[]{2, 3, 10}, 2)); // 12
    }
}
