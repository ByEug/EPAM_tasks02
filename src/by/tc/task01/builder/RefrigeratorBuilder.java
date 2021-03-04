package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private int height;
	private int width;
	
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


	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}


	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public Refrigerator getResult() {
		return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width, price);
	}

}
