package by.tc.task01.entity;

import java.math.BigDecimal;

public class VacuumCleaner extends Appliance{
	
	private final int powerConsumption;
	private final char filterType;
	private final String bagType;
	private final String wandType;
	private final int motorSpeedRegulation;
	private final int cleaningWidth;
	
	public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType,
						 int motorSpeedRegulation, int cleaningWidth, BigDecimal price) {
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
		this.setPrice(price);
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public char getFilterType() {
		return filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + filterType;
		result = prime * result + motorSpeedRegulation;
		result = prime * result + powerConsumption;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType != other.filterType)
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}
	
	
}
