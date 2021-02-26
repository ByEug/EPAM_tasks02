package com.bylkov.homework02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bylkov.homework02.model.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Product> products = new ArrayList<>();
		
		File file = new File("D:/Workspace/Task02/appliances_db.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String productItem = reader.readLine();
		while (productItem != null) {
			if (!productItem.isEmpty()) {
				
				String[] productNameAndFields = productItem.split(" : ");
				String[] productFields = productNameAndFields[1].split(", ");
				
				switch(productNameAndFields[0]) {
					case ("Oven"):{
						products.add(new Oven(productFields));
						break;
					}
					case ("Laptop"):{
						products.add(new Laptop(productFields));
						break;
					}
					case ("Refrigerator"):{
						products.add(new Refrigerator(productFields));
						break;
					}
					case ("Kettle"):{
						products.add(new Kettle(productFields));
						break;
					}
					case ("Speakers"):{
						products.add(new Speakers(productFields));
						break;
					}
					case ("TabletPC"):{
						products.add(new TabletPC(productFields));
						break;
					}
					case ("VacuumCleaner"):{
						products.add(new VacuumCleaner(productFields));
						break;
					}
					default: {
						break;
					}
				}
			}
			productItem = reader.readLine();
		}
		reader.close();
		
		List<Kettle> kettles = allKettles(products);
		outputKettles(kettles);
		System.out.println("Min price: " + countMinPrice(products));
	}
	
	private static int countMinPrice(List<Product> countList) {
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < countList.size(); i++) {
			if (countList.get(i).getPrice() <= minPrice) {
				minPrice = countList.get(i).getPrice();
			}
		}
		return minPrice;
	}
	
	private static void outputKettles(List<Kettle> kettles) {
		System.out.println("All kettles:");
		for (Kettle kettle : kettles) {
			System.out.println(kettle.getMaterial() + " " + kettle.getCapacity() + " " + kettle.getPrice());
		}
	}
	
	private static List<Kettle> allKettles(List<Product> products) {
		List<Kettle> kettles = new ArrayList<>();
		for (Product product : products) {
			if (product instanceof Kettle) {
				kettles.add((Kettle) product);
			}
		}
		return kettles;
	}
}
