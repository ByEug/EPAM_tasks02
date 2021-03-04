package by.tc.task01.builder;

import java.math.BigDecimal;

public class Director {
	
	public static Director getInstance() {
		return SingletonHolder.instance;
	}
	
	private static class SingletonHolder {
		private static final Director instance = new Director();
	}
	
	public ApplianceBuilder getBuilder(String searchName, String[] parameters) {
		switch (searchName) {
			case ("Oven"): {
				OvenBuilder builder = new OvenBuilder();
				createOven(builder, parameters);
				return builder;
			}
			case ("Laptop"): {
				LaptopBuilder builder = new LaptopBuilder();
				createLaptop(builder, parameters);
				return builder;
			}
			case ("Kettle"): {
				KettleBuilder builder = new KettleBuilder();
				createKettle(builder, parameters);
				return builder;
			}
			case ("Refrigerator"): {
				RefrigeratorBuilder builder = new RefrigeratorBuilder();
				createRefrigerator(builder, parameters);
				return builder;
			}
			case ("Speakers"): {
				SpeakersBuilder builder = new SpeakersBuilder();
				createSpeakers(builder, parameters);
				return builder;
			}
			case ("TabletPC"): {
				TabletPCBuilder builder = new TabletPCBuilder();
				createTabletPC(builder, parameters);
				return builder;
			}
			case ("VacuumCleaner"): {
				VacuumCleanerBuilder builder = new VacuumCleanerBuilder();
				createVacuumCleaner(builder, parameters);
				return builder;
			}
			default: {
				return null;
			}
		}
	}
	
	public void createOven(OvenBuilder builder, String[] parameters) {
		builder.setPowerConsumption(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setWeight(Integer.valueOf(parameters[1].split("=")[1]));
		builder.setCapacity(Double.valueOf(parameters[2].split("=")[1]));
		builder.setDepth(Integer.valueOf(parameters[3].split("=")[1]));
		builder.setHeight(Double.valueOf(parameters[4].split("=")[1]));
		builder.setWidth(Double.valueOf(parameters[5].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[6].split("=")[1])));
	}
	
	public void createLaptop(LaptopBuilder builder, String[] parameters) {
		builder.setBatteryCapacity(Double.valueOf(parameters[0].split("=")[1]));
		builder.setOperatingSystem(parameters[1].split("=")[1]);
		builder.setMemoryROM(Integer.valueOf(parameters[2].split("=")[1]));
		builder.setSystemMemory(Integer.valueOf(parameters[3].split("=")[1]));
		builder.setCpu(Double.valueOf(parameters[4].split("=")[1]));
		builder.setDisplayInchs(Integer.valueOf(parameters[5].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[6].split("=")[1])));
	}
	
	public void createKettle(KettleBuilder builder, String[] parameters) {
		builder.setPowerConsumption(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setWeight(Integer.valueOf(parameters[1].split("=")[1]));
		builder.setCapacity(Double.valueOf(parameters[2].split("=")[1]));
		builder.setColor(parameters[3].split("=")[1]);
		builder.setMaterial(parameters[4].split("=")[1]);
		builder.setCordLength(Double.valueOf(parameters[5].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[6].split("=")[1])));
	}
	
	public void createRefrigerator(RefrigeratorBuilder builder, String[] parameters) {
		builder.setPowerConsumption(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setWeight(Integer.valueOf(parameters[1].split("=")[1]));
		builder.setFreezerCapacity(Integer.valueOf(parameters[2].split("=")[1]));
		builder.setOverallCapacity(Double.valueOf(parameters[3].split("=")[1]));
		builder.setHeight(Integer.valueOf(parameters[4].split("=")[1]));
		builder.setWidth(Integer.valueOf(parameters[5].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[6].split("=")[1])));
	}
	
	public void createSpeakers(SpeakersBuilder builder, String[] parameters) {
		builder.setPowerConsumption(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setNumberOfSpeakers(Integer.valueOf(parameters[1].split("=")[1]));
		builder.setFrequencyRange(parameters[2].split("=")[1]);
		builder.setCordLength(Integer.valueOf(parameters[3].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[4].split("=")[1])));
	}
	
	public void createTabletPC(TabletPCBuilder builder, String[] parameters) {
		builder.setBatteryCapacity(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setDisplayInches(Integer.valueOf(parameters[1].split("=")[1]));
		builder.setMemoryROM(Integer.valueOf(parameters[2].split("=")[1]));
		builder.setFlashMemoryCapacity(Integer.valueOf(parameters[3].split("=")[1]));
		builder.setColor(parameters[4].split("=")[1]);
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[5].split("=")[1])));
	}
	
	public void createVacuumCleaner(VacuumCleanerBuilder builder, String[] parameters) {
		builder.setPowerConsumption(Integer.valueOf(parameters[0].split("=")[1]));
		builder.setFilterType(parameters[1].split("=")[1].charAt(0));
		builder.setBagType(parameters[2].split("=")[1]);
		builder.setWandType(parameters[3].split("=")[1]);
		builder.setMotorSpeedRegulation(Integer.valueOf(parameters[4].split("=")[1]));
		builder.setCleaningWidth(Integer.valueOf(parameters[5].split("=")[1]));
		builder.setPrice(BigDecimal.valueOf(Long.valueOf(parameters[6].split("=")[1])));
	}
}
