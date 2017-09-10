package c5usestream;

import java.util.stream.IntStream;

public class NumberStream {
	
	/**
	 * 数值流自动装箱 解箱 IntStream LongStream DoubleStream
	 */
	public static void abc() {
		IntStream.rangeClosed(1, 100)
			.boxed()
			.flatMap(
					a->
					IntStream.rangeClosed(a, 100)
					.filter(b->(a*a+b*b)%1==0)
					.mapToObj(b->new int[]{a,b,a*a+b*b})
					).limit(5).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		abc();
	}

}
