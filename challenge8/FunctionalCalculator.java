package challenge8;

import java.util.function.Function;

public final class FunctionalCalculator {

    public static Function<Function<Integer, Integer>, Integer> zero = (f) -> f.apply(0);
    public static Function<Function<Integer, Integer>, Integer> one = (f) -> f.apply(1);
    public static Function<Function<Integer, Integer>, Integer> two = (f) -> f.apply(2);
    public static Function<Function<Integer, Integer>, Integer> three = (f) -> f.apply(3);
    public static Function<Function<Integer, Integer>, Integer> four = (f) -> f.apply(4);
    public static Function<Function<Integer, Integer>, Integer> five = (f) -> f.apply(5);
    public static Function<Function<Integer, Integer>, Integer> six = (f) -> f.apply(6);
    public static Function<Function<Integer, Integer>, Integer> seven = (f) -> f.apply(7);
    public static Function<Function<Integer, Integer>, Integer> eight = (f) -> f.apply(8);
    public static Function<Function<Integer, Integer>, Integer> nine = (f) -> f.apply(9);

    public static Function<Integer,Integer> RETURN_BACK_FUNCTION = (v) -> v;

    public static Function<Integer, Integer> plus(Function<Function<Integer, Integer>, Integer> y) {
        return (x) -> x + y.apply(RETURN_BACK_FUNCTION);
    }

    public static Function<Integer, Integer> minus(Function<Function<Integer, Integer>, Integer> y) {
        return (x) -> x - y.apply(RETURN_BACK_FUNCTION);
    }

    public static Function<Integer, Integer> times(Function<Function<Integer, Integer>, Integer> y) {
        return (x) -> x * y.apply(RETURN_BACK_FUNCTION);
    }

    public static Function<Integer, Integer> dividedBy(Function<Function<Integer, Integer>, Integer> y) {
        return (x) -> x / y.apply(RETURN_BACK_FUNCTION);
    }

    public static void main(String[] args) {
        System.out.println(one.apply(times(seven)));
        System.out.println(seven.apply(dividedBy(two)));
        System.out.println(seven.apply(plus(two)));
        System.out.println(seven.apply(minus(five)));
    }
}
