package com.features;

import java.util.LinkedList;
import static java.lang.System.*;

interface CountLessAge {
	boolean countLesser(User user, User given);
}

class User {
	private Integer age;

	public User(Integer age) {
		this.age = age;
	}

	boolean isAgeLesser(User user) {
		return (this.age < user.age);
	}
}

public class MethodReference3 {
	 Integer count(User[] arr,CountLessAge countFunc , User given)
	{ // Method reference can be done for non static methods also
		Integer co = 0;
		for(Integer i = 0 ; i < arr.length ; i++)
		{
			if(countFunc.countLesser(arr[i],given))
			{
				co++;
			}
		}
		return co;
	}
	public static void main(String... cmd) {
		User[] arr = { new User(30),new User(27),new User(28),new User(31)};
		Integer val = new MethodReference3().count(arr,User::isAgeLesser, new User(30));
		out.println(val);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		list.forEach(out::println);
	}
}
