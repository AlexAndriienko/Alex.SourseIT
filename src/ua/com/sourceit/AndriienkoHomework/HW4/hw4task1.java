package ua.com.sourceit.AndriienkoHomework.HW4;

/*1
¬ывести на экран число пи 5 раз, в каждой строке разное количество знаков после зап€той. ¬ первой строке - 1, в последней - 5.
*/

public class hw4task1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {			
			System.out.println(String.format("value is %."+ i +"f", Math.PI));
		}

	}

}