package ua.com.sourceit.AndriienkoHomework.HW8;

import java.util.Arrays;

public class HW8Task10_Main {

	public static void main(String[] args) {
		
		
		HW8Task10_MyList<Integer> myList1 = new HW8Task10_DefaultMyList<Integer>();
		HW8Task10_MyList<Integer> myList2 = new HW8Task10_DefaultMyList<Integer>();
		
		
		// Добавление элементов в листы:
		for (int i = 0; i < 15; i++) {
			myList1.add(i);
			myList2.add(i);
		}

		System.out.println("List size:" + myList1.size());

		System.out.println("Standart Arrays.toString :" + Arrays.toString(myList1.toArray()));

		System.out.println("Override toString :" + myList1.toString());

		System.out.println("remove 5: " + myList1.remove(5));
		System.out.println("remove 8: " + myList1.remove(8));
		System.out.println("remove 100: " + myList1.remove(100));

		System.out.println("contains 5: " + myList1.contains(5));
		System.out.println("contains 6: " + myList1.contains(6));

		myList2.remove(5);
		myList2.remove(8);

		System.out.println("myList1:" + myList1.toString());
		System.out.println("myList2:" + myList2.toString());

		System.out.println("List1 containsAll List2? " + myList1.containsAll(myList2));

		myList1.clear();

		System.out.println("clear myList1:" + myList1.toString());

	}

}
