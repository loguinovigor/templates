import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random = new Random();
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Минимальное значение не может быть больше максимального");
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true; // Итератор бесконечен
        }

        @Override
        public Integer next() {
            return min + random.nextInt(max - min + 1);
        }
    }
}
