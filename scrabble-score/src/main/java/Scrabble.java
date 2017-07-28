class Scrabble {

    private final int finalScore;

    Scrabble(String word) {
        char[] letters = word.toLowerCase().toCharArray();

        int score = 0;
        for (char letter : letters) {
            if ("aeioulnrst".indexOf(letter) >= 0) {
                score += 1;
            } else if ("dg".indexOf(letter) >= 0) {
                score += 2;
            } else if ("bcmp".indexOf(letter) >= 0) {
                score += 3;
            } else if ("fhvwy".indexOf(letter) >= 0) {
                score += 4;
            } else if ('k' == letter) {
                score += 5;
            } else if ("jx".indexOf(letter) >= 0) {
                score += 8;
            } else if ("qz".indexOf(letter) >= 0) {
                score += 10;
            }
        }

        finalScore = score;
    }

    int getScore() {
        return finalScore;
    }

}
