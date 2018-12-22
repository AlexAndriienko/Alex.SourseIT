package ua.com.sourceit.AndriienkoHomework.HW1;
//Part3
//�������� �����, ������� ��������� ���������������� ����������� ����������� ������ �������� ���� ����� ������������� �����, 
//���������� � ���������� ��� ��������� ��������� ������.

public class HW1task3 {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int i;
		while (y != 0) {
			i = x % y;
			x = y;
			y = i;
		}		
		System.out.println("НОД равен: " + x);	
	}

}
//cmd
//javac C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\hw1task3.java
//java -cp C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\ hw1task3 55 15
//30