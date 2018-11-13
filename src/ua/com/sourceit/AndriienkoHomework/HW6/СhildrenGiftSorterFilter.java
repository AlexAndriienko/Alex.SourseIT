package ua.com.sourceit.AndriienkoHomework.HW6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class —hildrenGiftSorterFilter {
	

	public ArrayList<Sweets> sort—hildrenGiftBySugar—ontent(ArrayList<Sweets> sweets) {

		return (ArrayList<Sweets>) sweets.stream()
				.sorted((sweet1, sweet2) -> Double.compare(sweet1.getSugar—ontent(), sweet2.getSugar—ontent()))
				.collect(Collectors.toList());

	}

	public ArrayList<Sweets> sort—hildrenGiftByWeight(ArrayList<Sweets> sweets) {

		return (ArrayList<Sweets>) sweets.stream()
				.sorted((sweet1, sweet2) -> Double.compare(sweet1.getWeight(), sweet2.getWeight()))
				.collect(Collectors.toList());

	}
	public ArrayList<Sweets> filter—hildrenGiftBySugar—ontent(ArrayList<Sweets> sweets, double[] Sugar—ontentRange) {

		return (ArrayList<Sweets>) sweets.stream()
				.filter(sweet -> sweet.getSugar—ontent() > Sugar—ontentRange[0] && sweet.getSugar—ontent() < Sugar—ontentRange[1])				
				.collect(Collectors.toList());

	}
}
