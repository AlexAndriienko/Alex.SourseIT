package ua.com.sourceit.AndriienkoHomework.HW6;

public abstract class Sweets {
	private String name;
	private double weight;
	private double sugarContent;
	
	public Sweets(String name, double sugarContent, double weight) {
		this.name = name;
		this.sugarContent = sugarContent;
		this.weight = weight;
	}

	public double getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(double sugarContent2) {
		this.sugarContent = sugarContent2;
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
