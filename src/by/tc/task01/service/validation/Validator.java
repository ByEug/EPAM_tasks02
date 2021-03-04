package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		if (criteria.getGroupSearchName() == null || criteria.getGroupSearchName().isEmpty()) {
			return false;
		}
		return true;
	}
}

//you may add your own new classes