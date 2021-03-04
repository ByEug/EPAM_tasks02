package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private double batteryCapacity;
	private String operatingSystem;
	private int memoryROM;
	private int systemMemory;
	private double cpu;
	private int displayInchs;
	
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public Laptop getResult() {
		return new Laptop(batteryCapacity, operatingSystem, memoryROM, systemMemory, cpu, displayInchs, price);
	}

}
