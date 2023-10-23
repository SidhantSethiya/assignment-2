package ds.sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ds.Vegetable.Vegetable;

public class CustomSorting {

	
	/**
	 * This method must sort the vegetable alphabetically by their type. Vegetables must be sorted 
	 *  in the order Onion, Lettuce, Tomato, Capsicum. The weight and ripeness of a vegetable should not
	 *  be considered. 
	 *  
	 * @param list The list to sort. 
	 * @return A sorted list. 
	 */
	public static List<Vegetable> sortByType(List<Vegetable> list) {
		return null;
		/*
		return list.sort(new Comparator<Vegetable>() {
			// Implement your custom compare method here. 
		});
		*/
	}
	
	
	/**
	 * This method must sort the vegetable by their ripeness value, from 100% ripe to 0% ripe. 
	 * The type and weight of the vegetable should not be considered. 
	 * 
	 * @param list The vegetable to sort
	 * @return	   A sorted list. 
	 */
	public static List<Vegetable> sortByRipeness(List<Vegetable> list) {
		return null;
		/*
		return list.sort(new Comparator<Vegetable>() {
			// Implement your custom compare method here. 
		});
		*/
	}
}
