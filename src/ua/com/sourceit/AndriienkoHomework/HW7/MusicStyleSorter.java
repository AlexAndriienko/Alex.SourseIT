package ua.com.sourceit.AndriienkoHomework.HW7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MusicStyleSorter {

	public ArrayList<MusicComposition> sortMusicByStyle(ArrayList<MusicComposition> disc) {

		return (ArrayList<MusicComposition>) disc.stream()
				.sorted((music1, music2) -> music1.getStyle().compareTo(music2.getStyle()))
				.collect(Collectors.toList());
	}

}
