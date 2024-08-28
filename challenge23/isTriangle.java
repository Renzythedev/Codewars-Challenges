package challenge23;

public final class isTriangle {

    public static boolean check(int a,int b,int c){
        if (a <= 0 || b <= 0 || c <= 0)
            return false;

        return  (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        System.out.println(check(1,2,2));
    }
}
