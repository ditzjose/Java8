package com.features;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;
import java.util.List;


/*
 	-Method() -> a method is defined with a contetxt of a class
 	-function()-> has no other context other than into input parameter to produce the output
 	-so pure functions is not present in java
 	- everything declared in java are methods()
 	
 */
public class MethodReferenceFeatures {
	public static void main(String... command) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Integer intVal1 = new Integer(23);
		Integer intVal2 = new Integer(34);
		//case1
		Integer res1 = intVal1.compareTo(intVal2);
		//case2
					String name = intVal1.getClass().getName();
					System.out.println("Name of the class:  "+name);
					//intVal1.getClass() return Class object
		Method compareMethod = intVal1.getClass().getMethod ("compareTo" , intVal1.getClass());
		Integer res2 = (Integer) compareMethod.invoke(intVal1, intVal2);
		System.out.println(res1+"  :  "+res2);
		// Case 3:
		//Method reference
		//Function<inputType,outputType>
		Function<Integer, Integer> function =  intVal1::compareTo;		
		Integer res3 = function.apply(intVal2);
		System.out.println(res3);
		/*
		 	Reflection:
		 			-It is possible to inspect class, method,interface at run time without even knowing the name of the class or 
		 			the method.
		 			-the ability to inspect is not exactly what Rflection does but abilty to modify at run time.
		 			-Relecetion is useul bcaz you dont have to know everything during compile time, hence make the code more dynamic.
		 			
		 */
		
		// One more scenario to use Method refereences
		 List<Integer> list2 =  Arrays.asList(new Integer[] {1,2,3,4,5});
		 
		 list2.forEach(MethodReferenceFeatures::display);
	}
	
	static void  display(int val)
	{
		System.out.println("the value is :  "+val);
		
	}
}
