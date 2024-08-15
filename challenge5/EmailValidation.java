package challenge5;

public final class EmailValidation {

    public static boolean validate(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String[] emailParts = email.split("@");

        if (emailParts.length != 2)
            return false;

        String localPart = emailParts[0];
        String domainPart = emailParts[1];

        if (localPart.isEmpty())
            return false;

        String[] domainParts = domainPart.split("\\.");
        if (domainParts.length < 2)
            return false;


        for (String part : domainParts) {
            if (part.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validate("arda.a@gmail.com")); // True
        System.out.println(validate("arda.a@.com"));     // False
        System.out.println(validate("arda.a@gmail"));    // False
        System.out.println(validate("arda.a@com."));    // False
    }
}
