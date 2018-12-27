package ua.com.sourceit.AndriienkoHomework.HW2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*2
Программа должна подсчитывать и выводить площадь треугольника. Стороны задаются пользователем с консоли.
*/

public class HW2task2 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("a = ");
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
//a = 4
//b = 5
//c = 6
//S = 9.92