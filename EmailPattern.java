import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {

    public void isValidEmail(String email) {

        Pattern pattern = Pattern.compile("(^[a-zA-Z0-9]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+[.]?[a-zA-Z]+[,]?$)");
        Matcher matcher = pattern.matcher(email);

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Valid -> " + email);
        } else {
            System.out.println("Invalid -> " + email);
        }
    }

    public static void main(String[] args) {

        String[] array = {"abc@bridgelabz.co.in", "abc@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                "abc.100@abc.com.au", "abc@1.com,", "abc@gmail.com.com", "abc+100@gmail.com", "abc", "abc@.com.my",
                "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        EmailPattern emailPattern = new EmailPattern();
        for (String email : array) {
            emailPattern.isValidEmail(email);
        }
    }
}