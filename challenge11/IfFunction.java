package challenge11;

public final class IfFunction {

    public static void _if(boolean v,Runnable func1, Runnable func2) {
        if (v)
            func1.run();
        else
            func2.run();
    }

    public static void main(String[] args) {
        _if(true, () -> System.out.println("true"), () -> System.out.println("false"));
    }
}
