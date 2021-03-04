package by.tc.task01.entity;

import java.math.BigDecimal;

public class Oven extends Appliance {
	
	private final int powerConsumption;
	private final int weight;
	private final double capacity;
	private final int depth;
	private final double height;
	private final double width;
	
	public Oven(int powerConsumption, int weight, double capacity, 
				int depth, double height, double width, BigDecimal price) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
		this.setPrice(price);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + depth;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (depth != other.depth)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	
}
