package c5usestream;

import java.util.List;
import java.util.stream.Collectors;

import util.ListFactory;

public class StreamFilter {
	
	/**
	 * 测试流谓词 去重 distinct
	 */
	public static void testPredicate() {
		List<Dish> vegetarianMenu = ListFactory.getMenu()
				.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		vegetarianMenu.forEach(System.out::println);
	}
	/**
	 * 测试截短limit skip跳过
	 */
	public static void testLimit() {
		ListFactory.getMenu().stream().filter(Dish::isVegetarian)
				.limit(1)
				.collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
//		testPredicate();
		testLimit();
	}
	
	

}
