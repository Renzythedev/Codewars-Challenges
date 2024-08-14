package challenge3;

import java.util.LinkedHashMap;
import java.util.Map;

public final class FirstNonRepeatingLetter {

    public static String firstNonRepeatingLetter(String word) {
        Map<Character, Integer> characterRepeatingMap = new LinkedHashMap<>();

        word.chars().forEach(c -> {
            char lowerCaseChar = Character.toLowerCase((char) c);
            characterRepeatingMap.put(lowerCaseChar, characterRepeatingMap.getOrDefault(lowerCaseChar, 0) + 1);
        });

        for (char c : word.toCharArray()) {
            if (characterRepeatingMap.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }

        return " ";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("Helllooo World")); // out: H
    }
}
