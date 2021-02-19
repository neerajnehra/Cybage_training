package com.cybage;

public class WrapperExample {
	public static void main(String[] args) {
		System.out.println("Wrapper Classes exmaple");
		
		//Integer ob1 = new Integer(100);		// The constructor Integer(int) is deprecated since version 9
		Integer ob1 = 100;						//It will create object and place in string pool if object is not created
		Integer ob2 = 200;						//It will reuse object from string pool
		//If value of ob2 is changed, it will over write the address value not 
		System.out.println(ob1.MAX_VALUE);
		System.out.println(ob1.MIN_VALUE);
		
		Integer sum = ob1 + ob2;				//auto-unboxing--extracting the values from objects.
		//ob1 + ob2 --> auto-unboxing ==> 12445
		//12445 need to be converted into object(sum) --> auto-boxing
		//Integer sum = ob1.intValue() + ob2.intValue();	//auto-unboxing will happen but its not done by JVM.				//
		Integer sum1 = ob1 + ob2;
		System.out.println(sum);
	}
}
