package com.bylkov.homework02.shop;

public class Refrigerator extends Product{

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private int height;
	private int width;
	
	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, 
			double overallCapacity, int height, int width, int price) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
		this.setPrice(price);
	}
	
	public Refrigerator(String[] parameters) {
		this.powerConsumption = Integer.valueOf(parameters[0].split("=")[1]);
		this.weight = Integer.valueOf(parameters[1].split("=")[1]);
		this.freezerCapacity = Integer.valueOf(parameters[2].split("=")[1]);
		this.overallCapacity = Double.valueOf(parameters[3].split("=")[1]);
		this.height = Integer.valueOf(parameters[4].split("=")[1]);
		this.width = Integer.valueOf(parameters[5].split("=")[1]);
		this.setPrice(Integer.valueOf(parameters[6].split("=")[1]));
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}
