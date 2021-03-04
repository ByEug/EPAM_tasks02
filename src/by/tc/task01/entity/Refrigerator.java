package by.tc.task01.entity;

import java.math.BigDecimal;

public class Refrigerator extends Appliance{
	
	private final int powerConsumption;
	private final int weight;
	private final int freezerCapacity;
	private final double overallCapacity;
	private final int height;
	private final int width;
	
	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, 
			double overallCapacity, int height, int width, BigDecimal price) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		long temp;
		temp = Double.doubleToLongBits(overallCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + width;
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
}
