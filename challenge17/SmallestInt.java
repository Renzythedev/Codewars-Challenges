package challenge17;

public final class SmallestInt {

    public static int findSmallestInt(int... nums){
        int smallest = nums[0];
        for (int i : nums) {
            if (i < smallest)
                smallest = i;
        }

        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(-1,2,4,-2,5,0));
    }


}
