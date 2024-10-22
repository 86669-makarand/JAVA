package com.app.fruits;

public class Apple extends Fruit
{
	String name;
	String color;
	double weight;
	
	
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, true);
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet n sour";
	}



	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
