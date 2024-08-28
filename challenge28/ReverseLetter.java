package challenge28;

public final class ReverseLetter {

    public static String reverse(String input) {
        StringBuilder resultBuilder =new StringBuilder();

        for (int i = input.length(); i > 0; i--) {
            if (Character.isLetter(input.charAt(i -1)))
                resultBuilder.append(input.charAt(i -1));
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("krishan"));
        System.out.println(reverse("ultr53o?n"));
    }
}
