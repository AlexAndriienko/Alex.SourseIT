package ua.com.sourceit.AndriienkoHomework.HW3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1
C ������� ������ ���������� ����� ������:
*
**
***
****
***
**
*
������������ ������ �������� � ���������� (� ������ ������� ������ 4)
*/

public class hw3task1 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("������� ������ ������ \nH = ");
		int H = Integer.parseInt(reader.readLine());		
		for (int i = 1; i <= (H*2 - 1); i++) {
			for (int j = 0; j <= (H - 1 - Math.abs(i - H)); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			
	}			
				
}