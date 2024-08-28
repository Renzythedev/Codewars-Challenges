package challenge22;

public final class BetweenExtremes {

    public static int m(int... array) {
        int smallest = array[0];
        int highest = 0;

        for (int i : array) {
            if (i < smallest)
                smallest = i;
            if (i > highest) {
                highest = i;
            }
        }

        return highest - smallest;
    }

    public static void main(String[] args) {
        System.out.println(m(23, 3, 19, 21, 16));
    }
}
