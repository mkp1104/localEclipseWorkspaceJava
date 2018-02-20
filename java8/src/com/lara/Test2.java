package com.lara;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	List<String> items = new ArrayList<>();
	items.add("A");
	items.add("B");
	items.add("C");
	items.add("D");
	items.add("E");

	//java8
	//lambda
	//Output : A,B,C,D,E
	
//	items.forEach(item->System.out.println(item));
	
	//java7
	for(String item : items){
		System.out.println(item);
	}
}
}
