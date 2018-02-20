package com.byteBybyte.package1;

public class FizzBuzz {
	public static void main(String[] args) {
//		int[] x = new int[]{1,2,3,4,5,6,24,15};
//		for (int i : x) {
//			FizzBuzz(i);
//		}
		FizzBuzz(20);
	}
	public static void FizzBuzz(int x) {
	    for (int i = 1; i <= x; i++) {
	    	if (i % 3 == 0 && i % 5 == 0) {
	    		System.out.println("FizzBuzz");
	    	}
        else if (i % 3 == 0) {
        	System.out.println("Fizz");
        }
        else if (i % 5 == 0) {
        	System.out.println("Buzz");
        }
        else 
        	System.out.println(i);
	    	}
}

}
	