package ua.com.sourceit.AndriienkoHomework.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BookSorter {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {

		while (true) {
			System.out.println("Please, select the parameter for library filter:" 
					+ "\n 1 - for filter by Author;"
					+ "\n 2 - for filter by Publisher; " 
					+ "\n 3 - for filter by YearPublication;"
					+ "\n - for escape from programm Press ENTER");

			String filterSelection = reader.readLine();

			if (filterSelection.isEmpty()) {
				System.out.println("End");
				break;

			} else if (Integer.parseInt(filterSelection) == 1) {
				System.out.println("Please, enter the name of author:");
				String authorName = reader.readLine();
				toString(filterByAuthors(Library.library(), authorName));
				break;

			} else if (Integer.parseInt(filterSelection) == 2) {
				System.out.println("Please, enter the Publisher:");
				String Publisher = reader.readLine();
				toString(filterByPublisher(Library.library(), Publisher));
				break;

			} else if (Integer.parseInt(filterSelection) == 3) {
				System.out.println("Please, enter the YearPublication:");
				String YearPublication = reader.readLine();
				toString(filterByYearPublication(Library.library(), YearPublication));

			}
		}

	}

	public static void toString(ArrayList<Book> books) {
		for (Book book : books) {
			System.out.println("ID = " + book.getID() 
								+ "/ Title: " + book.getTitle() 
								+ "/ Authors: " + book.getAuthors() 
								+ "/ Publisher: " + book.getPublisher() 
								+ "/ YearPublication: " + book.getYearPublication() 
								+ "/ NumberPages = " + book.getNumberPages() 
								+ "/ Price = " + book.getPrice() 
								+ "/ TypeBinding = " + book.getTypeBinding());
		}

	}

	public static ArrayList<Book> filterByAuthors(ArrayList<Book> library, String authorName) {
		return (ArrayList<Book>) library.stream().filter(book -> book.getAuthors().equals(authorName))
				.collect(Collectors.toCollection(ArrayList<Book>::new));
	}

	public static ArrayList<Book> filterByPublisher(ArrayList<Book> library, String Publisher) {
		return (ArrayList<Book>) library.stream().filter(book -> book.getPublisher().equals(Publisher))
				.collect(Collectors.toCollection(ArrayList<Book>::new));
	}

	public static ArrayList<Book> filterByYearPublication(ArrayList<Book> library, String YearPublication) {
		return (ArrayList<Book>) library.stream().filter(book -> book.getYearPublication().equals(YearPublication))
				.collect(Collectors.toCollection(ArrayList<Book>::new));
	}

}