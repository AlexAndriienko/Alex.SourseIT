package ua.com.sourceit.AndriienkoHomework.HW3;
import java.math.BigInteger;

/*2
Вывести только простые числа от 1 до 100
*/

public class hw3task2 {
	public static void main(String[] args) throws Exception {
		
		for (int i = 2; i <= 100; i++) {
			BigInteger N = BigInteger.valueOf(i);
			if (N.isProbablePrime((int) Math.log(i)))
				System.out.println(i);
		}
					
	}			
				
}