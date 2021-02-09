package com.bylkov.homework02.shop;

public class Kettle extends Product{

	private int powerConsumption;
	private int weight;
	private double capacity;
	private String color;
	private String material;
	private double cordLength;
	
	public Kettle(int powerConsumption, int weight, double capacity, 
				  String color, String material, double cordLength, int price) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.color = color;
		this.material = material;
		this.cordLength = cordLength;
		this.setPrice(price);
	}
	
	public Kettle(String[] parameters) {
		this.powerConsumption = Integer.valueOf(parameters[0].split("=")[1]);
		this.weight = Integer.valueOf(parameters[1].split("=")[1]);
		this.capacity = Double.valueOf(parameters[2].split("=")[1]);
		this.color = parameters[3].split("=")[1];
		this.material = parameters[4].split("=")[1];
		this.cordLength = Double.valueOf(parameters[5].split("=")[1]);
		this.setPrice(Integer.valueOf(parameters[6].split("=")[1]));
	}
	
	public int getPowerConsumption() {
		return powerConsumption;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public double getCordLength() {
		return cordLength;
	}
	
}
