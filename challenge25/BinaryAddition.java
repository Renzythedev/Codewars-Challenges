package challenge25;

public final class BinaryAddition {

    public static String toBinary(int a,int b) {
        return Integer.toBinaryString(a + b);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(5,9));
        System.out.println(toBinary(1,1));
    }
}
