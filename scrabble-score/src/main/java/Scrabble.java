import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private static final Map<Character, Integer> lettersToPoints;

    static {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char letter : new char[]{'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'}) {
            characterIntegerHashMap.put(letter, 1);
        }
        for (char letter : new char[]{'d', 'g'}) {
            characterIntegerHashMap.put(letter, 2);
        }
        for (char letter : new char[]{'b', 'c', 'm', 'p'}) {
            characterIntegerHashMap.put(letter, 3);
        }
        for (char letter : new char[]{'f', 'h', 'v', 'w', 'y'}) {
            characterIntegerHashMap.put(letter, 4);
        }
        for (char letter : new char[]{'k'}) {
            characterIntegerHashMap.put(letter, 5);
        }
        for (char letter : new char[]{'j', 'x'}) {
            characterIntegerHashMap.put(letter, 8);
        }
        for (char letter : new char[]{'q', 'z'}) {
            characterIntegerHashMap.put(letter, 10);
        }

        lettersToPoints = Collections.unmodifiableMap(characterIntegerHashMap);
    }


    private final int finalScore;

    Scrabble(String word) {
        char[] letters = word.toLowerCase().toCharArray();

        int score = 0;
        for (char letter : letters) {
            if (lettersToPoints.containsKey(letter)) {
                score += lettersToPoints.get(letter);
            }
        }

        finalScore = score;
    }

    int getScore() {
        return finalScore;
    }

}
