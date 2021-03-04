package by.tc.task01.builder;

import java.math.BigDecimal;

import by.tc.task01.entity.Appliance;

public interface ApplianceBuilder {
	void setPrice(BigDecimal price);
	public Appliance getResult();
}
