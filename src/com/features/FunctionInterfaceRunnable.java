package com.features;
class Operation
{
	void func1()
	{
		for(int i=0 ; i < 2000 ; i++)
		{
			System.out.println("func1: "+i);
		}
	}
	
	void func2()
	{
		for(int i=0 ; i < 2000 ; i++)
		{
			System.out.println("func2: "+i);
		}
	}
}


public class FunctionInterfaceRunnable {
	public static void main(String... cla)
	{
		Thread t1 = new Thread(()->{new Operation().func1();});
		t1.start();
		new Operation().func2();
		
		
	}
}
