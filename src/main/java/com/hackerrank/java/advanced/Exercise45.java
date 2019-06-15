package com.hackerrank.java.advanced;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise45 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise45.txt");
		try (Scanner scan = new Scanner(System.in);) {

			FoodFactory foodFactory = new FoodFactory();

			String cake = scan.nextLine();
			Food food = foodFactory.getFood(cake);

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());

			String pizza = scan.nextLine();
			food = foodFactory.getFood(pizza);

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());

		}
	}

}

interface Food {
	public String getType();
}

class Pizza implements Food {
	@Override
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {
	@Override
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {
		switch (order) {
		case "cake":
			return new Cake();
		case "pizza":
			return new Pizza();
		default:
			return null;
		}
	}
}