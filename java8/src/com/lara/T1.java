package com.lara;
import java.util.*;
public class T1 
{
public static void main(String[] args) 
{
	final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
	System.out.println(friends);
	for(String name : friends) {
		System.out.println(name);
		}
	friends.stream()
	.map(name -> name.toUpperCase())
	.forEach(name -> System.out.print(name + " "));
	System.out.println();

}
}
