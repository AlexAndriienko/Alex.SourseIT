package ua.com.sourceit.AndriienkoHomework.HW6;

import java.util.ArrayList;

public class ChildrensGiftWeightCounter {
	static double childrensGiftWeight;
	
	public double childrensGiftWeightCounter(ArrayList<Sweets> sweets) {
		for (Sweets sweet : sweets) {
			childrensGiftWeight += sweet.getSugar—ontent();
		}
		return childrensGiftWeight;
	}
}
