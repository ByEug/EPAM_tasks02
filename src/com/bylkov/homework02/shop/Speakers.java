package com.bylkov.homework02.shop;

public class Speakers extends Product{

	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;
	
	public Speakers(int powerConsumption, int numberOfSpeakers, 
				    String frequencyRange, int cordLength, int price) {
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
		this.setPrice(price);
	}
	
	public Speakers(String[] parameters) {
		this.powerConsumption = Integer.valueOf(parameters[0].split("=")[1]);
		this.numberOfSpeakers = Integer.valueOf(parameters[1].split("=")[1]);
		this.frequencyRange = parameters[2].split("=")[1];
		this.cordLength = Integer.valueOf(parameters[3].split("=")[1]);
		this.setPrice(Integer.valueOf(parameters[4].split("=")[1]));
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

}
