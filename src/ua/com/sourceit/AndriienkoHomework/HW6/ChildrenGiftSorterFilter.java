package ua.com.sourceit.AndriienkoHomework.HW6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ChildrenGiftSorterFilter {
	

	public ArrayList<Sweets> sortChildrenGiftBySugarContent(ArrayList<Sweets> sweets) {

		return (ArrayList<Sweets>) sweets.stream()
				.sorted((sweet1, sweet2) -> Double.compare(sweet1.getSugarContent(), sweet2.getSugarContent()))
				.collect(Collectors.toList());

	}

	public ArrayList<Sweets> sortChildrenGiftByWeight(ArrayList<Sweets> sweets) {

		return (ArrayList<Sweets>) sweets.stream()
				.sorted((sweet1, sweet2) -> Double.compare(sweet1.getWeight(), sweet2.getWeight()))
				.collect(Collectors.toList());

	}
	public ArrayList<Sweets> filterChildrenGiftBySugarContent(ArrayList<Sweets> sweets, double[] SugarContentRange) {

		return (ArrayList<Sweets>) sweets.stream()
				.filter(sweet -> sweet.getSugarContent() > SugarContentRange[0] && sweet.getSugarContent() < SugarContentRange[1])				
				.collect(Collectors.toList());

	}
}
