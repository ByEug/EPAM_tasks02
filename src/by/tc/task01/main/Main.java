package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.IOException;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria firstCriteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		firstCriteriaOven.add(Oven.CAPACITY.toString(), 33);

		appliance = service.find(firstCriteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria secondCriteriaOven = new Criteria(Oven.class.getSimpleName());
		secondCriteriaOven.add(Oven.HEIGHT.toString(), 40);
		secondCriteriaOven.add(Oven.DEPTH.toString(), 60);

		appliance = service.find(secondCriteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
		
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		appliance = service.find(firstCriteriaOven, secondCriteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
