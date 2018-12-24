package ua.com.sourceit.AndriienkoHomework.HW3;
import java.util.Arrays;
import java.util.Random;

/*4
—оздать массив случайных элементов размер 10.
—оздать второй массив размером 20, где повтор€ютс€ первые элементы, а остальные числа €вл€ютс€ увеличенным вдвое значени€ми первого массива.
1, 2, 3 ...
1, 2, 3, 2, 4, 6 ...

*/

public class hw3task4 {
	public static void main(String[] args) throws Exception {
		Random random = new Random();
		int[] N1 = new int[10];
		int[] N2 = new int[20];
		for (int i = 0; i < 10; i++) {
			N1[i] = random.nextInt(1000 - 1) + 1;			
		}
		for (int i = 0; i < 10; i++) {
			N2[i] = N1[i];	
			N2[i + 10] = N1[i]*2;
		}		
		System.out.println(Arrays.toString(N1));
		System.out.println(Arrays.toString(N2));
	}			
				
}