package challenge29;

public final class TrailingZeros {

    public static int n(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        String factorialStr = String.valueOf(factorial);
        int result = 0;
        for (int i = factorialStr.length(); i>0; i--) {
            char currChar = factorialStr.charAt(i -1);
            if (currChar - '0' == 0) {
                result++;
            }else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(n(6));
        System.out.println(n(12));
    }
}
