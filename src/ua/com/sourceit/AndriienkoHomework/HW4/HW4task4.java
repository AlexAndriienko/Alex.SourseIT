package ua.com.sourceit.AndriienkoHomework.HW4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*4
реализовать метод, который вернет количество слов в строке текста
*/

public class HW4task4 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите текст: ");
		ArrayList<String> text = new ArrayList<String>();
		while (true) {
			String Str = reader.readLine();
			if (Str.isEmpty())
				break;
			text.add(Str);			
		}
		
		System.out.println("Количество слов в первой стоке: " + countWord(text)[0] + " всего слов: " + countWord(text)[1]);

	}

	private static int[] countWord(ArrayList<String> text) {
		int n = 0;
		int s = 0;
		for (String str : text) {
			String[] words = str.split("\\s+");
		    n += words.length;
		    s += 1;		    
		}		
		int[] result = {s, n};
		return result;
	}

}