package ua.com.sourceit.AndriienkoHomework.HW5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import ua.com.sourceit.AndriienkoHomework.HW5.Book.TypeBinding;

public class Library {
	public static ArrayList<Book> lib = new ArrayList<Book>();
	static SimpleDateFormat form = new SimpleDateFormat("yyyy");
	static Date year = new Date();

	public static void main(String[] args) {

	}

	public static ArrayList<Book> library() throws ParseException {
		
		lib.add(new Book(1, "Effective Java", "Joshua Bloch", "Pearson Education (US)", form.parse("2011"), 416, 44.18, TypeBinding.HARDCOVER));
		lib.add(new Book(2, "Head First Java", "Kathy Sierra", "O'Reilly Media, Inc, USA", form.parse("2005"), 688,
				27.23, TypeBinding.PERFECT));
		lib.add(new Book(3, "Head First Python 2e", "Paul Barry", "O'Reilly Media, Inc, USA", form.parse("2017"), 624,
				28.33, TypeBinding.PERFECT));
		lib.add(new Book(4, "The Magus of Java : Teachings of an Authentic Taoist Immortal", "Kosta Danaos",
				"Inner Traditions Bear and Company", form.parse("2000"), 224, 12.60, TypeBinding.PERFECT));
		lib.add(new Book(5, "Optimizing Java : Practical techniques for improving JVM application performance",
				" Benjamin J. Evans", "O'Reilly Media, Inc, USA", form.parse("2018"), 600, 39.93,
				TypeBinding.HARDCOVER));
		lib.add(new Book(6, "Java All-in-One For Dummies", "Doug Lowe", "John Wiley & Sons Inc", form.parse("2017"),
				960, 21.99, TypeBinding.HARDCOVER));

		return lib;

	}

}
