package com.app.fruits;

public class Orange extends Fruit
{
	String name;
	String color;
	double weight;
	
	
	
	public Orange()
	{
	}

	public Orange(String name, String color, double weight, boolean isFresh)
	{
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
		return "sour";
	}

	@Override
	public String toString() {
		return "Orange [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
