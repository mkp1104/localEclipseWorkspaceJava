package com.lara;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
public static void main(String[] args) {
//	Map<String, Integer> items = new HashMap<>();
	Map<String, Integer> items = new HashMap<>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);
//	items.put("m", 50.9);
	
//java 7
	for (Map.Entry<String, Integer> entry : items.entrySet()) {
		System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
	}
// java 8	
	items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

	items.forEach((k,v)->{
		System.out.println("Item : " + k + " Count : " + v);
//		for (int i = 0; i < args.length; i++) {
//			
//		}
//		it's like block.
		if("E".equals(k)){
			System.out.println("Hello E");
		}
	});
}
}
