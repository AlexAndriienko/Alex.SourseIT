package ua.com.sourceit.AndriienkoHomework.HW1;
//Part2
//Написать класс, который реализует функциональность сложения двух чисел, переданных в приложение как параметры командной строки.

public class hw1task2 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Сумма равна: " + (x + y));
	}
}
// cmd
// javac C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\hw1task2.java
// java -cp C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\ hw1task2 10 20
// 30