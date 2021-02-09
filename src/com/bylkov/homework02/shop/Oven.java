package com.bylkov.homework02.shop;

public class Oven extends Product{
	
	private int powerConsumption;
	private int weight;
	private double capacity;
	private int depth;
	private double height;
	private double width;
	
	public Oven(int powerConsumption, int weight, double capacity, 
				int depth, double height, double width, int price) {
		//super(price);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
		this.setPrice(price);
	}
	
	public Oven(String[] parameters) {
		this.powerConsumption = Integer.valueOf(parameters[0].split("=")[1]);
		this.weight = Integer.valueOf(parameters[1].split("=")[1]);
		this.capacity = Double.valueOf(parameters[2].split("=")[1]);
		this.depth = Integer.valueOf(parameters[3].split("=")[1]);
		this.height = Double.valueOf(parameters[4].split("=")[1]);
		this.width = Double.valueOf(parameters[5].split("=")[1]);
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
	
	public int getDepth() {
		return depth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
}
