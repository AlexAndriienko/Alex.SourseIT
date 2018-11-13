package ua.com.sourceit.AndriienkoHomework.HW6;

import java.util.ArrayList;

public class ChildrenGiftPrinter {
	public static void print—hildrenGift(ArrayList<Sweets> sweets) {
		for (Sweets sweet : sweets) {
			System.out.println(sweet.getName() + " —ontent of sugar: " + sweet.getSugar—ontent() + " Weight: " + sweet.getWeight());
		}
	}
}
