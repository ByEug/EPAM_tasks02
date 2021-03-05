package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		// you may add your own code here
		if (appliance != null) {
			System.out.println(appliance.getClass() + " Price: " + appliance.getPrice());
		} else {
			System.out.println("No items with this parameters");
		}
	}
	
	// you may add your own code here
}
