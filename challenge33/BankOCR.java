package challenge33;

import java.util.HashMap;
import java.util.Map;

public final class BankOCR {

    private static final Map<String,String> DIGIT_MAP = new HashMap<>();

    static {
        DIGIT_MAP.put(" _ | ||_|", "0");
        DIGIT_MAP.put("     |  |", "1");
        DIGIT_MAP.put(" _  _||_ ", "2");
        DIGIT_MAP.put(" _  _| _|", "3");
        DIGIT_MAP.put("   |_|  |", "4");
        DIGIT_MAP.put(" _ |_  _|", "5");
        DIGIT_MAP.put(" _ |_ |_|", "6");
        DIGIT_MAP.put(" _   |  |", "7");
        DIGIT_MAP.put(" _ |_||_|", "8");
        DIGIT_MAP.put(" _ |_| _|", "9");
    }

    public static String parse(String account) {
        String[] lines = account.split("\n");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<lines[0].length(); i+=3) {
            String digit =
                    lines[0].substring(i,i+3) +
                    lines[1].substring(i,i+3) +
                    lines[2].substring(i,i+3);

            result.append(DIGIT_MAP.getOrDefault(digit,"?"));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String account1 =
                "    _  _     _  _  _  _  _ \n" +
                        "  | _| _||_||_ |_   ||_||_|\n" +
                        "  ||_  _|  | _||_|  ||_| _|\n";

        String account2 =
                " _  _  _  _  _  _  _  _  _ \n" +
                        "| | _| _|| ||_ |_   ||_||_|\n" +
                        "|_||_  _||_| _||_|  ||_| _|\n";

        //wrong
        String account3 =
                " _  _  _  _  _  _  _  _  _ \n" +
                        "| _ _| _|| ||_ |_   ||_||_|\n" +
                        "|_||_  _||_| _||_|  ||_| _|\n";

        System.out.println(parse(account1));
        System.out.println(parse(account2));
        System.out.println(parse(account3));
    }
}
