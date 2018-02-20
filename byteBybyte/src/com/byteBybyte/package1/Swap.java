package com.byteBybyte.package1;

public class Swap {
	int x = 10;
	int y = 20;
	
//	public void swap(int x, int y) {
//	    x = x + y;
//	    y = x - y;
//	    x = x - y;
//	}
public static void main(String[] args) {
	
	Swap swap = new Swap();
	System.out.println("x : " + swap.x);
	System.out.println("y : " + swap.y);
	swap.swap(swap);
	System.out.println("x : " + swap.x);
	System.out.println("y : " + swap.y);
	
}
	public void swap(Swap swap) {
		swap.x = swap.x ^ swap.y;
		swap.y = swap.x ^ swap.y;
		swap.x = swap.x ^ swap.y;
	}
}
