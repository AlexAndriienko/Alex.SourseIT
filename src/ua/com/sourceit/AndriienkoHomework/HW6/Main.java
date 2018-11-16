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
	static double[] SugarContentRange = new double[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Sweets> gift1 = new ArrayList<Sweets>(new ChildrenGift().childrenGiftCollector());
		
		System.out.println("Composition children gift:\n");
		
		ChildrenGiftPrinter.printChildrenGift(gift1);
		System.out.println("Weight of childrens gift = " + new ChildrensGiftWeightCounter().childrensGiftWeightCounter(gift1));
		
		System.out.println("___________________________________________________________");
		System.out.println("Sort children gift by content of sugar:\n");
		
		ChildrenGiftPrinter.printChildrenGift(new ChildrenGiftSorterFilter().sortChildrenGiftBySugarContent(gift1));
		
		System.out.println("___________________________________________________________");
		
		System.out.println("Please, enter the range content of sugar for filter children's gift:\n From:");
		SugarContentRange[0] = Integer.parseInt(reader.readLine());
		System.out.println(" To:");
		SugarContentRange[1] = Integer.parseInt(reader.readLine());
		
		ChildrenGiftPrinter.printChildrenGift(
				new ChildrenGiftSorterFilter().filterChildrenGiftBySugarContent(gift1, SugarContentRange));
	}
}
