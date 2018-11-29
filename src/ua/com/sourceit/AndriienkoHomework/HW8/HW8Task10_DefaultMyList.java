package ua.com.sourceit.AndriienkoHomework.HW8;

import java.util.Arrays;

public class HW8Task10_DefaultMyList<E> implements HW8Task10_MyList<E> {

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

		if (toString().compareTo(data.toString()) == 0) {
			return true;
		}

		return false;

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

	public void nullRemove() {

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

}
