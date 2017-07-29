public class DifferenceOfSquaresCalculator {


    public int computeSquareOfSumTo(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return (int) Math.pow(sum, 2);
    }

    public int computeSumOfSquaresTo(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int number) {
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }
}
