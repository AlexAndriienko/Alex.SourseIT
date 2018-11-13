package ua.com.sourceit.AndriienkoHomework.HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 2. Новогодний подарок. Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определе-
нием его веса. Провести сортировку конфет в подарке на основе одного
из параметров. Найти конфету в подарке, соответствующую заданному ди-
апазону содержания сахара.*/

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static double[] SugarСontentRange = new double[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Sweets> gift1 = new ArrayList<Sweets>(new СhildrenGift().childrenGiftCollector());
		
		System.out.println("Сomposition children gift:\n");
		
		ChildrenGiftPrinter.printСhildrenGift(gift1);
		System.out.println("Weight of childrens gift = " + new ChildrensGiftWeightCounter().childrensGiftWeightCounter(gift1));
		
		System.out.println("___________________________________________________________");
		System.out.println("Sort children gift by content of sugar:\n");
		
		ChildrenGiftPrinter.printСhildrenGift(new СhildrenGiftSorterFilter().sortСhildrenGiftBySugarСontent(gift1));
		
		System.out.println("___________________________________________________________");
		
		System.out.println("Please, enter the range content of sugar for filter children's gift:\n From:");
		SugarСontentRange[0] = Integer.parseInt(reader.readLine());
		System.out.println(" To:");
		SugarСontentRange[1] = Integer.parseInt(reader.readLine());
		
		ChildrenGiftPrinter.printСhildrenGift(
				new СhildrenGiftSorterFilter().filterСhildrenGiftBySugarСontent(gift1, SugarСontentRange));
	}
}
