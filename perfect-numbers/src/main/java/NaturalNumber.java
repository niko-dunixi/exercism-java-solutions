public class NaturalNumber {

    private Classification classification;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum < number) {
            classification = Classification.DEFICIENT;
        } else if (sum > number) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.PERFECT;
        }
    }

    public Classification getClassification() {
        return classification;
    }

}
