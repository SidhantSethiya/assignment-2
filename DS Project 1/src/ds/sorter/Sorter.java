package ds.sorter;

import java.util.List;

public interface Sorter<E extends Comparable<E>> {
    public List<E> sort(List<E> input);
}
