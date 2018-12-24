package ua.com.sourceit.AndriienkoHomework.HW3;
import java.util.Arrays;

/*0
отсортировать строки в массиве по количеству символов в строке
*/

public class HW3task0 {
	public static void main(String[] args) {
		String[] str = {"wwqwq", "qwqwqwwqw", "qwqwwq", "qwqwq", "wqq", "wqqwq", "wqqwwq"};		
		Arrays.sort(str, (str1, str2) -> str1.length() - str2.length());		
		System.out.println(Arrays.toString(str));
		}		
	
}
