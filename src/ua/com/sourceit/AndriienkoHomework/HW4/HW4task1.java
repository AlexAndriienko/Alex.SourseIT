package ua.com.sourceit.AndriienkoHomework.HW4;

/*1
Вывести на экран число пи 5 раз, 
в каждой строке разное количество знаков после запятой. 
В первой строке - 1, в последней - 5.
*/

public class HW4task1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {			
			System.out.println(String.format("value is %."+ i +"f", Math.PI));
		}

	}

}