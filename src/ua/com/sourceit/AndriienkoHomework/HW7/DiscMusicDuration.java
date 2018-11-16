package ua.com.sourceit.AndriienkoHomework.HW7;

import java.util.ArrayList;

public class DiscMusicDuration {

	public static void discMusicDurationCounter(ArrayList<MusicComposition> disc) {
		int durationMusicComposition = 0;
		for (MusicComposition musicComposition : disc) {

			durationMusicComposition += musicComposition.getTrackLength().getSeconds();

		}

		System.out.println("\nTotal duration music on disc:" + durationMusicComposition + " seconds or "
				+ ((double) Math.round(durationMusicComposition / 36.0))/100 + " hour(s)");
	}

}
