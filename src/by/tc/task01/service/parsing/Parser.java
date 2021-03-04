package by.tc.task01.service.parsing;

import java.util.HashMap;
import java.util.Map;

public class Parser {

	public static Map<String, String> parseParametersArrayToMap(String[] parameters) {
		Map<String, String> parametersMap = new HashMap<>();
		for (String item : parameters) {
			parametersMap.put(item.split("=")[0], item.split("=")[1]);
		}
		return parametersMap;
	}
}
