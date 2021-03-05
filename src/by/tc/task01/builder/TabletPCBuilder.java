package by.tc.task01.builder;

import java.math.BigDecimal;
import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements ApplianceBuilder {

	private BigDecimal price;
	private int batteryCapacity;
	private int displayInches;
	private int memoryROM;
	private int flashMemoryCapacity;
	private String color;
	
	@Override
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public TabletPC getResult() {
		return new TabletPC(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color, price);
	}

}
