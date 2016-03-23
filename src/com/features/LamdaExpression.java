package com.features;

interface Executable {
	int execute(int val,int val2);
	// Interface with only one method() is called functional interface.
	// In function interface lambda expression could be implemented
	// Example for functional interface are: Comparable interface used in TreeSet() and Runnable interface
	
}

class Runner {
	void run(Executable e) {
		e.execute(999,234);
	}
}

public class LamdaExpression {
	public static void main(String... commandLA) {
		//One way of Doing it
		int localVariable = 23;
		new Runner().run(new Executable() {
			
			@Override
			public int execute(int val,int val2) {
				System.out.println("function of abstract execute() ... ");
				//localVariable =99; localvariable value cannot be changd inside annonymous objects
				return 100+val+val2+localVariable;
				}

		});
		
		// second way of doing it is by using labda expression
		/*
		 lambda expression: () -> {} 
		 new Runner().run(()->{
			System.out.println("function of abstract execute() ... ");
		}); 
		  */
		// We dont have to specify the type in the parameter list
		@SuppressWarnings("unused")
		int d = 10;
		new Runner().run((val,val2)->{
			System.out.println("function of abstract execute() ... ");
			//localVariable = 999; // change of localvariable or overridding local variable is not allowed inside annonymous class
			//int d = 99; // compilation error redeclaration of local variable is not allowed
						// overriding of variable is not possible in LE
						//bcaz the block doesnt give the scope
						// hence basically duplication of variable is actually happening
			return 100+val+val2+localVariable;
		});
		
	}
}
