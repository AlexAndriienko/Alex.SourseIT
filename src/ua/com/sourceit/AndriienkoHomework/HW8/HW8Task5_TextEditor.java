package ua.com.sourceit.AndriienkoHomework.HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class HW8Task5_TextEditor {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Path path = Paths.get("D:\\text.txt");
		String s = System.lineSeparator();

		int totalChars = 0;
		int numberString = 0;
		int countStringMaxVowels = 0;
		int numberStringMaxVowels = 0;
		int numberofWords = 0;

		try {
			while (true) {
				String str = reader.readLine();

				if (str.equals("exit"))

					break;
				else {
					totalChars += str.length();
					numberString++;

					int countStringVowels = 0;
					countStringVowels = str.chars()
							.filter(ch -> ch == 'e' || ch == 'i' || ch == 'u' || ch == 'a' || ch == 'o' || ch == 'y')
							.toArray().length;

					if (countStringVowels > countStringMaxVowels) {
						countStringMaxVowels = countStringVowels;
						numberStringMaxVowels = numberString;
					}
					numberofWords += str.split("[ ,.!?\r\n]").length;

					byte[] strToBytes = str.getBytes();
					Files.write(path, strToBytes, StandardOpenOption.APPEND);
					Files.write(path, s.getBytes(), StandardOpenOption.APPEND);

				}
			}

			@SuppressWarnings("resource")
			Stream<String> lines = Files.lines(path);
			lines.forEach(l -> System.out.println(l));
			System.out.println("Total characters was entered:" + totalChars);

			if (numberStringMaxVowels == 0)
				System.out.println("There are no vowels in the text." + numberStringMaxVowels);
			else
				System.out.println("Number words:" + numberofWords);

		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
