package ua.com.sourceit.AndriienkoHomework.HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 2. ���������� �������. ���������� �������� ������ � ������ ���������.
������� ��������� ��������-������. ������� ������� ������� � ��������-
���� ��� ����. �������� ���������� ������ � ������� �� ������ ������
�� ����������. ����� ������� � �������, ��������������� ��������� ��-
������� ���������� ������.*/

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static double[] Sugar�ontentRange = new double[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Sweets> gift1 = new ArrayList<Sweets>(new �hildrenGift().childrenGiftCollector());
		
		System.out.println("�omposition children gift:\n");
		
		ChildrenGiftPrinter.print�hildrenGift(gift1);
		System.out.println("Weight of childrens gift = " + new ChildrensGiftWeightCounter().childrensGiftWeightCounter(gift1));
		
		System.out.println("___________________________________________________________");
		System.out.println("Sort children gift by content of sugar:\n");
		
		ChildrenGiftPrinter.print�hildrenGift(new �hildrenGiftSorterFilter().sort�hildrenGiftBySugar�ontent(gift1));
		
		System.out.println("___________________________________________________________");
		
		System.out.println("Please, enter the range content of sugar for filter children's gift:\n From:");
		Sugar�ontentRange[0] = Integer.parseInt(reader.readLine());
		System.out.println(" To:");
		Sugar�ontentRange[1] = Integer.parseInt(reader.readLine());
		
		ChildrenGiftPrinter.print�hildrenGift(
				new �hildrenGiftSorterFilter().filter�hildrenGiftBySugar�ontent(gift1, Sugar�ontentRange));
	}
}
