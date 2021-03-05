package by.tc.task01.entity;

import java.math.BigDecimal;

public class Kettle extends Appliance {

	private final int powerConsumption;
	private final int weight;
	private final double capacity;
	private final String color;
	private final String material;
	private final double cordLength;
	
	public Kettle(int powerConsumption, int weight, double capacity, 
				  String color, String material, double cordLength, BigDecimal price) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.color = color;
		this.material = material;
		this.cordLength = cordLength;
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
	
	public String getColor() {
		return color;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public double getCordLength() {
		return cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		temp = Double.doubleToLongBits(cordLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kettle other = (Kettle) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(cordLength) != Double.doubleToLongBits(other.cordLength))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
	
}
