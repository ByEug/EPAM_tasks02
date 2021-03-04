package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import by.tc.task01.builder.ApplianceBuilder;
import by.tc.task01.builder.Director;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import by.tc.task01.exception.FileNotFoundRuntimeException;
import by.tc.task01.service.parsing.Parser;

public class ApplianceDAOImpl implements ApplianceDAO {
	
	private final File dataBaseFile = new File("resources/appliances_db.txt");
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private Director builderDirector;
	
	public static ApplianceDAO getInstance() {
		return SingletonHolder.instance;
	}
	
	private static class SingletonHolder {
		private static final ApplianceDAO instance = new ApplianceDAOImpl();
	}
	
	private ApplianceDAOImpl() {
		builderDirector = Director.getInstance();
	}
	
	@Override
	public Appliance find(Criteria criteria) throws IOException {
		// you may add your own code here
		
		openReader();
		String applianceString = bufferedReader.readLine();
		while (applianceString != null) {
			if (!applianceString.isEmpty()) {
				String[] applianceNameAndFields = applianceString.split(" : ");
				String[] applianceFieldsWithValues = applianceNameAndFields[1].split(", ");
				if (checkAppliance(applianceNameAndFields, applianceFieldsWithValues, criteria)) {
					ApplianceBuilder builder = builderDirector.getBuilder(criteria.getGroupSearchName(), applianceFieldsWithValues);
					Appliance appliance = builder.getResult();
					return appliance;
				}
			}
			applianceString = bufferedReader.readLine();
		}
		closeReader();
		return null;
	}
	
	// you may add your own code here
	
	private boolean checkAppliance(String[] applianceNameAndFields, String[] applianceFieldsWithValues, Criteria criteria) {
		if (applianceNameAndFields[0].equals(criteria.getGroupSearchName())) {
			Map<String, Object> criteriaMap = criteria.getCriteria();
			Map<String, String> parametersMap = Parser.parseParametersArrayToMap(applianceFieldsWithValues);
			return compareMaps(criteriaMap, parametersMap);
		}
		return false;
	}
	
	private boolean compareMaps(Map<String, Object> criteriaMap, Map<String, String> parametersMap) {
		if (!criteriaMap.isEmpty()) {
			Set<String> criteriaKeys = criteriaMap.keySet();
			for (String key : criteriaKeys) {
				if (!criteriaMap.get(key).toString().equals(parametersMap.get(key))) {
					return false;
				}
			}
		}
		return true;
	}
	
	private void openReader() {
		try {
			fileReader = new FileReader(dataBaseFile);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundRuntimeException();
		}
		bufferedReader = new BufferedReader(fileReader);
	}
	
	private void closeReader() throws IOException {
		bufferedReader.close();
	}
}


//you may add your own new classes