package ua.com.sourceit.AndriienkoHomework.HW4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*5
�������� �����, ������� ��������� ������ ����� � ���������� ������ ����� � ������� ������ 3 �������� (�����, �������)
*/

public class hw4task5 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� ������: ");		
		String Str = reader.readLine();
		String[] words = Str.split("\\s+");	 
		
		for (String str : filterString(words)) {
			System.out.print(str + " ");
		}

	}

	private static String[] filterString(String[] inp) {
		String outp[] = Arrays.stream(inp).filter(string -> string.length() > 3).toArray(String[]::new);		
		return outp;
	}

}