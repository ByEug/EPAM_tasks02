package by.tc.task01.entity;

import java.math.BigDecimal;

public class TabletPC extends Appliance {
	
	private final int batteryCapacity;
	private final int displayInches;
	private final int memoryROM;
	private final int flashMemoryCapacity;
	private final String color;
	
	public TabletPC(int batteryCapacity, int displayInches, int memoryROM, 
					int flashMemoryCapacity, String color, BigDecimal price) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
		this.setPrice(price);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryROM;
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}
	
	
}
