package ua.com.sourceit.AndriienkoHomework.HW2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*2
ѕрограмма должна считать с консоли число, которое введет пользователь и вывести каждую цифру с новой строки.
*/

public class hw2task2 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("ѕЋќўјƒ№ “–≈”√ќЋ№Ќ» ј \na = ");
		double a = Double.parseDouble(reader.readLine());
		System.out.print("b = ");
		double b = Double.parseDouble(reader.readLine());
		System.out.print("c = ");
		double c = Double.parseDouble(reader.readLine());		
		double p = 0.5 * (a + b + c);
		double S  = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c))*100);		
		System.out.println("S = " + S/100);
		}		
	
}
//ѕЋќўјƒ№ “–≈”√ќЋ№Ќ» ј 
//a = 4
//b = 5
//c = 6
//S = 9.92