package ua.com.sourceit.AndriienkoHomework.HW8;

import java.util.Iterator;

public interface ListIterator<E> extends Iterator<E> {
	boolean hasPrevious(); // returns true if this list iterator has more elements when traversing the list
							// in the reverse direction

	Object previous(); // returns the previous element in the list and moves the cursor position
						// backwards

	void set(E e); // replaces the last element returned by next or previous with the specified
						// element

	void remove(); // removes from the list the last element that was returned by next or previous

}

interface ListIterable<E> {
	ListIterator<E> listIterator();
}
