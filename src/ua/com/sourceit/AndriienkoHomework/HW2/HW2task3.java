package ua.com.sourceit.AndriienkoHomework.HW2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*3
Программа должна вывести длину окружности. Радиус задается пользователем с консоли.
*/

public class HW2task3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("Введите радиус:\nR = ");
		double R = Double.parseDouble(reader.readLine());
		double L  = Math.round(2*Math.PI*R*100);		
		System.out.println("S = " + L/100);
		}		
	
}
//Длинна окружности
//R = 5
//S = 31.42