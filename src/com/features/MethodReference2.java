package com.features;

// create a functional interface
interface MyFunc {
	boolean func(HighTemp v1, HighTemp v2);
}
// (obj1,obj2) -> { return obj1.islessThan(obj2);}
// HighTemp::isLessThan
class HighTemp {
	Integer temp;

	HighTemp(Integer temp) {
		this.temp = temp;
	}

	boolean isLessThan(HighTemp obj) {
		return (this.temp < obj.temp);
	}
}

public class MethodReference2 {
	static Integer counter(HighTemp[] arr, MyFunc func, HighTemp given) {
		Integer count = 0;
		for (Integer i = 0; i < arr.length; i++) {
			if (func.func(arr[i], given)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String... commandLine) {
		HighTemp[] arr = { new HighTemp(90), new HighTemp(91),
				new HighTemp(92), new HighTemp(93), new HighTemp(100),
				new HighTemp(99), new HighTemp(95), new HighTemp(94) };
		// Find out how many object are less than given temp
		HighTemp given = new HighTemp(94);
		System.out.println(counter(arr, (v1, v2) -> {
			return v1.isLessThan(v2);
		}, given));
		System.out.println(counter(arr, HighTemp::isLessThan, given));
	}
}
