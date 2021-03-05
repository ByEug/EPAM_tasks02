package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.Speakers;

public class SpeakersBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;
	
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}


	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}


	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public Speakers getResult() {
		return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength, price);
	}

}
