package com.bylkov.homework02.shop;

public class Laptop extends Product{

	private double batteryCapacity;
	private String operatingSystem;
	private int memoryROM;
	private int systemMemory;
	private double cpu;
	private int displayInchs;
	
	public Laptop(double batteryCapacity, String operatingSystem, int memoryROM, 
				int systemMemory, double cpu, int displayInchs, int price) {
		this.batteryCapacity = batteryCapacity;
		this.operatingSystem = operatingSystem;
		this.memoryROM = memoryROM;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
		this.setPrice(price);
	}
	
	public Laptop(String[] parameters) {
		this.batteryCapacity = Double.valueOf(parameters[0].split("=")[1]);
		this.operatingSystem = parameters[1].split("=")[1];
		this.memoryROM = Integer.valueOf(parameters[2].split("=")[1]);
		this.systemMemory = Integer.valueOf(parameters[3].split("=")[1]);
		this.cpu = Double.valueOf(parameters[4].split("=")[1]);
		this.displayInchs = Integer.valueOf(parameters[5].split("=")[1]);
		this.setPrice(Integer.valueOf(parameters[6].split("=")[1]));
	}
	
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

}
