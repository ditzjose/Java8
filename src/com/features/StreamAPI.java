package com.features;

import java.util.*;
public class StreamAPI {
	public static void main(String... commnadLineArgument)
	{		
		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5}); 
		
		for(Integer i : list)
		{
			System.out.println(i);
		}// External Iteration(Fetching of values are been done outside)
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// INternal Iteration (can use something called as stream api)
		
		System.out.println("By using external iteration....");
		list.forEach(i -> System.out.println("The value of internal iteration is :  "+ i));
		
		Person p1 = new Person();
		p1.setName("Ditz JOse");
		Person p2 = new Person();
		p2.setName("Tittu JOse");
		Person p3 = new Person();
		p3.setName("Jose Augustine");
		Person p4 = new Person();
		p4.setName("Abey Micheal");
		
		List<Person> ll = new LinkedList<Person>();
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		
		// for internal iteration
		
		ll.forEach(val -> System.out.println(val.getName()));
		
	}
}

class Person
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}