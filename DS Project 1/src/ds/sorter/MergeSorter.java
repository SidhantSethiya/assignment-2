package ds.sorter;

import java.util.List;

public class MergeSorter<E extends Comparable<E>> implements Sorter<E> {

	@Override
	public List<E> sort(List<E> input) {
		return input;
	}
}
