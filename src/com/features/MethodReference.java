package com.features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String... commandLine)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		// type1
		// using lambda expression
		list.forEach( val -> System.out.println(val));
		
		//type2
		list.forEach( System.out::println); // reference of a method
											// when method refrence is given in java 8 it should be specified with ::
											//from mehod() reference java has introduced to pass by reference
		
	}
}
