package challenge30;

public final class isAlternate {

    public static boolean isAlt(String s) {
        if (s.isEmpty()) return true;
        String vowels = "aeiou";

        boolean passed = vowels.contains(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            String currChar = String.valueOf(s.charAt(i));
            boolean currCharIsVowel = vowels.contains(currChar);

            if (currCharIsVowel == passed) {
                return false;
            }

            passed = currCharIsVowel;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAlt("apple"));
        System.out.println(isAlt("amazon"));
        System.out.println(isAlt("banana"));
    }
}
