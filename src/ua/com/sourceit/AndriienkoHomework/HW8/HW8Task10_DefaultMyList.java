package ua.com.sourceit.AndriienkoHomework.HW8;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class HW8Task10_DefaultMyList<E> implements HW8Task10_MyList<E>, ListIterable<E> {

	private int elementNumber = 0;
	Object[] elementData;

	@Override
	public void add(Object newElement) {

		if (elementNumber == 0) {
			elementData = new Object[10];

		} else if (elementNumber % 10 == 0) {

			int newElementDataCapasity = elementNumber + 10;
			elementData = Arrays.copyOf(elementData, newElementDataCapasity);
		}

		elementData[elementNumber] = newElement;
		elementNumber++;

	}

	@Override
	public void clear() {

		for (int i = 0; i < elementData.length; i++)
			elementData[i] = null;
	}

	@Override
	public boolean remove(Object obj) {

		for (int i = 0; i < size(); i++) {

			if (elementData[i].equals(obj)) {
				elementData[i] = null;
				nullRemove();
				return true;

			}
		}
		return false;

	}

	@Override
	public Object[] toArray() {

		int i = 0;
		Object[] arrayElementData = new Object[size()];

		while (elementData[i] != null) {
			arrayElementData[i] = elementData[i];
			i++;
		}

		return arrayElementData;

	}

	@Override
	public int size() {

		int i = 0;

		while (elementData[i] != null) {
			i++;
		}

		return i;

	}

	@Override
	public boolean contains(Object obj) {

		for (int i = 0; i < size(); i++) {
			if (elementData[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(HW8Task10_MyList<E> data) {

		for (E e : data) {
			if (!contains(e))
				return false;
		}

		return true;

	}

	@Override
	public String toString() {

		Object[] a = toArray();
		if (a == null)
			return "null";

		int iMax = a.length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();

		b.append('{');
		for (int i = 0;; i++) {
			b.append("[" + a[i] + "]");

			if (i == iMax)
				return b.append('}').toString();
			b.append(", ");
		}

	}

	// Удаление нулевых значений

	private void nullRemove() {

		int iMax = elementData.length - 2;
		int i = 0;

		while (i < iMax) {

			i++;

			if (elementData[i] == null && elementData[i + 1] != null) {

				elementData[i] = elementData[i + 1];
				elementData[i + 1] = null;
				nullRemove();

			}

		}

	}

	public E set(int index, E element) {
		E oldValue = elementData(index);
		elementData[index] = element;
		return oldValue;
	}

	@SuppressWarnings("unchecked")
	E elementData(int index) {
		return (E) elementData[index];
	}

	@Override
	public Iterator<E> iterator() {
		return new IteratorImpl<E>();
	}

	@Override
	public ListIterator<E> listIterator() {
		return new ListIteratorImpl();
	}

	@SuppressWarnings("hiding")
	private class IteratorImpl<E> implements Iterator<E> {
		int cursor;
		int lastRet = -1;

		IteratorImpl() {
		}

		public boolean hasNext() {
			return cursor != size();
		}

		@SuppressWarnings("unchecked")
		public E next() {
			int i = cursor;

			if (i >= size())
				throw new NoSuchElementException();

			Object[] elementData = HW8Task10_DefaultMyList.this.elementData;

			if (i >= elementData.length)
				throw new ConcurrentModificationException();

			cursor = i + 1;

			return (E) elementData[lastRet = i];
		}

		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();

			try {
				HW8Task10_DefaultMyList.this.remove(elementData[lastRet]);
				cursor = lastRet;
				lastRet = -1;

			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}

		}

	}

	private class ListIteratorImpl extends IteratorImpl<E> implements ListIterator<E> {
		final int offset = this.offset;

		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E previous() {
			int i = cursor - 1;
			if (i < 0)
				throw new NoSuchElementException();
			E[] elementData = (E[]) HW8Task10_DefaultMyList.this.elementData;
			if (offset + i >= elementData.length)
				throw new ConcurrentModificationException();
			cursor = i;
			return (E) elementData[offset + (lastRet = i)];
		}

		@Override
		public void set(E e) {
			if (lastRet < 0)
				throw new IllegalStateException();

			try {
				HW8Task10_DefaultMyList.this.set(offset + lastRet, e);
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}

		}

	}

}
