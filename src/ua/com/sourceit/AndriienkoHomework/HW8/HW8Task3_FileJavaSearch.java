package ua.com.sourceit.AndriienkoHomework.HW8;

import java.io.File;
import java.util.ArrayList;

// Написать метод, который принимает директорию, и расширения файла.
// Подсчитать общее количество файлов с заданным расширением рекурсивно начиная от этой директории. 

public class HW8Task3_FileJavaSearch {
	ArrayList<File> files = new ArrayList<File>();
	int depth;

	public ArrayList<File> fileSeach(File file, int searchDepth) {

		File[] list = file.listFiles();

		for (File file1 : list) {
			if (file1.isDirectory()) {
				depth++;
				if (depth == searchDepth)
					break;

				fileSeach(file1, searchDepth);

			} else if (file1.getPath().toString().endsWith(".java")) {
				files.add(file1);
			}
		}
		return files;
	}
}