package ua.com.sourceit.AndriienkoHomework.HW3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*3
���������� ����
+++***+++***+++***
+++***+++***+++***
+++***+++***+++***
+++***+++***+++***
������������ ����� ������ ���������� �����. � ������� ���� 6 �����
������ ������� ���� �������� �������������. � ������ ������� 3
�����������: ������ ������

*/

public class hw3task3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("������� ���������� ����� \nN = ");
		int N = Integer.parseInt(reader.readLine());
		System.out.print("������� ������ ������� \nS = ");
		int S = Integer.parseInt(reader.readLine());
		System.out.print("������� ������ ������� \nL = ");
		int L = Integer.parseInt(reader.readLine());
		
		
		for (int k = 1; k <= L; k++) {
			for (int i = 1; i <= N; i++) {
								
				for (int j = 0; j < S; j++) {
					if (i % 2 == 0) {
						System.out.print("+");
					}
					else 
						System.out.print("*");
				}
			
			}
			System.out.println("");
		}
			
	}			
				
}