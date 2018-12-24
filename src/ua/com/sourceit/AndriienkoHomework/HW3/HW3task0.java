package ua.com.sourceit.AndriienkoHomework.HW3;
import java.util.Arrays;

/*0
отсортировать строки в массиве по количеству символов в строке
*/

public class hw3task0 {
	public static void main(String[] args) {
		String[] str = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};		
		Arrays.sort(str, (str1, str2) -> str1.length() - str2.length());		
		System.out.println(Arrays.toString(str));
		}		
	
}
