package ua.com.sourceit.AndriienkoHomework.HW8;

import java.io.File;
import java.util.ArrayList;

public class HW8Task3_MainFileJavaSearch {
	static File file1 = new File("D:" + File.separator + "test");

	public static void main(String[] args) {

		ArrayList<File> files = (ArrayList<File>) new HW8Task3_FileJavaSearch().fileSeach(file1, 3);

		for (File file1 : files) {
			System.out.print(file1.getName() + " ");
		}

	}

}
