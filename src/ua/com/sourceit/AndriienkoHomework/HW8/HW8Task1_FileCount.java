package ua.com.sourceit.AndriienkoHomework.HW8;

import java.io.File;

// Написать метод, который принимает директорию, и расширения файла.
// Подсчитать общее количество файлов с заданным расширением рекурсивно начиная от этой директории. 

public class HW8Task1_FileCount {
	int fileCount;

	public int fileCounting(File file) {

		File[] list = file.listFiles();
		
		for (File file1 : list) {
			if (file1.isDirectory()) {
				fileCounting(file1);
				
				
			} else if (file1.getPath().toString().endsWith(".txt")) {
				fileCount++;
				
			}
		}
		return fileCount;		
	}
}