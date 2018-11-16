package ua.com.sourceit.AndriienkoHomework.HW6;

import java.util.ArrayList;

public class ChildrenGiftPrinter {
	public static void printChildrenGift(ArrayList<Sweets> sweets) {
		for (Sweets sweet : sweets) {
			System.out.println(sweet.getName() + " �ontent of sugar: " + sweet.getSugarContent() + " Weight: " + sweet.getWeight());
		}
	}
}
