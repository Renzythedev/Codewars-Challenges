package challenge6;

public final class CamelCaseConverter {

    public static String toCamelCase(String s) {
        String convertedStr = s;
        if (s.contains("_") || s.contains("-")){
            convertedStr = s.replace('_', ' ').replace('-', ' ');
        }

        String[] words = convertedStr.split(" ");
        for (int i = 0; i<words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("The-Steal_Warrior"));
        System.out.println(toCamelCase("the-steal-warrior"));
        System.out.println(toCamelCase("the_steal_warrior"));
    }
}
