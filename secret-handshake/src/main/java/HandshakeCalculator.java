import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        // ArrayLists can have an initial capacity set, however, it is 10 at minimum (and we'll never have that many)
        List<Signal> result = new LinkedList<>();
        if (isBitSet(number, 0)) {
            result.add(Signal.WINK);
        }
        if (isBitSet(number, 1)) {
            result.add(Signal.DOUBLE_BLINK);
        }
        if (isBitSet(number, 2)) {
            result.add(Signal.CLOSE_YOUR_EYES);
        }
        if (isBitSet(number, 3)) {
            result.add(Signal.JUMP);
        }
        if (isBitSet(number, 4)) {
            Collections.reverse(result);
        }
        return result;
    }

    private boolean isBitSet(int number, int bitPosition) {
        return ((number >>> bitPosition) & 0b1) == 1;
    }

}
