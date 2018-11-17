package ua.com.sourceit.AndriienkoHomework.HW7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MusicTrackLengthFilter {

	public ArrayList<MusicComposition> filterMusicTrackByLength(ArrayList<MusicComposition> disc1,
			int bottomTrackLengthRange, int topTrackLengthRange) {

		return (ArrayList<MusicComposition>) disc1.stream()
				.filter(music -> music.getTrackLength().getSeconds() > bottomTrackLengthRange
						&& music.getTrackLength().getSeconds() < topTrackLengthRange)
				.collect(Collectors.toList());
	}

}
