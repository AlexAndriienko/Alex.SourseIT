package ua.com.sourceit.AndriienkoHomework.HW7;

import java.util.ArrayList;

public class DiscMusicPrinter {
	public static void discMusicPrinter(ArrayList<MusicComposition> disc) {
		for (MusicComposition musicComposition : disc) {
			System.out.println(musicComposition.getStyle() + " " + musicComposition.getName() + " " + musicComposition.getPerformer() + " Length of track: "+ musicComposition.getTrackLength().getSeconds() + " s;");
		}
	}

}
