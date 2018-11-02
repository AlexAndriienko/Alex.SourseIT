package ua.com.sourceit.AndriienkoHomework.HW1;
/*Part1
Написать класс, который реализует функциональность вывода в консоль строки "Hello, World". 
Написать командный файл (bat файл Windows или shell скрипт Linux), который компилирует и запускает данное приложение из консоли. 
Командный файл сохранить в каталоге src Eclipse-проекта.
*/


public class hw1task1 {
	public static void main(String[] args) {
		System.out.println("Hello, World");
	}
}
// BAT:
// javac C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\hw1task1.java
// java -cp C:\Users\Alex\eclipse-workspace\SourceIT_Andriienko\src\ hw1task1
// pause