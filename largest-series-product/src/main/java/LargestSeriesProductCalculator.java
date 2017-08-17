import java.util.Objects;

public class LargestSeriesProductCalculator {

    private final int[] digits;

    public LargestSeriesProductCalculator(String inputValue) {
        if (Objects.isNull(inputValue)) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        digits = new int[inputValue.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = inputValue.charAt(i) - '0';
            if (digits[i] < 0 || digits[i] > 9) {
                throw new IllegalArgumentException("String to search may only contains digits.");
            }
        }
    }

    public long calculateLargestProductForSeriesLength(int length) {
        if (length > digits.length) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (length < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        long largestResultSoFar = -1;
        for (int i = 0; i < digits.length - length + 1; i++) {
            long tempResult = 1;
            for (int j = i; j < (i + length); j++) {
                tempResult *= digits[j];
            }
            if (largestResultSoFar < tempResult) {
                largestResultSoFar = tempResult;
            }
        }
        return largestResultSoFar;
    }

}
