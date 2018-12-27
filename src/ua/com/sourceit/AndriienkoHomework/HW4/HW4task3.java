package ua.com.sourceit.AndriienkoHomework.HW4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*3
написать метод, который рисует прямоугольник из плюсиков. 
Входными параметрами будут два числа - ширина и высота
*/

public class HW4task3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Укажите ширину \nS = ");
		int S = Integer.parseInt(reader.readLine());
		System.out.print("Укажите высоту \nL = ");
		int L = Integer.parseInt(reader.readLine());
		rectangleFromplus(S, L);

	}

	private static void rectangleFromplus(int a, int b) {
		for (int i = 0; i < b; i++) {

			for (int j = 0; j < a; j++) {
				System.out.print("+");
			}
			System.out.println("");

		}

	}

}