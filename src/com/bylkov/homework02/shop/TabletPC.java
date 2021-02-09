package com.bylkov.homework02.shop;

public class TabletPC extends Product{

	private int batteryCapacity;
	private int displayInches;
	private int memoryROM;
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC(int batteryCapacity, int displayInches, int memoryROM, 
					int flashMemoryCapacity, String color, int price) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
		this.setPrice(price);
	}
	
	public TabletPC(String[] parameters) {
		this.batteryCapacity = Integer.valueOf(parameters[0].split("=")[1]);
		this.displayInches = Integer.valueOf(parameters[1].split("=")[1]);
		this.memoryROM = Integer.valueOf(parameters[2].split("=")[1]);
		this.flashMemoryCapacity = Integer.valueOf(parameters[3].split("=")[1]);
		this.color = parameters[4].split("=")[1];
		this.setPrice(Integer.valueOf(parameters[5].split("=")[1]));
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public int getDisplayInches() {
		return displayInches;
	}
	
	public int getMemoryROM() {
		return memoryROM;
	}
	
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	
	public String getColor() {
		return color;
	}

}
