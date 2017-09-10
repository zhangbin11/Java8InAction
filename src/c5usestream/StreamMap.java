package c5usestream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	
	public static void testMap() {
		List<Integer> list = Arrays.asList(1,2,3);
		list.stream().map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public static void testFlatMap() {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(3,4);
		list1.stream().flatMap(i->list2.stream().map(j-> new int[] {i,j}))
		.collect(Collectors.toList()).forEach(ints->System.out.println(Arrays.toString(ints)));
		
	}
	
	public static void main(String[] args) {
//		testMap();
		testFlatMap();
	}

}
