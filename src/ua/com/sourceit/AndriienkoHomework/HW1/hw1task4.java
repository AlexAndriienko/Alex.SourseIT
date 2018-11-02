package ua.com.sourceit.AndriienkoHomework.HW1;
//Part4
//Написать класс, который реализует функциональность определения суммы цифры целого положительного числа, 
//переданного в приложение как параметр командной строки.


public class hw1task4 {

	public static void main(String[] args) {		
			char[] ch= args[0].toCharArray();
			int sum = 0;
			for (int i = 0; i < ch.length; i++) {
				sum += Integer.parseInt(String.valueOf(ch[i]));	
			}
		
		System.out.println("Сумма цифр числа равна: " + sum);
	}
}
// cmd
// javac C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\hw1task4.java
// java -cp C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\ hw1task4 12345678910
// 46