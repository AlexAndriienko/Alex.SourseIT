package ua.com.sourceit.AndriienkoHomework.HW13;

/*Задание 1
Создать дочерний поток, который бы в течение примерно 5 сек печатал свое имя 
каждые полсекунды. Сделать это двумя способами - при помощи расширения класса 
Thread и при помощи реализации интерфейса Runnable.
*/

public class HW13_Task1_extThr extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(500);
				System.out.println(HW13_Task1_extThr.class);
			} catch (InterruptedException e) {
			}

		}
	}

	public static void main(String[] args) {
		new HW13_Task1_extThr().start();

	}

}
