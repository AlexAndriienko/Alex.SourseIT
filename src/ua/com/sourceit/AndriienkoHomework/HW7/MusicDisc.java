package ua.com.sourceit.AndriienkoHomework.HW7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

public class MusicDisc {
	Random random = new Random();
	ArrayList<MusicComposition> MusicDisc1 = new ArrayList<MusicComposition>();

	public ArrayList<MusicComposition> musicDiscRecorder() {

		for (int i = 1; i <= 10; i++) {
			MusicDisc1.add(new RockMusic("RockMusic " + i, "Performer " + i, Duration.ofSeconds(random.nextInt(1000 - 1) + 1)));
			MusicDisc1.add(new PopMusic("PopMusic " + i, "Performer " + i, Duration.ofSeconds(random.nextInt(1000 - 1) + 1)));
			MusicDisc1.add(new ClassicMusic("ClassicMusic" + i, "Performer " + i, Duration.ofSeconds(random.nextInt(1000 - 1) + 1)));
		}

		return MusicDisc1;
	}
}
