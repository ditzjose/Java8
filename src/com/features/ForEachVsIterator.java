package com.features;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ForEachVsIterator {
	public static void main(String... commandLineArgu)
	{
		int length = 0;
		
		List<Integer> list = new LinkedList<Integer>();
		while(length < 4)
		{
			list.add(length);
			length++;
		}
		// two ways of interation
		//foreach loop
		System.out.println("First way :  ");
		for(Integer val : list)
		{
			System.out.println(val);
			//list.add(val); // here cuncurrent modification exception will be thrown
							// throw new ConcurrentModificationException()
							// to avoid CucurrentHashMap it is best to Use CucurrentHashMap()
							// It is thread safe while write is happening
							// It is fail safe,While itertiona copy is said to be made of the DS and in the copy chnages will be made
							// Hence new ConcurrentModificationException() will not happen
							
		}
		
		// Second way of iteration being done
		System.out.println("Second way :  ");
		Iterator<Integer> it =  list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// Thrid way using internal iteration
		System.out.println("Thrid way :  ");
		// lambda expression ()->{} is donoted
		// Used for annonymous emthods()
		list.forEach((val) -> {System.out.println(val);});
		
		/*
		  				foreach(Enhanced for loop)										Iterator
		  			-Programmer frindly as it is very easy to be used 			-Its not programmer friendly.
		  			-new ConcurrentModificationException() will happen			-new ConcurrentModificationException() will not happen
		  			if any changes are done while the iteration is going on		even while change is being made
		  */
			
		// To avoid ConcurrentModificationException() using ConcurrentModificationException( 

		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                myMap.put("4", "4"); // here exception will be thrown is HashMap()
            }
        }
		
	}
}
