package ua.com.sourceit.AndriienkoHomework.HW8;

import java.util.Iterator;

public interface HW8Task10_MyList<E> extends Iterable<E>{

	void add(E obj); // appends the specified element to the end of this list

	void clear(); // removes all of the elements from this list

	boolean remove(Object obj); // removes the first occurrence of the specified element from this list

	public Object[] toArray(); // returns an array containing all of the elements in this list in proper
						// sequence

	int size(); // returns the number of elements in this list

	boolean contains(Object obj); // returns true if this list contains the specified element.

	boolean containsAll(HW8Task10_MyList<E> c); // returns true if this list contains all of the elements of the
												// specified list

	String toString();

	Iterator<E> iterator();

	ListIterator<E> listIterator();




}
