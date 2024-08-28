package challenge24;

public final class ExpressionMatter {

    public static int findMaxValue(int a, int b, int c) {
        final int result1 = a + b + c;
        final int result2 = a * b * c;
        final int result3 = (a * b) + c;
        final int result4 = a + (b * c);
        final int result5 = (a + b) * c;
        final int result6 = a * (b + c);

        return Math.max(result1, Math.max(result2,Math.max(result3,Math.max(result4,Math.max(result5,result6)))));
    }

    public static void main(String[] args) {
        System.out.println(findMaxValue(1,1,1));
        System.out.println(findMaxValue(9,1,1));
    }
}
