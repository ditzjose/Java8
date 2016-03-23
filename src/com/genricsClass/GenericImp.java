package com.genricsClass;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class GenericImp<T> {
	@SuppressWarnings("unchecked")
	public static void main(String... cma)
	{
		//is as same as List<Integer> list1 = new LinkedList<Integer>()
		//List<Integer> list1 = new LinkedList<>();
		/*
		 	There are namin convention to be followed for generics types:
		 		K - Key
		 		V - value
		 		T - type
		 		
		 */
		//Representation:
		//name is string and age is int
		Person<String, Integer> p1 = new Person<>();
		// name as int and age as Sting
		// This representation is happening bcaz for Strict type checking
		Person<Integer,String> p2 = new Person<>();
		
		p1.setName("Ditz Jose");
		p1.setAge(23);
		
		p2.setName(23);
		p2.setAge("23");
		
		@SuppressWarnings("rawtypes")
		Person p3 = new Person();
		//here type checking wont happen
		p3.setName("Tittu Jose");
		p3.setAge("24");
		
		out.println(p1.getName()+"  "+p1.getAge());
		out.println(p2.getName()+"  "+p2.getAge());
		out.println(p3.getName()+"  "+p3.getAge());
		displayList(Arrays.asList(12,23.23,"Ditz JOse",'C'));
		// Arrays api can be used to compare to arrays, for binary searching, for foreach iteration to happen
		new GenericImp<Double>().sum(Arrays.asList(12.23,23.34,34.456));
		// Method refernce
		
		String valString1 = new String("Ditz");
		String valString2 = new String("JOse");
		Function<String, Integer> func =  valString1::compareTo;
		Integer val = func.apply(valString2);
		out.println("Comapre String value is :  "+val);
	}
	
	void sum(List<T> val)
	{
		//Double sum = 0.0 ;
		val.forEach((values)->{});
	}
	// Wild card in generics
	// can use super meaning class and its parent classes accepted
	// extends all the clas that extends the perticular class only accepted
	static void displayList(List<? extends Object> obj) // here Type checking i not happening
	{
		// by using Method Reference
		obj.forEach(System.out::println);
		// Uising lamda expression
		obj.forEach((val)->{out.println("value is :  "+val);});
	}
}
