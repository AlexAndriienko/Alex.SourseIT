package ua.com.sourceit.AndriienkoHomework.HW6;
import java.util.ArrayList;
import java.util.Random;


public class �hildrenGift {
	Random random = new Random();	
	ArrayList<Sweets> childrenGift = new ArrayList<Sweets>();

	public ArrayList<Sweets> childrenGiftCollector(){
		
		for (int i = 0; i < 10; i++) {
			childrenGift.add(new ChocolateCandy("Chocolate Candy" + " �" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
			childrenGift.add(new CaramelCandy("Caramel Candy" + " �" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
			childrenGift.add(new �ookie("�ookie" + " �" + i, random.nextInt(100 - 1) + 1, random.nextInt(100 - 1)));
		}
				
		return childrenGift;
	}

}
