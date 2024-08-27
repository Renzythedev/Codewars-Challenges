package challenge21;

public final class SumOfSequence {

    public static int sum(int begin, int end, int step) {
        int result =0;
        for (int i = begin; i<=end; i+=step) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,2,2));
        System.out.println(sum(2,6,2));
        System.out.println(sum(1,5,1));
        System.out.println(sum(1,5,3));
    }
}
