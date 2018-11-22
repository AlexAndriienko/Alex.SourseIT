package ua.com.sourceit.AndriienkoHomework.HW8;

import java.io.File;

public class HW8Task1_MainFileCount {
	static File file1 = new File("D:" + File.separator + "test");

	static int count1 = new HW8Task1_FileCount().fileCounting(file1);

	public static void main(String[] args) {
		System.out.println("in DIR " + file1.getAbsolutePath() + " file count: " + count1);

	}

}
