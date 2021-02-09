package com.bylkov.homework02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bylkov.homework02.shop.*;

public class Main {
	
	private static int minPrice = Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		List<Product> ovens = new ArrayList<>();
		List<Product> laptops = new ArrayList<>();
		List<Product> kettles = new ArrayList<>();
		List<Product> refrigerators = new ArrayList<>();
		List<Product> speakers = new ArrayList<>();
		List<Product> tablets = new ArrayList<>();
		List<Product> cleaners = new ArrayList<>();
		
		try {
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
							ovens.add((Product) new Oven(productFields));
							break;
						}
						case ("Laptop"):{
							laptops.add((Product) new Laptop(productFields));
							break;
						}
						case ("Refrigerator"):{
							refrigerators.add((Product) new Refrigerator(productFields));
							break;
						}
						case ("Kettle"):{
							kettles.add((Product) new Kettle(productFields));
							break;
						}
						case ("Speakers"):{
							speakers.add((Product) new Speakers(productFields));
							break;
						}
						case ("TabletPC"):{
							tablets.add((Product) new TabletPC(productFields));
							break;
						}
						case ("VacuumCleaner"):{
							cleaners.add((Product) new VacuumCleaner(productFields));
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
		}
		catch (IOException e) {
			System.out.println("File error");
		}
		
		allKettles(kettles);

		countMinPrice(ovens);
		countMinPrice(laptops);
		countMinPrice(refrigerators);
		countMinPrice(kettles);
		countMinPrice(speakers);
		countMinPrice(tablets);
		countMinPrice(cleaners);
		
		System.out.println("Min price: " + minPrice);
	}
	
	private static void countMinPrice(List<Product> countList) {
		for(int i = 0; i < countList.size(); i++) {
			if (countList.get(i).getPrice() <= minPrice) {
				minPrice = countList.get(i).getPrice();
			}
		}
	}
	
	private static void allKettles(List<Product> kettles) {
		System.out.println("All kettles:");
		for (Product kettle : kettles) {
			System.out.println("capacity: " + ((Kettle) kettle).getCapacity() + " " +
							   "material: " + ((Kettle) kettle).getMaterial());
		}
	}
}
