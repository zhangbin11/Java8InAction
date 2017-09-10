package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import c5usestream.Dish;
import c5usestream.Dish.Type;

public class ListFactory {

	public static List<Dish> getMenu() {
		return Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
				new Dish("beef", false, 700, Type.MEAT),
				new Dish("chicken", false, 400, Type.MEAT),
				new Dish("french fries", true, 530, Type.OTHER),
				new Dish("rice", true, 350, Type.OTHER),
				new Dish("season fruit", true, 120, Type.OTHER),
				new Dish("pizza", true, 550, Type.OTHER),
				new Dish("prawns", false, 300, Type.FISH),
				new Dish("salmon", false, 450, Type.FISH));
	}
}
