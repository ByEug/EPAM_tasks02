package by.tc.task01.service.impl;

import java.io.IOException;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	private DAOFactory factory = DAOFactory.getInstance();
	private ApplianceDAO applianceDAO = factory.getApplianceDAO();
	
	@Override
	public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}
}

//you may add your own new classes
