package ua.com.sourceit.AndriienkoHomework.HW6;

public abstract class Sweets {
	private String name;
	private double weight;
	private double sugar—ontent;
	
	public Sweets(String name, double sugar—ontent, double weight) {
		this.name = name;
		this.sugar—ontent = sugar—ontent;
		this.weight = weight;
	}

	public double getSugar—ontent() {
		return sugar—ontent;
	}

	public void setSugar—ontent(double sugar—ontent2) {
		this.sugar—ontent = sugar—ontent2;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
