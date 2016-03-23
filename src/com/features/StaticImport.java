package com.features;
import static java.lang.System.*;
import static com.staticiport.StaticExplain.*;

public class StaticImport {
	
	// To access all the static member in a class then static import classnname;
	public static void main(String... cla)
	{
		//case1:
		System.out.println("Case 1");
		//case2: for the direct access of static member
		out.println("Case 2");
		// Disadvantage is the code readabilty will go
		// It is programmer friendly
		// when we have to use only then static member of the class use static import
		// Customized static import
		// Over using static import will make code unreadable and unmaintainable
		display();
		
	}
}
