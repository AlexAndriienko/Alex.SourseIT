package ua.com.sourceit.AndriienkoHomework.HW7;
/* Звукозапись. Определить иерархию музыкальных композиций. Записать
на диск сборку. Подсчитать продолжительность. Провести перестановку
композиций диска на основе принадлежности к стилю. Найти композицию,
соответствующую заданному диапазону длины треков.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<MusicComposition> disc1 = new ArrayList<MusicComposition>(new MusicDisc().musicDiscRecorder());
		
		System.out.println("Music composition on disc:\n");
		DiscMusicPrinter.discMusicPrinter(disc1);
		DiscMusicDuration.discMusicDurationCounter(disc1);
		
		System.out.println("___________________________________________________________");
		System.out.println("Sort music composition by style:\n");
		DiscMusicPrinter.discMusicPrinter(new MusicStyleSorter().sortMusicByStyle(disc1));
		
		System.out.println("___________________________________________________________");
		System.out.println("Please, enter the range length of track for filter music:\n From:");
		int bottomTrackLengthRange = Integer.parseInt(reader.readLine());
		System.out.println(" To:");
		int topTrackLengthRange = Integer.parseInt(reader.readLine());
		DiscMusicPrinter.discMusicPrinter(new MusicTrackLengthFilter().filterMusicTrackByLength(disc1, bottomTrackLengthRange, topTrackLengthRange));
		
	}

}
