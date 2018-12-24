package ua.com.sourceit.AndriienkoHomework.HW4;
import java.util.Arrays;
import java.util.Random;

/*2
написать метод, который принимает массив целых чисел и возвращает максимальное
*/

public class hw4task2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] N = new int[10];
		for (int i = 0; i < 10; i++) {
			N[i] = random.nextInt(1000 - 1) + 1;
		}
		System.out.println(Arrays.toString(N));
		System.out.println("Max = " + maximal(N));

	}

	public static int maximal(int arr[]) {
		Arrays.sort(arr);
		int Max = arr[arr.length - 1];
		return Max;
	}

}