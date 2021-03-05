package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.Oven;

public class OvenBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int powerConsumption;
	private int weight;
	private double capacity;
	private int depth;
	private double height;
	private double width;
	
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


	public void setDepth(int depth) {
		this.depth = depth;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public Oven getResult() {
		return new Oven(powerConsumption, weight, capacity, depth, height, width, price);
	}

}
