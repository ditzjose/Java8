package com.genricsClass;

public class Person<T1,T2> {
	private T1 name;
	private T2 age;
	public T1 getName() {
		return name;
	}
	public void setName(T1 name) {
		this.name = name;
	}
	public T2 getAge() {
		return age;
	}
	public void setAge(T2 age) {
		this.age = age;
	}
	
	
}
