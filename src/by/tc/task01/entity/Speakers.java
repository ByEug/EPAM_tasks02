package by.tc.task01.entity;

import java.math.BigDecimal;

public class Speakers extends Appliance {
	
	private final int powerConsumption;
	private final int numberOfSpeakers;
	private final String frequencyRange;
	private final int cordLength;
	
	public Speakers(int powerConsumption, int numberOfSpeakers, 
				    String frequencyRange, int cordLength, BigDecimal price) {
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
		this.setPrice(price);
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLength;
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
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
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}
	
	
}
