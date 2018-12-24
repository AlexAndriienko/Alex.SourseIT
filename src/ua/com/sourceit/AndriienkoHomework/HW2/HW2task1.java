package ua.com.sourceit.AndriienkoHomework.HW2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1
��������� ������ ������� � ������� �����, ������� ������ ������������ � ������� ������ ����� � ����� ������.
*/

public class HW2task1 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = reader.readLine().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}		
	}
}
//1551351
//1
//5
//5
//1
//3
//5
//1