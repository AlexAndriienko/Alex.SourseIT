package ua.com.sourceit.AndriienkoHomework.HW11;

public class HW11_LRU_Demo {
	public static void main(String[] args) {
		HW11_LRUcache<Integer, Integer> myCache1 = new HW11_LRUcache<Integer, Integer>();
		
		for (int i = 0; i < 20; i++) {			
			myCache1.put(i, i);
		}
		
		for (int i = 100; i < 105; i++) {			
			myCache1.put(i, i);
		}
		
		System.out.println(myCache1.toString());
		

	}
}
