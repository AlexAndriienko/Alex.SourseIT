package ua.com.sourceit.AndriienkoHomework.HW5;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*A-5
Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы setТип(), getТип(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
5.Book: id, Название, Автор (ы), Издательство, Год издания, Количество стра-
ниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Book {

	private int id, numberPages;
	private double price;
	private String title, publisher;
	private Date yearPublication = new Date();
	private String authors;
	private TypeBinding tb;
	static SimpleDateFormat form = new SimpleDateFormat("yyyy");

	public enum TypeBinding {
		HARDCOVER, PERFECT, SADDLESTITCH, LOOPSTITCH, SPIRALBOUND, TAPEBOUND, SCREWBOUND;
	}

	public static void main(String[] args) {

	}

	public Book(int id, String title, String authors, String publisher, Date yearPublication, int numberPages,
			double price, TypeBinding tb) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.yearPublication = yearPublication;
		this.numberPages = numberPages;
		this.price = price;
		this.tb = tb;
	}

	public Book(int id, String title, String authors, String publisher, int numberPages, TypeBinding tb) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.numberPages = numberPages;
		this.tb = tb;

	}

	public int getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthors() {
		return authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getYearPublication() {
		return form.format(yearPublication);
	}

	public double getPrice() {
		return price;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public TypeBinding getTypeBinding() {
		return tb;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYearPublication(String yearPublication) throws ParseException {
		this.yearPublication = form.parse(yearPublication);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public void setTypeBinding(TypeBinding tb) {
		this.tb = tb;
	}

}