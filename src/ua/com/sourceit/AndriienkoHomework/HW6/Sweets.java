package ua.com.sourceit.AndriienkoHomework.HW6;

public abstract class Sweets {
	private String name;
	private double weight;
	private double sugarŅontent;
	
	public Sweets(String name, double sugarŅontent, double weight) {
		this.name = name;
		this.sugarŅontent = sugarŅontent;
		this.weight = weight;
	}

	public double getSugarŅontent() {
		return sugarŅontent;
	}

	public void setSugarŅontent(double sugarŅontent2) {
		this.sugarŅontent = sugarŅontent2;
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
