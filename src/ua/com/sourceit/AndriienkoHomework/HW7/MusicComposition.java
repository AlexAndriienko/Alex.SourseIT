package ua.com.sourceit.AndriienkoHomework.HW7;

import java.time.Duration;

public abstract class MusicComposition {
	private String style;
	private String name;
	private String performer;
	private Duration trackLength;
	
	
	public MusicComposition(String style, String name, String performer, Duration trackLength) {
		this.setStyle(style);
		this.name = name;
		this.setPerformer(performer);
		this.trackLength = trackLength;
	}
	
	public Duration getTrackLength() {
		return trackLength;
	}
	
	public void setTrackLength(Duration trackLength) {
		this.trackLength = trackLength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
}
