package ua.com.sourceit.AndriienkoHomework.HW6;
import java.util.ArrayList;
import java.util.Random;


public class ÑhildrenGift {
	Random random = new Random();	
	ArrayList<Sweets> childrenGift = new ArrayList<Sweets>();

	public ArrayList<Sweets> childrenGiftCollector(){
		
		for (int i = 0; i < 10; i++) {
			childrenGift.add(new ChocolateCandy("Chocolate Candy" + " ¹" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
			childrenGift.add(new CaramelCandy("Caramel Candy" + " ¹" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
			childrenGift.add(new Ñookie("Ñookie" + " ¹" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
		}
				
		return childrenGift;
	}

}
