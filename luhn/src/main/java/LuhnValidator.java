import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {
        // Scrub string
        candidate = candidate.replaceAll("\\s", "");
        // Toss out invalid strings
        if (candidate.length() <= 1 || candidate.matches(".*\\D.*")) {
            return false;
        }
        // Convert to digits and sum
        int[] digits = Arrays.stream(candidate.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int currentDigit = digits[i];
            if (currentDigit != 9) {
                digits[i] = (currentDigit * 2) % 9;
            }
        }
        return Arrays.stream(digits).sum() % 10 == 0;
    }

}
