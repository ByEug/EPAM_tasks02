package by.tc.task01.builder;

import java.math.BigDecimal;

import by.tc.task01.entity.Kettle;

public class KettleBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int powerConsumption;
	private int weight;
	private double capacity;
	private String color;
	private String material;
	private double cordLength;
	
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}
	
	@Override
	public Kettle getResult() {
		return new Kettle(powerConsumption, weight, capacity, color, material, cordLength, price);
	}

}
