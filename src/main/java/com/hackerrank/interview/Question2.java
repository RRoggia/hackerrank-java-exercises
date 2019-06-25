package com.hackerrank.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question2 {
	private static final String ITALIAN = "Italian";
	private static final String CHINESE = "Chinese";
	private static final String MEXICAN = "Mexican";
	private static final String JAPANESE = "Japanese";

	public static void main(String[] args) {
		if (!(FoodFactory.getInstance() == FoodFactory.getInstance()))
			throw new RuntimeException("Singleton not correctly");

		FoodFactory foodFactory = FoodFactory.getInstance();

		Cuisine japanese = new Japanese();
		Cuisine mexican = new Mexican();
		Cuisine chinese = new Chinese();
		Cuisine italian = new Italian();

		foodFactory.registerCuisine(JAPANESE, japanese);
		foodFactory.registerCuisine(MEXICAN, mexican);
		foodFactory.registerCuisine(CHINESE, chinese);
		foodFactory.registerCuisine(ITALIAN, italian);

		try {
			if (!(foodFactory.serveCuisine(JAPANESE, "whatever") == japanese)
					|| !(foodFactory.serveCuisine(MEXICAN, "whatever") == mexican)
					|| !(foodFactory.serveCuisine(CHINESE, "whatever") == chinese)
					|| !(foodFactory.serveCuisine(ITALIAN, "whatever") == italian))
				throw new RuntimeException("Didnot implement factory correctly");

			if (!(((Japanese) foodFactory.serveCuisine(JAPANESE, "something")).getDish() == "something")
					|| !(((Mexican) foodFactory.serveCuisine(MEXICAN, "something1")).getDish() == "something1")
					|| !(((Chinese) foodFactory.serveCuisine(CHINESE, "something2")).getDish() == "something2")
					|| !(((Italian) foodFactory.serveCuisine(ITALIAN, "something3")).getDish() == "something3"))
				throw new RuntimeException("didn't called the serve dish correctly");

		} catch (UnableToServeDish e) {
			throw new RuntimeException("Didnot implement valid cuisines correctly");
		}

		try {
			foodFactory.serveCuisine("Greek", "wrong");
		} catch (UnableToServeDish e) {
			if (!e.getErrorMessage().contains("Greek") || !e.getErrorMessage().contains("wrong"))
				throw new RuntimeException("Didnt throw exception as expected");

		}

		System.out.println("It worked, no exception thrown");

	}
}

class FoodFactory {
	private static final Set<String> VALID_CUISINES = new HashSet<>();
	private static final Map<String, Cuisine> CUISINES = new HashMap<>();
	private static final FoodFactory INSTANCE = new FoodFactory();

	static {
		VALID_CUISINES.add("Mexican");
		VALID_CUISINES.add("Japanese");
		VALID_CUISINES.add("Chinese");
		VALID_CUISINES.add("Italian");
	}

	private FoodFactory() {
	}

	public static FoodFactory getInstance() {
		return INSTANCE;
	}

	public void registerCuisine(String cuisineName, Cuisine cuisine) {
		if (!VALID_CUISINES.contains(cuisineName))
			return; // I don't remeber if I should throw an exception here.

		CUISINES.put(cuisineName, cuisine);
	}

	public Cuisine serveCuisine(String cuisineName, String dish) throws UnableToServeDish {
		if (!CUISINES.containsKey(cuisineName))
			throw new UnableToServeDish("Unable to serve " + cuisineName + " and dish " + dish);

		return CUISINES.get(cuisineName).serveDish(dish);
	}
}

class UnableToServeDish extends Exception {
	private String message;

	public UnableToServeDish(String message) {
		this.message = message;
	}

	public String getErrorMessage() {
		return this.message;
	}

}

abstract class Cuisine {
	public abstract Cuisine serveDish(String dish);
}

class Mexican extends Cuisine {
	private String dish;

	public String getDish() {
		return dish;
	}

	@Override
	public Cuisine serveDish(String dish) {
		this.dish = dish;
		return this;
	}
}

class Chinese extends Cuisine {
	private String dish;

	public String getDish() {
		return dish;
	}

	@Override
	public Cuisine serveDish(String dish) {
		this.dish = dish;
		return this;
	}
}

class Japanese extends Cuisine {
	private String dish;

	public String getDish() {
		return dish;
	}

	@Override
	public Cuisine serveDish(String dish) {
		this.dish = dish;
		return this;
	}
}

class Italian extends Cuisine {
	private String dish;

	public String getDish() {
		return dish;
	}

	@Override
	public Cuisine serveDish(String dish) {
		this.dish = dish;
		return this;
	}
}
