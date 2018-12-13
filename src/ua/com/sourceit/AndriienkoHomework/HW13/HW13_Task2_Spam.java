package ua.com.sourceit.AndriienkoHomework.HW13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Задание 2
Создать класс Spam, который получает массив интервалов времени в миллисекундах 
и согласованный с ним массив сообщений, и выводит соответствующие сообщения на 
экран через заданные интервалы времени. По нажатию на клавишу Enter приложение 
должно завершать свою работу (данную функциональность поместить в метод Spam.main). 
При демонстрации работы смоделировать ввод Enter через 5 сек (данную функциональность 
поместить в метод Part2.main).
*/

public class HW13_Task2_Spam implements Runnable {

	@Override
	public void run() {
		try {
			printSpam();
		} catch (InterruptedException x) {

		} catch (NumberFormatException x) {
		}
	}

	public void printSpam() throws NumberFormatException, InterruptedException {
		String[] showTimes = { "1000", "1000", "1000", "1000", "1000", "1000", "1000" };
		String[] messages = { "1 second(s) passed", "2 second(s) passed", "3 second(s) passed", "4 second(s) passed",
				"5 second(s) passed", "6 second(s) passed", "7 second(s) passed" };
		int i = 0;

		while (!Thread.currentThread().isInterrupted() && i < showTimes.length) {

			Thread.sleep(Long.parseLong(showTimes[i]));
			System.out.println(messages[i]);
			i++;
		}

	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HW13_Task2_Spam sp = new HW13_Task2_Spam();
		Thread t = new Thread(sp);
		t.start();
		while (true) {
			try {
				if (reader.readLine().isEmpty()) {
					System.out.println("break");
					t.interrupt();
					break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
