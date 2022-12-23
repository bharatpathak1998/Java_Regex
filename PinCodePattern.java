import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodePattern {

    public void isValidPinCode(String pinCode) {

        Pattern pattern = Pattern.compile("^[1-9][0-9]{2}\s?[0-9]{3}$");
        Matcher matcher = pattern.matcher(pinCode);

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Valid -> " + pinCode);
        } else {
            System.out.println("Invalid -> " + pinCode);
        }
    }

    public static void main(String[] args) {

        String[] array = {"400088", "A400088", "400088B", "400 088"};

        PinCodePattern pinCodePattern = new PinCodePattern();
        for (String pinCode : array) {
            pinCodePattern.isValidPinCode(pinCode);
        }
    }
}