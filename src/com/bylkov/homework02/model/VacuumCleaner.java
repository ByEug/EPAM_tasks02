package com.bylkov.homework02.model;

public class VacuumCleaner extends Product {

	private int powerConsumption;
	private char filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType,
						 int motorSpeedRegulation, int cleaningWidth, int price) {
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
		this.setPrice(price);
	}
	
	public VacuumCleaner(String[] parameters) {
		this.powerConsumption = Integer.valueOf(parameters[0].split("=")[1]);
		this.filterType = parameters[1].split("=")[1].charAt(0);
		this.bagType = parameters[2].split("=")[1];
		this.wandType = parameters[3].split("=")[1];
		this.motorSpeedRegulation = Integer.valueOf(parameters[4].split("=")[1]);
		this.cleaningWidth = Integer.valueOf(parameters[5].split("=")[1]);
		this.setPrice(Integer.valueOf(parameters[6].split("=")[1]));
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
}
