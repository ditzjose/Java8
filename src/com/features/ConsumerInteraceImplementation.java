package com.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import static java.lang.System.*;
public class ConsumerInteraceImplementation {
	
	public static void main(String... commandLineArgument)
	{
		List<Integer> list = Arrays.asList(new Integer[] {12,34,23});
		// Consumer is a functional interface
		
		// One way of doing it
		out.println("Type 1:  ");
		Consumer<Integer> consumer =  new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				out.println(t);
			}
		};
		
		list.forEach(consumer);
		
		out.println("Type 2(Using lamda expression on funcional interface):  ");
		list.forEach((val) -> out.println(val));
		
		out.println("Type 3(Method reference on fubction interface as only one paramter is only there):  ");
		
		list.forEach(out::println);

	}
}
