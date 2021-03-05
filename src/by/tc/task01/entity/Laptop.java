package by.tc.task01.entity;

import java.math.BigDecimal;

public class Laptop extends Appliance {
	
	private final double batteryCapacity;
	private final String operatingSystem;
	private final int memoryROM;
	private final int systemMemory;
	private final double cpu;
	private final int displayInchs;
	
	public Laptop(double batteryCapacity, String operatingSystem, int memoryROM, 
				int systemMemory, double cpu, int displayInchs, BigDecimal price) {
		this.batteryCapacity = batteryCapacity;
		this.operatingSystem = operatingSystem;
		this.memoryROM = memoryROM;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
		this.setPrice(price);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + displayInchs;
		result = prime * result + memoryROM;
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
	
	

}
