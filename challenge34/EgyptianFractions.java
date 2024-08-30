package challenge34;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class EgyptianFractions {

    public static List<String> decompose(String nr, String dr) {
        BigInteger numerator = new BigInteger(nr);
        BigInteger denominator = new BigInteger(dr);
        List<String> result = new ArrayList<>();

        while (numerator.compareTo(BigInteger.ZERO) > 0) {
            if (denominator.mod(numerator).equals(BigInteger.ZERO)) {
                BigInteger unitFractionDemon = denominator.divide(numerator);
                result.add("1/" + unitFractionDemon);
                break;
            } else {
                BigInteger unitFractionDemon = denominator.divide(numerator).add(BigInteger.ONE);
                result.add("1/" + unitFractionDemon);
                numerator = numerator.multiply(unitFractionDemon).subtract(denominator);
                denominator = denominator.multiply(unitFractionDemon);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(decompose("3", "4"));  // Çıktı: [1/2, 1/4]
        System.out.println(decompose("1", "2"));  // Çıktı: [1/2]
        System.out.println(decompose("5", "6"));  // Çıktı: [1/2, 1/3]
        System.out.println(decompose("7", "12")); // Çıktı: [1/2, 1/12]
        System.out.println(decompose("21", "23")); // Çıktı: [1/2, 1/3, 1/13, 1/359, 1/644046]
    }
}
