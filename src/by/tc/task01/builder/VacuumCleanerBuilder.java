package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int powerConsumption;
	private char filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	
	
	public void setFilterType(char filterType) {
		this.filterType = filterType;
	}


	public void setBagType(String bagType) {
		this.bagType = bagType;
	}


	public void setWandType(String wandType) {
		this.wandType = wandType;
	}


	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}


	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public VacuumCleaner getResult() {
		return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth, price);
	}

}
