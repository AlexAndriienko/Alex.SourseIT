package ua.com.sourceit.AndriienkoHomework.HW13;

/*Задание 1
Создать дочерний поток, который бы в течение примерно 5 сек печатал свое имя 
каждые полсекунды. Сделать это двумя способами - при помощи расширения класса 
Thread и при помощи реализации интерфейса Runnable.
*/

public class HW13_Task1_implRun implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
				System.out.println(HW13_Task1_implRun.class);
			} catch (InterruptedException e) {
			}

		}
	}

	public static void main(String[] args) {
		new Thread(new HW13_Task1_implRun()).start();

	}

}
