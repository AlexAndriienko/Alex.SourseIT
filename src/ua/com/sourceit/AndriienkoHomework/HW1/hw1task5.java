package ua.com.sourceit.AndriienkoHomework.HW1;
//Part5

public class hw1task5 {

	public static void main(String[] args) {
		
		System.out.println(chars2digits("ABZ"));
		System.out.println(digits2chars(754));
		System.out.println(rightColumn("ABZ"));
						
	}
	
	public static int chars2digits (String letter) {
		int number = 0;
		int j = 0;
		int pow = 0;		
		for (int i = letter.length() - 1; i >= 0; i--) {			
			j = (letter.charAt(i) - 64) % 26;			
			if (j == 0)
				j = 26;	
			number += j * Math.pow(26, pow);
			pow++;
		}				
		return number;
	}

	public static String digits2chars (int number) {
		StringBuilder letters = new StringBuilder();
		
		while (number > 0) {
			int j = number % 26;
				if (j == 0) {
					letters.append('Z');
					number = number / 26 - 1;
				}
				else {
					letters.append((char)(j + 64));
					number = number / 26;
				}
		}
						
		return letters.reverse().toString();
	}
	
	 public static String rightColumn(String letter) {		 
		 String rightLetter = digits2chars(chars2digits(letter) + 1);		 
		 return rightLetter;
	 }
}

//Вывод:
//	754
//	ABZ
//	ACA